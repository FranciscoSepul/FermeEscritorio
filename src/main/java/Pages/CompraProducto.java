/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pages;

import Ferme.Dao.DetalleVentaDao;
import Ferme.Dao.EmpleadoDao;
import Ferme.Dao.ProductoDao;
import Ferme.Dto.DetalleVentas;
import Ferme.Dto.Empleado;
import Ferme.Dto.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class CompraProducto extends javax.swing.JFrame {

    List<Producto> prod;
    Producto prodd = new Producto();
    DetalleVentas dtvent = new DetalleVentas();
    DetalleVentaDao dvdao = new DetalleVentaDao();
    Empleado emp = new Empleado();
    Connection con = null;
    PreparedStatement pst = null;
    boolean resp = false;
    boolean resp2 = false;

    public CompraProducto(String rut ,int idProd) {
        initComponents();

        emp = new EmpleadoDao().BuscarEmpleado(rut);
        prodd = new ProductoDao().BuscarProducto(idProd);
           
    }

    private CompraProducto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCantidad = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        btnCompra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cantidad:");

        btnCompra.setText("Compra");
        btnCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel1)
                        .addGap(69, 69, 69)
                        .addComponent(jCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(btnCompra)))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(84, 84, 84)
                .addComponent(btnCompra)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompraActionPerformed
        prod = new ProductoDao().Listar();
        int id = prodd.id;
        int preciouni = 0;
        int stock= 0;
        System.out.println("id "+ id);
        if (id==1) {
            preciouni = prod.get(0).precioUni;
        } else if (id==2) {
            preciouni = prod.get(1).precioUni;
        }
        int cantidad = (Integer) jCantidad.getValue();
        int total = cantidad * preciouni;
                if (id==1) {
            stock = prod.get(0).stock;
        } else if (id==2) {
            stock = prod.get(1).stock;
        }
        int stockF = stock - cantidad;

        String fecha = new SimpleDateFormat("dd-MM-yyyy").format(new Date());

        try {
            resp = new DetalleVentaDao().agregarDetalleVenta(id, fecha, cantidad, total);
            resp2 = new DetalleVentaDao().actualizarStock(id, stockF);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al agregar detalle venta");
        }
        if (resp != false) {
            JOptionPane.showMessageDialog(null, "Se agrego la venta");
            String rut = emp.runEmpleado;
            Home home1 = new Home(rut);
            home1.setVisible(true);
            this.setVisible(false);
        }

    }//GEN-LAST:event_btnCompraActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CompraProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CompraProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CompraProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CompraProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CompraProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCompra;
    private javax.swing.JSpinner jCantidad;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
