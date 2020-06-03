/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pages;

import Ferme.Dao.EmpleadoDao;
import Ferme.Dto.Empleado;
import Ferme.Dao.ProductoDao;
import Ferme.Dto.Producto;
import FermeEscritoriodb.Conexion;
import java.sql.Connection;
import javax.swing.ButtonGroup;
import java.sql.*;
import javax.swing.JOptionPane;

public class NuevoVendedor extends javax.swing.JFrame {

    Empleado emp = new Empleado();
    Connection con = null;
    PreparedStatement pst = null;

    public NuevoVendedor(String id) {
        initComponents();
        emp = new EmpleadoDao().BuscarEmpleado(id);
        this.setLocationRelativeTo(null);
        setTitle("Ferme");
        setLocationRelativeTo(null);
        setResizable(false);

        //Logo        
        rsscalelabel.RSScaleLabel.setScaleLabel(Lbl1, "src\\main\\java\\FermePage\\Imagenes\\FERME Logo.png");

        //Imagen button 
        rsscalelabel.RSScaleLabel.setScaleLabel(lblSearch, "src\\main\\java\\FermePage\\Imagenes\\search.png");

        //Seleccinar logo segun sexo y cargo
        if (emp.sexo == 0) {
            rsscalelabel.RSScaleLabel.setScaleLabel(LblUsers, "src\\main\\java\\FermePage\\Imagenes\\userFemale.png");
            this.BtnNuevoV.setVisible(false);
            this.btnGraficos.setVisible(false);
            this.btnVentasRealiza.setVisible(false);
            this.btnPrecioStock.setVisible(false);
            if (emp.IDCARGO == 2) {
                rsscalelabel.RSScaleLabel.setScaleLabel(LblUsers, "src\\main\\java\\FermePage\\Imagenes\\userAdmin.png");
                this.BtnNuevoV.setVisible(true);
                this.btnGraficos.setVisible(true);
                this.btnVentasRealiza.setVisible(true);
                this.btnPrecioStock.setVisible(true);
            }
        } else {
            rsscalelabel.RSScaleLabel.setScaleLabel(LblUsers, "src\\main\\java\\FermePage\\Imagenes\\userMen.png");
            this.BtnNuevoV.setVisible(false);
            this.btnGraficos.setVisible(false);
            this.btnVentasRealiza.setVisible(false);
            this.btnPrecioStock.setVisible(false);
        }
        //pintar datos usuario en cmb 
//        txtNombre.setText(emp.nombre);

        //Función de radio button una sola opción
        ButtonGroup bg = new ButtonGroup();
        bg.add(rbtnFemenino);
        bg.add(rbtnMasculino);
        bg.add(rbtnVendedor);
        bg.add(rbtnBodeguero);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Lbl1 = new javax.swing.JLabel();
        lblSearch = new javax.swing.JLabel();
        LblUser = new javax.swing.JLabel();
        LblUsers = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        rSMTextFull1 = new rojeru_san.RSMTextFull();
        PanelBody = new javax.swing.JPanel();
        BtnNuevoV = new javax.swing.JButton();
        btnAsistencia = new javax.swing.JButton();
        BtnHome = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        btnVentasRealiza = new javax.swing.JButton();
        btnPrecioStock = new javax.swing.JButton();
        btnGraficos = new javax.swing.JButton();
        btnCatalogo = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jTitulo = new javax.swing.JLabel();
        jNombre = new javax.swing.JLabel();
        jApellido = new javax.swing.JLabel();
        jRun = new javax.swing.JLabel();
        jSexo = new javax.swing.JLabel();
        jCorreo = new javax.swing.JLabel();
        jContrasena = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        txtApellido = new javax.swing.JTextField();
        txtRun = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JTextField();
        rbtnFemenino = new javax.swing.JRadioButton();
        rbtnMasculino = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        txtDv = new javax.swing.JTextField();
        jCargo = new javax.swing.JLabel();
        rbtnVendedor = new javax.swing.JRadioButton();
        rbtnBodeguero = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jButton2.setBackground(new java.awt.Color(102, 102, 255));
        jButton2.setText("Mi Cuenta");

        rSMTextFull1.setBackground(new java.awt.Color(153, 153, 153));
        rSMTextFull1.setPlaceholder("Buscar");

        PanelBody.setBackground(new java.awt.Color(255, 255, 255));
        PanelBody.setPreferredSize(new java.awt.Dimension(651, 300));

        BtnNuevoV.setText("Nuevo Vendedor");

        btnAsistencia.setText("Asistencia Personal");

        BtnHome.setText("Home Ventas");
        BtnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHomeActionPerformed(evt);
            }
        });

        jButton7.setText("Stock de productos");

        btnVentasRealiza.setText("Ventas Realizadas");
        btnVentasRealiza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasRealizaActionPerformed(evt);
            }
        });

        btnPrecioStock.setText("Cambiar Precio o Stock de productos");

        btnGraficos.setText("Graficos de ventas");
        btnGraficos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficosActionPerformed(evt);
            }
        });

        btnCatalogo.setText("Catalogo");
        btnCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatalogoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBodyLayout = new javax.swing.GroupLayout(PanelBody);
        PanelBody.setLayout(PanelBodyLayout);
        PanelBodyLayout.setHorizontalGroup(
            PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBodyLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCatalogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnNuevoV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAsistencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVentasRealiza)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPrecioStock)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGraficos)
                .addGap(35, 35, 35))
        );
        PanelBodyLayout.setVerticalGroup(
            PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBodyLayout.createSequentialGroup()
                .addGroup(PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnNuevoV)
                    .addComponent(btnAsistencia)
                    .addComponent(BtnHome)
                    .addComponent(jButton7)
                    .addComponent(btnVentasRealiza)
                    .addComponent(btnPrecioStock)
                    .addComponent(btnGraficos)
                    .addComponent(btnCatalogo))
                .addGap(390, 390, 390))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rSMTextFull1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(LblUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(LblUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap())
            .addComponent(PanelBody, javax.swing.GroupLayout.DEFAULT_SIZE, 1104, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(LblUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jButton2))
                    .addComponent(Lbl1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblUsers, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(rSMTextFull1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelBody, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTitulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTitulo.setText("Agregar Empleado:");

        jNombre.setText("Nombre:");

        jApellido.setText("Apellido:");

        jRun.setText("Run:");

        jSexo.setText("Sexo: ");

        jCorreo.setText("Correo: ");

        jContrasena.setText("Contraseña:");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        rbtnFemenino.setText("Femenino");

        rbtnMasculino.setText("Masculino");

        jLabel1.setText("-");

        jCargo.setText("Cargo:");

        rbtnVendedor.setText("Vendedor");

        rbtnBodeguero.setText("Bodeguero");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCargo)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRun)
                            .addComponent(jApellido)
                            .addComponent(jSexo)
                            .addComponent(jCorreo))
                        .addComponent(jNombre))
                    .addComponent(jContrasena))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtApellido)
                                    .addComponent(txtRun)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtContrasena, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDv, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(rbtnFemenino)
                                .addGap(18, 18, 18)
                                .addComponent(rbtnMasculino))
                            .addComponent(jTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregar)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(rbtnVendedor)
                                .addGap(18, 18, 18)
                                .addComponent(rbtnBodeguero)))))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jTitulo)
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNombre)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jApellido)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRun)
                    .addComponent(txtRun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtDv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSexo)
                    .addComponent(rbtnFemenino)
                    .addComponent(rbtnMasculino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCorreo)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jContrasena))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCargo)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbtnVendedor)
                        .addComponent(rbtnBodeguero)))
                .addGap(18, 18, 18)
                .addComponent(btnAgregar)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVentasRealizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasRealizaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVentasRealizaActionPerformed

    private void BtnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHomeActionPerformed
        // se redirecciona al home
        String rut = emp.runEmpleado;
        Home hom = new Home(rut);
        hom.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnHomeActionPerformed

    private void btnGraficosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficosActionPerformed
        //redirecciona a grafico de ventas
        String rut = emp.runEmpleado;
        GraficoDeVentas graf = new GraficoDeVentas(rut);
        graf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnGraficosActionPerformed

    private void btnCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatalogoActionPerformed
        //redirecciona a la pagina de catalogo
        String rut = emp.runEmpleado;
        Catalogo cat = new Catalogo(rut);
        cat.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCatalogoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        con = Conexion.getConexion();
        String sql = "Insert into Empleado(idcargo,iddireccion,idsucursal,estado,runempleado,"
                + "                         sexoe,digitoverif,nombree,apellido,correoemple,contrasena) values(?,?,?,?,?,?,?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            if (rbtnVendedor.isSelected() )  {
                pst.setInt(1, 1);
            }else {
                pst.setInt(1, 3);
            }
            pst.setInt(2, 2);
            //en sucursal más adelante poner un button con las opciones de sucursal
            pst.setInt(3, 1);
            pst.setInt(4, 1);
            pst.setString(5, txtRun.getText());
            if (rbtnMasculino.isSelected() ) {
                pst.setInt(6, 0);    
            }else {
                pst.setInt(6, 1);
            }
            pst.setString(7, txtDv.getText());
            pst.setString(8, jTextField1.getText());
            pst.setString(9, txtApellido.getText());
            pst.setString(10, txtCorreo.getText());
            pst.setString(11, txtContrasena.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Agregadp empleado correctamente");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

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
            java.util.logging.Logger.getLogger(NuevoVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoVendedor("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnHome;
    private javax.swing.JButton BtnNuevoV;
    private javax.swing.JLabel Lbl1;
    private javax.swing.JLabel LblUser;
    private javax.swing.JLabel LblUsers;
    public javax.swing.JPanel PanelBody;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAsistencia;
    private javax.swing.JButton btnCatalogo;
    private javax.swing.JButton btnGraficos;
    private javax.swing.JButton btnPrecioStock;
    private javax.swing.JButton btnVentasRealiza;
    private javax.swing.JLabel jApellido;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jCargo;
    private javax.swing.JLabel jContrasena;
    private javax.swing.JLabel jCorreo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jNombre;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel4;
    private javax.swing.JLabel jRun;
    private javax.swing.JLabel jSexo;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jTitulo;
    private javax.swing.JLabel lblSearch;
    private rojeru_san.RSMTextFull rSMTextFull1;
    private javax.swing.JRadioButton rbtnBodeguero;
    private javax.swing.JRadioButton rbtnFemenino;
    private javax.swing.JRadioButton rbtnMasculino;
    private javax.swing.JRadioButton rbtnVendedor;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtContrasena;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDv;
    private javax.swing.JTextField txtRun;
    // End of variables declaration//GEN-END:variables
}
