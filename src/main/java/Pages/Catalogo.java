package Pages;

import Ferme.Dao.*;
import Ferme.Dto.*;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class Catalogo extends javax.swing.JFrame {

    Empleado emp = new Empleado();
    List<Producto> prod;
    FormaDePago fmp = new FormaDePago();
    Ventas vent = new Ventas();
    Cliente cli = new Cliente();
    DetalleVentas dtv = new DetalleVentas();
    Retiro ret = new Retiro();
    Documentos doc = new Documentos();
    TipoDocumento tdoc = new TipoDocumento();
    DefaultTableModel model;
    String nombreColumna = "";
    String datoModificado = "";
    boolean respuesta = false;

    public Catalogo(String id) {
        initComponents();
        emp = new EmpleadoDao().BuscarEmpleado(id);
        prod = new ProductoDao().Listar();
        
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
            this.BtnNuevoE.setVisible(false);
            this.btnGraficos.setVisible(false);
            this.btnVentasRealiza.setVisible(false);
            this.btnPrecioStock.setVisible(false);
            if (emp.IDCARGO == 2) {
                rsscalelabel.RSScaleLabel.setScaleLabel(LblUsers, "src\\main\\java\\FermePage\\Imagenes\\userAdmin.png");
                this.BtnNuevoE.setVisible(true);
                this.btnGraficos.setVisible(true);
                this.btnVentasRealiza.setVisible(true);
                this.btnPrecioStock.setVisible(true);
            }
        } else {
            rsscalelabel.RSScaleLabel.setScaleLabel(LblUsers, "src\\main\\java\\FermePage\\Imagenes\\userMen.png");
            this.BtnNuevoE.setVisible(false);
            this.btnGraficos.setVisible(false);
            this.btnVentasRealiza.setVisible(false);
            this.btnPrecioStock.setVisible(false);
        }

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Lbl1 = new javax.swing.JLabel();
        lblSearch = new javax.swing.JLabel();
        LblUser = new javax.swing.JLabel();
        LblUsers = new javax.swing.JLabel();
        btnCuentaP = new javax.swing.JButton();
        rSMTextFull1 = new rojeru_san.RSMTextFull();
        PanelBody = new javax.swing.JPanel();
        BtnNuevoE = new javax.swing.JButton();
        btnAsistencia = new javax.swing.JButton();
        BtnHome = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        btnVentasRealiza = new javax.swing.JButton();
        btnPrecioStock = new javax.swing.JButton();
        btnGraficos = new javax.swing.JButton();
        btnCatalogo = new javax.swing.JButton();
        btnExcel = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        btnCuentaP.setBackground(new java.awt.Color(102, 102, 255));
        btnCuentaP.setText("Mi Cuenta");
        btnCuentaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuentaPActionPerformed(evt);
            }
        });

        rSMTextFull1.setBackground(new java.awt.Color(153, 153, 153));
        rSMTextFull1.setPlaceholder("Buscar");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LblUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCuentaP)
                .addContainerGap())
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
                        .addComponent(btnCuentaP))
                    .addComponent(Lbl1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(LblUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rSMTextFull1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))))
        );

        PanelBody.setBackground(new java.awt.Color(255, 255, 255));
        PanelBody.setPreferredSize(new java.awt.Dimension(651, 300));

        BtnNuevoE.setText("Nuevo Empleado");
        BtnNuevoE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNuevoEActionPerformed(evt);
            }
        });

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
                .addContainerGap()
                .addComponent(BtnHome)
                .addGap(9, 9, 9)
                .addComponent(btnCatalogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnNuevoE)
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
                .addContainerGap(18, Short.MAX_VALUE))
        );
        PanelBodyLayout.setVerticalGroup(
            PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBodyLayout.createSequentialGroup()
                .addGroup(PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnNuevoE)
                    .addComponent(btnAsistencia)
                    .addComponent(BtnHome)
                    .addComponent(jButton7)
                    .addComponent(btnVentasRealiza)
                    .addComponent(btnPrecioStock)
                    .addComponent(btnGraficos)
                    .addComponent(btnCatalogo))
                .addContainerGap())
        );

        btnExcel.setBackground(new java.awt.Color(255, 255, 255));
        btnExcel.setForeground(new java.awt.Color(0, 0, 255));
        btnExcel.setText("prueba");
        btnExcel.setBorder(null);
        btnExcel.setBorderPainted(false);
        btnExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 553, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 371, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PanelBody, javax.swing.GroupLayout.DEFAULT_SIZE, 1177, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(btnExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(PanelBody, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExcel)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVentasRealizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasRealizaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVentasRealizaActionPerformed

    private void BtnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHomeActionPerformed
        String rut = emp.runEmpleado;
        Home hom = new Home(rut);
        hom.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnHomeActionPerformed

    private void btnExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcelActionPerformed
    }//GEN-LAST:event_btnExcelActionPerformed

    private void btnCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatalogoActionPerformed
        //redirecciona a la pagina de catalogo
        String rut = emp.runEmpleado;
        Catalogo cat = new Catalogo(rut);
        cat.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCatalogoActionPerformed

    private void btnCuentaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuentaPActionPerformed
        //redirecciona a Asistencia Personal
        String rut = emp.runEmpleado;
        AsistenciaPersonal apersonal = new AsistenciaPersonal(rut);
        apersonal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCuentaPActionPerformed

    private void BtnNuevoEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevoEActionPerformed
        // Redirecciona a nuevo Empleado
        String rut = emp.runEmpleado;
        NuevoEmpleado ne = new NuevoEmpleado(rut);
        ne.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnNuevoEActionPerformed

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
            java.util.logging.Logger.getLogger(Catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new Catalogo("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnHome;
    private javax.swing.JButton BtnNuevoE;
    private javax.swing.JLabel Lbl1;
    private javax.swing.JLabel LblUser;
    private javax.swing.JLabel LblUsers;
    public javax.swing.JPanel PanelBody;
    private javax.swing.JButton btnAsistencia;
    private javax.swing.JButton btnCatalogo;
    private javax.swing.JButton btnCuentaP;
    private javax.swing.JButton btnExcel;
    private javax.swing.JButton btnGraficos;
    private javax.swing.JButton btnPrecioStock;
    private javax.swing.JButton btnVentasRealiza;
    private javax.swing.JButton jButton7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblSearch;
    private rojeru_san.RSMTextFull rSMTextFull1;
    // End of variables declaration//GEN-END:variables
}
