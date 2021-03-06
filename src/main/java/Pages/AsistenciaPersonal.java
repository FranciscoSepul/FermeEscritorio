package Pages;

import Ferme.Dao.EmpleadoDao;
import Ferme.Dto.Empleado;


public class AsistenciaPersonal extends javax.swing.JFrame {

    Empleado emp = new Empleado();

    public AsistenciaPersonal(String id) {
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
        //pintar datos usuario en cmb 


        String nombre = emp.nombre;
        String apellido = emp.apellido;
        String correo = emp.correo;
        String cargo = null;

        switch (emp.IDCARGO) {
            case 1:
                cargo = "Vendedor";
                break;
            case 2:
                cargo = "Administrador";
                break;
            case 3:
                cargo = "Bodeguero";
                break;
            default:
                break;
        }

        jNombre.setText("Bienvenido: " + nombre.concat(" ").concat(apellido));
        jCorreo.setText("Correo: " + correo);
        jCargo.setText("Cargo: " + cargo);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSButtonBeanInfo1 = new rojeru_san.RSButtonBeanInfo();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Lbl1 = new javax.swing.JLabel();
        lblSearch = new javax.swing.JLabel();
        LblUser = new javax.swing.JLabel();
        LblUsers = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        rSMTextFull1 = new rojeru_san.RSMTextFull();
        PanelBody = new javax.swing.JPanel();
        BtnNuevoE = new javax.swing.JButton();
        btnAsistencia = new javax.swing.JButton();
        BtnHome = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        btnVentasRealiza = new javax.swing.JButton();
        btnPrecioStock = new javax.swing.JButton();
        btnGraficos = new javax.swing.JButton();
        btnCatalogo1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jNombre = new javax.swing.JLabel();
        jCorreo = new javax.swing.JLabel();
        jCargo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jButton2.setBackground(new java.awt.Color(102, 102, 255));
        jButton2.setText("Mi Cuenta");

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
                .addComponent(jButton2)
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
                        .addComponent(jButton2))
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
        btnPrecioStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrecioStockActionPerformed(evt);
            }
        });

        btnGraficos.setText("Graficos de ventas");
        btnGraficos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficosActionPerformed(evt);
            }
        });

        btnCatalogo1.setText("Catalogo");
        btnCatalogo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatalogo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBodyLayout = new javax.swing.GroupLayout(PanelBody);
        PanelBody.setLayout(PanelBodyLayout);
        PanelBodyLayout.setHorizontalGroup(
            PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBodyLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(BtnHome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCatalogo1)
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
                .addContainerGap())
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
                    .addComponent(btnCatalogo1))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jNombre.setText(" ");

        jCorreo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCorreo.setText(" ");

        jCargo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCargo.setText(" ");

        jButton1.setText("EditarMisDatos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(238, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                    .addComponent(jCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(238, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCorreo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCargo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(62, 62, 62))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelBody, javax.swing.GroupLayout.DEFAULT_SIZE, 1174, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelBody, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
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

    private void btnCatalogo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatalogo1ActionPerformed
        //redirecciona a la pagina de catalogo
        String rut = emp.runEmpleado;
        Catalogo cat = new Catalogo(rut);
        cat.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCatalogo1ActionPerformed

    private void BtnNuevoEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevoEActionPerformed
        // Redirecciona a nuevo Empleado
        String rut = emp.runEmpleado;
        NuevoEmpleado ne = new NuevoEmpleado(rut);
        ne.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnNuevoEActionPerformed

    private void btnPrecioStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrecioStockActionPerformed
        //Redirecciona a Precio y Stock
        String rut = emp.runEmpleado;
        PrecioYstock psk = new PrecioYstock(rut);
        psk.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPrecioStockActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String rut = emp.runEmpleado;
        EditarUsuario usua=new EditarUsuario(rut);
        usua.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AsistenciaPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AsistenciaPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AsistenciaPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AsistenciaPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AsistenciaPersonal("").setVisible(true);
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
    private javax.swing.JButton btnCatalogo1;
    private javax.swing.JButton btnGraficos;
    private javax.swing.JButton btnPrecioStock;
    private javax.swing.JButton btnVentasRealiza;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jCargo;
    private javax.swing.JLabel jCorreo;
    private javax.swing.JLabel jNombre;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblSearch;
    private rojeru_san.RSButtonBeanInfo rSButtonBeanInfo1;
    private rojeru_san.RSMTextFull rSMTextFull1;
    // End of variables declaration//GEN-END:variables
}
