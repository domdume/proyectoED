package interfaz;

import javax.swing.JOptionPane;
import sistemaMatriculacion.*;

public class EstudianteGUI extends javax.swing.JFrame {

    GUI interfaz;
    
    Materia materia;
    Estudiante estudiante;
    
    public EstudianteGUI(Estudiante estudiante, GUI interfaz) {
        initComponents();
        this.setLocationRelativeTo(null);
        
        inscripcionNombre.setVisible(false);
        inscripcionCodigo.setVisible(false);

        this.estudiante = estudiante;
        this.interfaz = interfaz;
    }
    
    public void siClicked(){
        
        if (estudiante.cantidadSolicitudes < estudiante.materiasSolicitadas.length) {
            estudiante.agregarMateriaSolicitada(materia);
            interfaz.colaMatriculacion.agregarSolicitud(estudiante);
            JOptionPane.showMessageDialog(this, "Se ha enviado la solicitud");
            noClicked();
        } else {
            JOptionPane.showMessageDialog(null, "No puede solicitar más materias");
        }

    }
    
    public void noClicked(){
        nombreTxt.setText("");
        codigoTxt.setText("");
        
        foundByCodigo.setText(" ");
        foundByNombre.setText(" ");
        inscripcionCodigo.setVisible(false);
        inscripcionNombre.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        porCodigoButton = new javax.swing.JLabel();
        porNombreButton = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        menu = new javax.swing.JTabbedPane();
        cero = new javax.swing.JPanel();
        porCodigoPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        codigoTxt = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        foundByCodigo = new javax.swing.JLabel();
        inscripcionCodigo = new javax.swing.JPanel();
        pregunta = new javax.swing.JLabel();
        si = new javax.swing.JLabel();
        no = new javax.swing.JLabel();
        buscarCodigo = new javax.swing.JLabel();
        porNombre = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        nombreTxt = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        foundByNombre = new javax.swing.JLabel();
        inscripcionNombre = new javax.swing.JPanel();
        pregunta1 = new javax.swing.JLabel();
        si1 = new javax.swing.JLabel();
        no1 = new javax.swing.JLabel();
        buscarNombre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(14, 34, 64));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("CHICKEN Pie Height", 0, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(204, 204, 204));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("MENÚ");
        jPanel1.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 230, 87));

        porCodigoButton.setFont(new java.awt.Font("CHICKEN Pie Height", 0, 16)); // NOI18N
        porCodigoButton.setForeground(new java.awt.Color(153, 153, 153));
        porCodigoButton.setText("1. BUSCAR POR CÓDIGO");
        porCodigoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        porCodigoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                porCodigoButtonMouseClicked(evt);
            }
        });
        jPanel1.add(porCodigoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 180, -1));

        porNombreButton.setFont(new java.awt.Font("CHICKEN Pie Height", 0, 16)); // NOI18N
        porNombreButton.setForeground(new java.awt.Color(153, 153, 153));
        porNombreButton.setText("2. BUSCAR POR NOMBRE");
        porNombreButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        porNombreButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                porNombreButtonMouseClicked(evt);
            }
        });
        jPanel1.add(porNombreButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 180, -1));

        exit.setFont(new java.awt.Font("CHICKEN Pie Height", 0, 16)); // NOI18N
        exit.setForeground(new java.awt.Color(153, 153, 153));
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("cERRAR SESIÓN");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 110, -1));

        menu.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        javax.swing.GroupLayout ceroLayout = new javax.swing.GroupLayout(cero);
        cero.setLayout(ceroLayout);
        ceroLayout.setHorizontalGroup(
            ceroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );
        ceroLayout.setVerticalGroup(
            ceroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 513, Short.MAX_VALUE)
        );

        menu.addTab("default", cero);

        jLabel1.setFont(new java.awt.Font("CHICKEN Pie Height", 0, 14)); // NOI18N
        jLabel1.setText("INGRESE EL CÓDIGO DE LA MATERIA:");

        codigoTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel2.setFont(new java.awt.Font("CHICKEN Pie Height", 0, 14)); // NOI18N
        jLabel2.setText("MATERIAS ENCONTRADAS:");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        foundByCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foundByCodigo.setText(" ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(foundByCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(foundByCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pregunta.setFont(new java.awt.Font("CHICKEN Pie Height", 0, 14)); // NOI18N
        pregunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pregunta.setText("¿DESEA INSCRIBIRSE?");

        si.setFont(new java.awt.Font("CHICKEN Pie Height", 0, 12)); // NOI18N
        si.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        si.setText("SI");
        si.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        si.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        si.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                siMouseClicked(evt);
            }
        });

        no.setFont(new java.awt.Font("CHICKEN Pie Height", 0, 12)); // NOI18N
        no.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        no.setText("NO");
        no.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        no.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        no.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                noMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout inscripcionCodigoLayout = new javax.swing.GroupLayout(inscripcionCodigo);
        inscripcionCodigo.setLayout(inscripcionCodigoLayout);
        inscripcionCodigoLayout.setHorizontalGroup(
            inscripcionCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inscripcionCodigoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pregunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(inscripcionCodigoLayout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(si, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(no, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(198, Short.MAX_VALUE))
        );
        inscripcionCodigoLayout.setVerticalGroup(
            inscripcionCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inscripcionCodigoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(pregunta)
                .addGap(18, 18, 18)
                .addGroup(inscripcionCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(si)
                    .addComponent(no))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        buscarCodigo.setFont(new java.awt.Font("CHICKEN Pie Height", 0, 12)); // NOI18N
        buscarCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buscarCodigo.setText("BUSCAR");
        buscarCodigo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buscarCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarCodigoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout porCodigoPanelLayout = new javax.swing.GroupLayout(porCodigoPanel);
        porCodigoPanel.setLayout(porCodigoPanelLayout);
        porCodigoPanelLayout.setHorizontalGroup(
            porCodigoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(porCodigoPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(porCodigoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(porCodigoPanelLayout.createSequentialGroup()
                        .addGroup(porCodigoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                            .addGroup(porCodigoPanelLayout.createSequentialGroup()
                                .addComponent(codigoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buscarCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(105, 105, 105))
                    .addComponent(inscripcionCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        porCodigoPanelLayout.setVerticalGroup(
            porCodigoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(porCodigoPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(porCodigoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarCodigo))
                .addGap(63, 63, 63)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(inscripcionCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        menu.addTab("codigo", porCodigoPanel);

        porNombre.setPreferredSize(new java.awt.Dimension(575, 500));

        jLabel3.setFont(new java.awt.Font("CHICKEN Pie Height", 0, 14)); // NOI18N
        jLabel3.setText("INGRESE EL NOMBRE DE LA MATERIA:");

        nombreTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombreTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel4.setFont(new java.awt.Font("CHICKEN Pie Height", 0, 14)); // NOI18N
        jLabel4.setText("MATERIAS ENCONTRADAS:");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        foundByNombre.setForeground(new java.awt.Color(153, 153, 153));
        foundByNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foundByNombre.setText(" ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(foundByNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(foundByNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pregunta1.setFont(new java.awt.Font("CHICKEN Pie Height", 0, 14)); // NOI18N
        pregunta1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pregunta1.setText("¿DESEA INSCRIBIRSE?");

        si1.setFont(new java.awt.Font("CHICKEN Pie Height", 0, 12)); // NOI18N
        si1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        si1.setText("SI");
        si1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        si1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        si1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                si1MouseClicked(evt);
            }
        });

        no1.setFont(new java.awt.Font("CHICKEN Pie Height", 0, 12)); // NOI18N
        no1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        no1.setText("NO");
        no1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        no1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        no1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                no1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout inscripcionNombreLayout = new javax.swing.GroupLayout(inscripcionNombre);
        inscripcionNombre.setLayout(inscripcionNombreLayout);
        inscripcionNombreLayout.setHorizontalGroup(
            inscripcionNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inscripcionNombreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pregunta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(inscripcionNombreLayout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(si1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(no1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(201, Short.MAX_VALUE))
        );
        inscripcionNombreLayout.setVerticalGroup(
            inscripcionNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inscripcionNombreLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(pregunta1)
                .addGap(18, 18, 18)
                .addGroup(inscripcionNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(si1)
                    .addComponent(no1))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        buscarNombre.setFont(new java.awt.Font("CHICKEN Pie Height", 0, 12)); // NOI18N
        buscarNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buscarNombre.setText("Buscar");
        buscarNombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buscarNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarNombreMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout porNombreLayout = new javax.swing.GroupLayout(porNombre);
        porNombre.setLayout(porNombreLayout);
        porNombreLayout.setHorizontalGroup(
            porNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(porNombreLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(porNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inscripcionNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                    .addGroup(porNombreLayout.createSequentialGroup()
                        .addComponent(nombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buscarNombre)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        porNombreLayout.setVerticalGroup(
            porNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(porNombreLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(porNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarNombre))
                .addGap(63, 63, 63)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(inscripcionNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        menu.addTab("nombre", porNombre);

        jPanel1.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 580, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void porCodigoButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_porCodigoButtonMouseClicked
        menu.setSelectedIndex(1);
    }//GEN-LAST:event_porCodigoButtonMouseClicked
    private void porNombreButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_porNombreButtonMouseClicked
        menu.setSelectedIndex(2);
    }//GEN-LAST:event_porNombreButtonMouseClicked

    private void buscarNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarNombreMouseClicked
        String nombre = nombreTxt.getText();
        Materia materia = interfaz.listaMaterias.buscarPorNombre(nombre);
        
        if (materia == null) {
            foundByNombre.setText("Materia no encontrada");
        
        } else if (materia != null) {
            foundByNombre.setText(materia.getNombre() + "   |   " + materia.getCodigo());
            inscripcionNombre.setVisible(true);
        }
    }//GEN-LAST:event_buscarNombreMouseClicked
    private void buscarCodigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarCodigoMouseClicked
        String codigo = codigoTxt.getText();
        materia = interfaz.listaMaterias.buscarPorCodigo(codigo);
        
        if (materia == null) {
            foundByCodigo.setText("Materia no encontrada");
        
        } else if (materia != null) {
            foundByCodigo.setText(materia.getNombre() + "   |   " + materia.getCodigo());
            inscripcionCodigo.setVisible(true);
        }
    }//GEN-LAST:event_buscarCodigoMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        interfaz.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_exitMouseClicked
    private void siMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_siMouseClicked
        siClicked();
    }//GEN-LAST:event_siMouseClicked
    private void noMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noMouseClicked
        noClicked();
    }//GEN-LAST:event_noMouseClicked
    private void si1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_si1MouseClicked
        siClicked();
    }//GEN-LAST:event_si1MouseClicked
    private void no1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_no1MouseClicked
        noClicked();
    }//GEN-LAST:event_no1MouseClicked
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel buscarCodigo;
    private javax.swing.JLabel buscarNombre;
    private javax.swing.JPanel cero;
    private javax.swing.JTextField codigoTxt;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel foundByCodigo;
    private javax.swing.JLabel foundByNombre;
    private javax.swing.JPanel inscripcionCodigo;
    private javax.swing.JPanel inscripcionNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane menu;
    private javax.swing.JLabel no;
    private javax.swing.JLabel no1;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JLabel porCodigoButton;
    private javax.swing.JPanel porCodigoPanel;
    private javax.swing.JPanel porNombre;
    private javax.swing.JLabel porNombreButton;
    private javax.swing.JLabel pregunta;
    private javax.swing.JLabel pregunta1;
    private javax.swing.JLabel si;
    private javax.swing.JLabel si1;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
