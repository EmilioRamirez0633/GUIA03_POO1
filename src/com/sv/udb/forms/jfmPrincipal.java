/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.forms;
import com.sv.udb.clases.Configuraciones;
import com.sv.udb.clases.Gasolina;
import com.sv.udb.clases.Valores;
import com.sv.udb.clases.Valoresconf;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Estudiante
 */

public class jfmPrincipal extends javax.swing.JFrame {

    public class Imagen extends javax.swing.JPanel {
        public Imagen() {
        this.setSize(200,280 ); //se selecciona el tamaño del panel
        }
        //Se crea un método cuyo parámetro debe ser un objeto Graphics
        public void paint(Graphics grafico) {
        Dimension height = getSize();
        //Se selecciona la imagen que tenemos en el paquete de la //ruta del programa
        ImageIcon Img = new ImageIcon(getClass().getResource("/com/sv/udb/imagenes/tanque.jpg")); 
        //se dibuja la imagen que tenemos en el paquete Images //dentro de un panel
        grafico.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);
        setOpaque(false);
        super.paintComponent(grafico);
        }
    }
    /**
     * Creates new form jfmPrincipal
     */
    List<Valores> Actual;
    List<Valoresconf> Actualconf;
    Valoresconf datos = new Valoresconf();
    private String tipoGas;
    private double galoR=0,galoE=0,galoD=0,pGaloR=0,pGaloE=0,pGaloD=0;
    //variable para saber cuales radiobutton estan seleccionados
    int combustible=0, metodo=0;
    //variables de control de porcentaje
    double porR=0, porD=0, porE=0;
    public jfmPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        cargarGas();
        cargarPrecios();
        radios();
    }
    private void cargarGas()
    {
        try
        {
            
            Gasolina obje = new Gasolina();
            Actual = new ArrayList<>();
            this.Actual = obje.getData();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Surgio un error en la lectura del csv");
        }
    }
    private void cargarPrecios()
    {
        Actualconf= null;
        try
        {
            Configuraciones obje = new Configuraciones();
            Actualconf = new ArrayList<>();
            this.Actualconf = obje.getData();
            for(Valoresconf temp : obje.getData())
            {
                lblpreR.setText(temp.getPrecioR());
                lblpreD.setText(temp.getPrecioD());
                lblpreE.setText(temp.getPrecioE());
                galoR = Double.parseDouble(temp.getGalonesR());
                galoD = Double.parseDouble(temp.getGalonesD());
                galoE = Double.parseDouble(temp.getGalonesE());
                pGaloR = Double.parseDouble(temp.getPrecioR());
                pGaloD = Double.parseDouble(temp.getPrecioD());
                pGaloE = Double.parseDouble(temp.getPrecioE());
                
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Surgio un error en la lectura del csv de configuraciones" + e);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn1 = new javax.swing.ButtonGroup();
        btgtipoPago = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rdbregular = new javax.swing.JRadioButton();
        rdbdiesel = new javax.swing.JRadioButton();
        rdbespecial = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lblpreE = new javax.swing.JLabel();
        lblpreD = new javax.swing.JLabel();
        lblpreR = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtnombreCliente = new javax.swing.JTextField();
        rdbgalones = new javax.swing.JRadioButton();
        rdbdolares = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        lblmonto = new javax.swing.JLabel();
        txtmontoPago = new javax.swing.JTextField();
        btnrealizar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jpdisponible = new javax.swing.JPanel();
        lblporcentajeRestante = new javax.swing.JLabel();
        lblporcentajeRestante1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(0, 204, 204));
        jLabel1.setFont(new java.awt.Font("Consolas", 2, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BIENVENIDOS/AS");
        jLabel1.setToolTipText("");
        jLabel1.setOpaque(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Combustibles", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 2, 14))); // NOI18N

        btn1.add(rdbregular);
        rdbregular.setSelected(true);
        rdbregular.setText("Regular");
        rdbregular.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rdbregularItemStateChanged(evt);
            }
        });
        rdbregular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdbregularMouseClicked(evt);
            }
        });

        btn1.add(rdbdiesel);
        rdbdiesel.setText("Diesel");
        rdbdiesel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rdbdieselItemStateChanged(evt);
            }
        });

        btn1.add(rdbespecial);
        rdbespecial.setFont(new java.awt.Font("Consolas", 3, 12)); // NOI18N
        rdbespecial.setText("Especial");
        rdbespecial.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rdbespecialItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(rdbregular)
                .addGap(33, 33, 33)
                .addComponent(rdbdiesel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rdbespecial)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbregular)
                    .addComponent(rdbdiesel)
                    .addComponent(rdbespecial))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Detalles", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 2, 14))); // NOI18N
        jPanel2.setInheritsPopupMenu(true);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Precios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 2, 14))); // NOI18N

        lblpreE.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        lblpreE.setText("2.64");

        lblpreD.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        lblpreD.setText("2.64");

        lblpreR.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        lblpreR.setText("2.64");

        jLabel2.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel2.setText("Precio Regular:");

        jLabel6.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel6.setText("Precio Diesel:");

        jLabel4.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel4.setText("Precio Especial:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 225, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addComponent(jLabel4)
                        .addComponent(jLabel2))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblpreR)
                        .addComponent(lblpreE)
                        .addComponent(lblpreD))
                    .addContainerGap(24, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 104, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(6, 6, 6)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(lblpreR))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(lblpreD))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(lblpreE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 2, 14))); // NOI18N
        jPanel3.setInheritsPopupMenu(true);

        jLabel3.setFont(new java.awt.Font("Consolas", 2, 14)); // NOI18N
        jLabel3.setText("Nombre:");

        txtnombreCliente.setFont(new java.awt.Font("Consolas", 2, 14)); // NOI18N

        btgtipoPago.add(rdbgalones);
        rdbgalones.setSelected(true);
        rdbgalones.setText("Galones");
        rdbgalones.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rdbgalonesItemStateChanged(evt);
            }
        });
        rdbgalones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdbgalonesMouseClicked(evt);
            }
        });

        btgtipoPago.add(rdbdolares);
        rdbdolares.setText("Dolares");
        rdbdolares.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rdbdolaresItemStateChanged(evt);
            }
        });
        rdbdolares.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdbdolaresMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Consolas", 2, 14)); // NOI18N
        jLabel10.setText("Metodo Venta:");

        lblmonto.setFont(new java.awt.Font("Consolas", 2, 14)); // NOI18N
        lblmonto.setText("Monto:");

        txtmontoPago.setFont(new java.awt.Font("Consolas", 2, 14)); // NOI18N

        btnrealizar.setText("Comprar");
        btnrealizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrealizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtmontoPago, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblmonto)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtnombreCliente)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(44, 44, 44)
                                .addComponent(rdbgalones)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                .addComponent(rdbdolares)
                                .addGap(24, 24, 24))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnrealizar)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel3)
                .addGap(3, 3, 3)
                .addComponent(txtnombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbgalones)
                    .addComponent(rdbdolares)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblmonto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtmontoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnrealizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Disponibilidad", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 2, 14))); // NOI18N
        jPanel5.setInheritsPopupMenu(true);

        jpdisponible.setPreferredSize(new java.awt.Dimension(180, 300));

        lblporcentajeRestante.setFont(new java.awt.Font("Consolas", 3, 33)); // NOI18N
        lblporcentajeRestante.setText("100");

        lblporcentajeRestante1.setFont(new java.awt.Font("Consolas", 3, 33)); // NOI18N
        lblporcentajeRestante1.setText("%");

        javax.swing.GroupLayout jpdisponibleLayout = new javax.swing.GroupLayout(jpdisponible);
        jpdisponible.setLayout(jpdisponibleLayout);
        jpdisponibleLayout.setHorizontalGroup(
            jpdisponibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpdisponibleLayout.createSequentialGroup()
                .addGroup(jpdisponibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpdisponibleLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(lblporcentajeRestante))
                    .addGroup(jpdisponibleLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(lblporcentajeRestante1)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jpdisponibleLayout.setVerticalGroup(
            jpdisponibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpdisponibleLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblporcentajeRestante, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblporcentajeRestante1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpdisponible, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpdisponible, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdbregularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdbregularMouseClicked
        //
    }//GEN-LAST:event_rdbregularMouseClicked

    private void radios()
    {
        if(this.rdbregular.isSelected()==true)
        {
            Imagen Imagen = new Imagen();
        jpdisponible.add(Imagen);
        jpdisponible.repaint();
        tipoGas="Regular";
        porR = ((galoR/5000)*100);
        porR = Redondear(porR);
        lblporcentajeRestante.setText(String.valueOf(porR));
        combustible =1;
        }
        if(this.rdbespecial.isSelected()==true)
        {
            Imagen Imagen = new Imagen();
        jpdisponible.add(Imagen);
        jpdisponible.repaint();
        tipoGas="Especial";
        porE = ((galoE/5000)*100);
        porE = Redondear(porE);
        lblporcentajeRestante.setText(String.valueOf(porE));
        combustible=3;
        }
        if(this.rdbdiesel.isSelected()==true)
        {
            Imagen Imagen = new Imagen();
        jpdisponible.add(Imagen);
        jpdisponible.repaint();
        tipoGas="Diesel";
        porD = ((galoD/5000)*100);
        porD = Redondear(porD);
        lblporcentajeRestante.setText(String.valueOf(porD));
        combustible=2;
        
        }
        if(rdbgalones.isSelected() == true)
        {
            metodo=1;
        }
        if(rdbdolares.isSelected() == true)
        {
             metodo = 2;
        }
    }
    private void rdbregularItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdbregularItemStateChanged
        radios();
        
    }//GEN-LAST:event_rdbregularItemStateChanged

    public static double Redondear(double numero)
    {
          int cifras=(int) Math.pow(10,2);
          return Math.rint(numero*cifras)/cifras;
    }
    private void rdbgalonesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdbgalonesItemStateChanged
        radios();
    }//GEN-LAST:event_rdbgalonesItemStateChanged

    private void rdbgalonesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdbgalonesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbgalonesMouseClicked

    private void rdbdolaresItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdbdolaresItemStateChanged
        radios();
    }//GEN-LAST:event_rdbdolaresItemStateChanged

    private void rdbdolaresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdbdolaresMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbdolaresMouseClicked

    private void btnrealizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrealizarActionPerformed
        try
        {
            if(metodo != 0 && combustible != 0 && !txtmontoPago.getText().trim().isEmpty() && !txtnombreCliente.getText().trim().isEmpty())
            {
            String nom;
            int verificar=0;
            double monto=0;
            monto= Double.parseDouble(txtmontoPago.getText());
            nom = String.valueOf(txtnombreCliente.getText());
                if(metodo == 1)
                {
                    switch(combustible)
                    {
                        case 1: 
                            if(monto <= galoR)
                            {
                                galoR -= monto;
                                verificar=1;
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(this, "galones insuficientes para realizar esta compra");
                                txtmontoPago.setText("");
                                txtmontoPago.requestFocus();
                            }                            
                            break;
                        case 2: 
                            if(monto <= galoD)
                            {
                                galoD -= monto;
                                verificar=1;
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(this, "galones insuficientes para realizar esta compra");
                                txtmontoPago.setText("");
                                txtmontoPago.requestFocus();
                            }     
                            break;
                        case 3: 
                            if(monto <= galoE)
                            {
                                galoE -= monto;
                                verificar=1;
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(this, "galones insuficientes para realizar esta compra");
                                txtmontoPago.setText("");
                                txtmontoPago.requestFocus();
                            }     
                            break;
                    }
                }
                 if(metodo == 2)
                {
                    switch(combustible)
                    {
                        case 1: 
                            monto = (monto/pGaloR);
                            monto = Redondear(monto);
                            if(monto <= galoR)
                            {
                                galoR -= monto;
                                verificar=1;
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(this, "galones insuficientes para realizar esta compra");
                                txtmontoPago.setText("");
                                txtmontoPago.requestFocus();
                            }                            
                            break;
                        case 2: 
                            monto = (monto/pGaloD);
                            monto = Redondear(monto);
                            if(monto <= galoD)
                            {
                                galoD -= monto;
                                verificar=1;
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(this, "galones insuficientes para realizar esta compra");
                                txtmontoPago.setText("");
                                txtmontoPago.requestFocus();
                            }     
                            break;
                        case 3: 
                            monto = (monto/pGaloE);
                            monto = Redondear(monto);
                            if(monto <= galoE)
                            {
                                galoE -= monto;
                                verificar=1;
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(this, "galones insuficientes para realizar esta compra");
                                txtmontoPago.setText("");
                                txtmontoPago.requestFocus();
                            }     
                            break;
                    }
                }
                if(verificar==1)
                {
                    Valores Agregar = new Valores(tipoGas,String.valueOf(monto),nom );
                    Actual.add(Agregar);
                    Gasolina obj = new Gasolina();
                    obj.Actualizar(Actual);    
                    Actualconf.remove(0);
                    Valoresconf modificar = new Valoresconf(String.valueOf(pGaloR),String.valueOf(pGaloE), String.valueOf(pGaloD),String.valueOf(galoR),String.valueOf(galoE),String.valueOf(galoD));
                    Actualconf.add(0, modificar);
                    Configuraciones obj2 = new Configuraciones();
                    obj2.Actualizar(Actualconf);
                    JOptionPane.showMessageDialog(this, "Compra realizada con exito");
                    txtmontoPago.setText("");
                    txtnombreCliente.setText("");
                    txtnombreCliente.requestFocus();
                    
                    cargarGas();
                    cargarPrecios();
                    radios();
                }
                else
                {
                    
                }
                
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Seleecione todos los datos necesarios");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Ocurrio un problema "+ e);
        }
    }//GEN-LAST:event_btnrealizarActionPerformed

    private void rdbdieselItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdbdieselItemStateChanged
        radios();
    }//GEN-LAST:event_rdbdieselItemStateChanged

    private void rdbespecialItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdbespecialItemStateChanged
    radios();
    }//GEN-LAST:event_rdbespecialItemStateChanged

    
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
            java.util.logging.Logger.getLogger(jfmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgtipoPago;
    private javax.swing.ButtonGroup btn1;
    private javax.swing.JButton btnrealizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jpdisponible;
    private javax.swing.JLabel lblmonto;
    private javax.swing.JLabel lblporcentajeRestante;
    private javax.swing.JLabel lblporcentajeRestante1;
    private javax.swing.JLabel lblpreD;
    private javax.swing.JLabel lblpreE;
    private javax.swing.JLabel lblpreR;
    private javax.swing.JRadioButton rdbdiesel;
    private javax.swing.JRadioButton rdbdolares;
    private javax.swing.JRadioButton rdbespecial;
    private javax.swing.JRadioButton rdbgalones;
    private javax.swing.JRadioButton rdbregular;
    private javax.swing.JTextField txtmontoPago;
    private javax.swing.JTextField txtnombreCliente;
    // End of variables declaration//GEN-END:variables
}
