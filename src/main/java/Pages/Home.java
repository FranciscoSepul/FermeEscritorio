package Pages;

import Ferme.Dao.*;
import Ferme.Dto.Empleado;
import Ferme.Dto.Producto;
import java.util.*;

public class Home extends javax.swing.JFrame {

    int contador = 0;
    int cont = 0;
    Empleado emp = new Empleado();
    List<Producto> prod;
    int idp;

    public Home(String id) {
        initComponents();
        emp = new EmpleadoDao().BuscarEmpleado(id);
        prod = new ProductoDao().Listar();

        this.setLocationRelativeTo(null);
        setTitle("Ferme");
        setLocationRelativeTo(null);
        setResizable(false);
        int contab = prod.size();
        //Logo        
        rsscalelabel.RSScaleLabel.setScaleLabel(Lbl1, "src\\main\\java\\FermePage\\Imagenes\\FERME Logo.png");

        //Imagen button 
        rsscalelabel.RSScaleLabel.setScaleLabel(lblSearch, "src\\main\\java\\FermePage\\Imagenes\\search.png");

        //imegen que se cambia 
        //panel de imagenes con movimiento
        Timer timer;
        TimerTask imagen;

        imagen = new TimerTask() {
            @Override
            public void run() {
                switch (contador) {
                    case 0:
                        rsscalelabel.RSScaleLabel.setScaleLabel(TimerImage, prod.get(0).rutaDoc);
                        txtDesc.setText(prod.get(0).nombre);
                        txtPrecio.setText("$ " + prod.get(0).precioUni);
                        contador = (contab > 1) ? 1 : 0;
                        break;

                    case 1:
                        rsscalelabel.RSScaleLabel.setScaleLabel(TimerImage, prod.get(1).rutaDoc);
                        txtDesc.setText(prod.get(1).nombre);
                        txtPrecio.setText("$ " + prod.get(1).precioUni);
                        contador = (contab > 2) ? 2 : 0;
                        break;
                    case 2:
                        rsscalelabel.RSScaleLabel.setScaleLabel(TimerImage, prod.get(2).rutaDoc);
                        txtDesc.setText(prod.get(2).nombre);
                        txtPrecio.setText("$ " + prod.get(2).precioUni);
                        contador = -0;
                        break;
                }

            }

        };
        timer = new Timer();
        timer.scheduleAtFixedRate(imagen, 1000, 2000);

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
        //pintar datos de los productos mas vendidos nota: Esta es la parte mas indecente a mi consideracion del codigo home de ser posible cambiar a posterior 
        //con mas tiempo
        if (contab >= 1) {
            rsscalelabel.RSScaleLabel.setScaleLabel(loMasV1, prod.get(0).rutaDoc);
            DescripLo.setText(prod.get(0).nombre);
            idp = prod.get(0).id; //nuevo agregado
            

//        txtPrecio.setText("$ " + prod.get(0).precioUni);
        }
        if (contab >= 2) {
            rsscalelabel.RSScaleLabel.setScaleLabel(loMasV2, prod.get(1).rutaDoc);
            DescripLo1.setText(prod.get(1).nombre);
            //idp = prod.get(1).id; //nuevo agregado
       

//        txtPrecio.setText("$ " + prod.get(0).precioUni);
        }
        if (contab >= 3) {
            System.out.println("entro al 2");
            rsscalelabel.RSScaleLabel.setScaleLabel(loMasV3, prod.get(2).rutaDoc);
            DescripLo2.setText(prod.get(2).nombre);
//        txtPrecio.setText("$ " + prod.get(0).precioUni);
        }
        if (contab >= 4) {
            rsscalelabel.RSScaleLabel.setScaleLabel(loMasV4, prod.get(3).rutaDoc);
            DescripLo3.setText(prod.get(3).nombre);
//        txtPrecio.setText("$ " + prod.get(0).precioUni);
        }
        if (contab == 5) {
            rsscalelabel.RSScaleLabel.setScaleLabel(loMasV4, prod.get(4).rutaDoc);
//        DescripLo4.setText(prod.get(4).nombre);
//        txtPrecio.setText("$ " + prod.get(0).precioUni);
        }
        
        int stock = prod.get(0).stock;
        int stock2 = prod.get(1).stock;
        lblStock.setText("Stock: "+stock);
        lblStock2.setText("Stock: "+stock2);

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
        TimerImage = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JLabel();
        txtDesc = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        loMasV4 = new javax.swing.JLabel();
        loMasV1 = new javax.swing.JLabel();
        loMasV2 = new javax.swing.JLabel();
        loMasV3 = new javax.swing.JLabel();
        DescripLo = new javax.swing.JLabel();
        DescripLo1 = new javax.swing.JLabel();
        DescripLo2 = new javax.swing.JLabel();
        DescripLo3 = new javax.swing.JLabel();
        PrecioLo = new javax.swing.JLabel();
        PrecioLo1 = new javax.swing.JLabel();
        PrecioLo2 = new javax.swing.JLabel();
        PrecioLo3 = new javax.swing.JLabel();
        btnComprar1 = new javax.swing.JButton();
        btnComprar2 = new javax.swing.JButton();
        lblStock = new javax.swing.JLabel();
        lblStock2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
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
        btnAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsistenciaActionPerformed(evt);
            }
        });

        BtnHome.setText("Home Ventas");

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

        btnCatalogo.setText("Catálogo");
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
                .addGap(35, 35, 35)
                .addComponent(BtnHome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGap(59, 59, 59))
        );
        PanelBodyLayout.setVerticalGroup(
            PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBodyLayout.createSequentialGroup()
                .addGroup(PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAsistencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVentasRealiza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPrecioStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGraficos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnNuevoE)
                    .addComponent(btnCatalogo))
                .addContainerGap())
        );

        txtPrecio.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecio.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(0, 0, 255));

        txtDesc.setBackground(new java.awt.Color(255, 255, 255));
        txtDesc.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtDesc.setForeground(new java.awt.Color(0, 0, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Los más vistos");

        loMasV1.setBackground(new java.awt.Color(255, 255, 255));

        btnComprar1.setText("Comprar");
        btnComprar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprar1ActionPerformed(evt);
            }
        });

        btnComprar2.setText("Comprar");
        btnComprar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PanelBody, javax.swing.GroupLayout.PREFERRED_SIZE, 1203, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(loMasV1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(DescripLo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(PrecioLo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(55, 55, 55)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(PrecioLo3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(234, 234, 234)
                                                .addComponent(PrecioLo1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(DescripLo1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(btnComprar2)
                                                    .addComponent(lblStock2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(127, 127, 127)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(PrecioLo2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(DescripLo3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(153, 153, 153)
                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(loMasV4, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(DescripLo2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))))))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(363, 363, 363)
                                        .addComponent(loMasV2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(49, 49, 49))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(TimerImage, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(loMasV3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(63, 63, 63)
                                        .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(80, 80, 80)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnComprar1)
                    .addComponent(lblStock, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelBody, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(TimerImage, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loMasV4, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loMasV3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loMasV1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loMasV2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DescripLo, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DescripLo1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DescripLo2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(DescripLo3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(PrecioLo2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(PrecioLo1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PrecioLo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PrecioLo3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStock, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStock2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnComprar1)
                    .addComponent(btnComprar2))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 7, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVentasRealizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasRealizaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVentasRealizaActionPerformed

    private void btnAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsistenciaActionPerformed
        //nos llevará a la página de asistencia personal con la sesión.
//        String rut = emp.runEmpleado;
//        AsistenciaPersonal apersonal = new AsistenciaPersonal(rut);
//        apersonal.setVisible(true);
//        this.setVisible(false);

    }//GEN-LAST:event_btnAsistenciaActionPerformed

    private void btnPrecioStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrecioStockActionPerformed
        String rut = emp.runEmpleado;
        PrecioYstock pre = new PrecioYstock(rut);
        pre.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPrecioStockActionPerformed

    private void btnCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatalogoActionPerformed
        //redirecciona a la pagina de catalogo
        String rut = emp.runEmpleado;
        Catalogo cat = new Catalogo(rut);
        cat.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCatalogoActionPerformed

    private void btnGraficosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficosActionPerformed
        // Redireccion a grafico de ventas
        String rut = emp.runEmpleado;
        GraficoDeVentas gdv = new GraficoDeVentas(rut);
        gdv.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnGraficosActionPerformed

    private void BtnNuevoEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevoEActionPerformed
        // Redirecciona a nuevo Empleado
        String rut = emp.runEmpleado;
        NuevoEmpleado ne = new NuevoEmpleado(rut);
        ne.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnNuevoEActionPerformed

    private void btnCuentaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuentaPActionPerformed
        //redirecciona a Asistencia Personal
        String rut = emp.runEmpleado;
        AsistenciaPersonal apersonal = new AsistenciaPersonal(rut);
        apersonal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCuentaPActionPerformed

    private void btnComprar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprar1ActionPerformed
        String rut = emp.runEmpleado;
        int idProd = prod.get(0).id;
        System.out.println("id" + idProd);
        CompraProducto lproductos = new CompraProducto(rut, idProd);
        lproductos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnComprar1ActionPerformed

    private void btnComprar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprar2ActionPerformed
        String rut = emp.runEmpleado;
        int idProd = prod.get(1).id;
        System.out.println("id" + idProd);
        CompraProducto lproductos = new CompraProducto(rut, idProd);
        lproductos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnComprar2ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnHome;
    private javax.swing.JButton BtnNuevoE;
    private javax.swing.JLabel DescripLo;
    private javax.swing.JLabel DescripLo1;
    private javax.swing.JLabel DescripLo2;
    private javax.swing.JLabel DescripLo3;
    private javax.swing.JLabel Lbl1;
    private javax.swing.JLabel LblUser;
    private javax.swing.JLabel LblUsers;
    public javax.swing.JPanel PanelBody;
    private javax.swing.JLabel PrecioLo;
    private javax.swing.JLabel PrecioLo1;
    private javax.swing.JLabel PrecioLo2;
    private javax.swing.JLabel PrecioLo3;
    private javax.swing.JLabel TimerImage;
    private javax.swing.JButton btnAsistencia;
    private javax.swing.JButton btnCatalogo;
    private javax.swing.JButton btnComprar1;
    private javax.swing.JButton btnComprar2;
    private javax.swing.JButton btnCuentaP;
    private javax.swing.JButton btnGraficos;
    private javax.swing.JButton btnPrecioStock;
    private javax.swing.JButton btnVentasRealiza;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblStock;
    private javax.swing.JLabel lblStock2;
    private javax.swing.JLabel loMasV1;
    private javax.swing.JLabel loMasV2;
    private javax.swing.JLabel loMasV3;
    private javax.swing.JLabel loMasV4;
    private rojeru_san.RSMTextFull rSMTextFull1;
    private javax.swing.JLabel txtDesc;
    private javax.swing.JLabel txtPrecio;
    // End of variables declaration//GEN-END:variables
}
