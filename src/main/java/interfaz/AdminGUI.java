package interfaz;

import javax.swing.JOptionPane;
import sistemaMatriculacion.*;

public class AdminGUI extends javax.swing.JFrame {

    GUI interfaz;
    NodoDoble temp;
    
    public AdminGUI(GUI interfaz) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.interfaz = interfaz;
        this.temp = interfaz.listaEstudiantes.getCabeza();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        menu = new javax.swing.JTabbedPane();
        cero = new javax.swing.JPanel();
        gestionar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        estudianteGestionTxt = new javax.swing.JTextField();
        codigoUnicoGestionTxt = new javax.swing.JTextField();
        materiaGestionTxt = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        aceptarButton = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        negarButton = new javax.swing.JLabel();
        buscarEstudiante = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombreBusquedaTxt = new javax.swing.JTextField();
        codigoUnicoBusquedaTxt = new javax.swing.JTextField();
        busquedaButton = new javax.swing.JLabel();
        verMatriculados = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        matriculadosTxt = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        verTodos = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nextListaButton = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        anteriorListaButton = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        estudiantesListaTxt = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        nombreListaTxt = new javax.swing.JTextField();
        codigoUnicoListaTxt = new javax.swing.JTextField();
        titulo = new javax.swing.JLabel();
        gestionarButton = new javax.swing.JLabel();
        subtitulo = new javax.swing.JLabel();
        buscarButton = new javax.swing.JLabel();
        verEstudiantesMatriculadosButton = new javax.swing.JLabel();
        verListaButton = new javax.swing.JLabel();
        exitButton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        bg.setBackground(new java.awt.Color(14, 34, 64));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout ceroLayout = new javax.swing.GroupLayout(cero);
        cero.setLayout(ceroLayout);
        ceroLayout.setHorizontalGroup(
            ceroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 585, Short.MAX_VALUE)
        );
        ceroLayout.setVerticalGroup(
            ceroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 503, Short.MAX_VALUE)
        );

        menu.addTab("default", cero);

        jLabel1.setFont(new java.awt.Font("CHICKEN Pie Height", 0, 18)); // NOI18N
        jLabel1.setText("SOLICITUDES DE MATRÍCULA:");

        jLabel9.setFont(new java.awt.Font("CHICKEN Pie Height", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("ESTUDIANTE: ");

        jLabel10.setFont(new java.awt.Font("CHICKEN Pie Height", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("MATERIA: ");

        jLabel11.setFont(new java.awt.Font("CHICKEN Pie Height", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("C. ÚNICO: ");

        estudianteGestionTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        estudianteGestionTxt.setRequestFocusEnabled(false);

        codigoUnicoGestionTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        codigoUnicoGestionTxt.setRequestFocusEnabled(false);

        materiaGestionTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        materiaGestionTxt.setRequestFocusEnabled(false);

        jPanel1.setBackground(new java.awt.Color(0, 255, 102));

        aceptarButton.setBackground(new java.awt.Color(204, 255, 204));
        aceptarButton.setFont(new java.awt.Font("CHICKEN Pie Height", 0, 14)); // NOI18N
        aceptarButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aceptarButton.setText("ACEPTAR");
        aceptarButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        aceptarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aceptarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aceptarButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(aceptarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(aceptarButton))
        );

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));

        negarButton.setFont(new java.awt.Font("CHICKEN Pie Height", 0, 14)); // NOI18N
        negarButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        negarButton.setText("RECHAZAR");
        negarButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        negarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        negarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                negarButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(negarButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(negarButton))
        );

        javax.swing.GroupLayout gestionarLayout = new javax.swing.GroupLayout(gestionar);
        gestionar.setLayout(gestionarLayout);
        gestionarLayout.setHorizontalGroup(
            gestionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gestionarLayout.createSequentialGroup()
                .addGroup(gestionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gestionarLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(gestionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(gestionarLayout.createSequentialGroup()
                                .addGroup(gestionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(gestionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(codigoUnicoGestionTxt)
                                    .addComponent(materiaGestionTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                                    .addComponent(estudianteGestionTxt)))))
                    .addGroup(gestionarLayout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        gestionarLayout.setVerticalGroup(
            gestionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gestionarLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(gestionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(estudianteGestionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(gestionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(codigoUnicoGestionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(gestionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(materiaGestionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(57, 57, 57)
                .addGroup(gestionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(114, Short.MAX_VALUE))
        );

        menu.addTab("gestionar", gestionar);

        jLabel2.setFont(new java.awt.Font("CHICKEN Pie Height", 0, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("BÚSCAR ESTUDIANTE:");

        jLabel3.setFont(new java.awt.Font("CHICKEN Pie Height", 0, 18)); // NOI18N
        jLabel3.setText("NOMBRE DEL ESTUDIANTE:");

        jLabel4.setFont(new java.awt.Font("CHICKEN Pie Height", 0, 18)); // NOI18N
        jLabel4.setText("CÓDIGO ÚNICO:");

        nombreBusquedaTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nombreBusquedaTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nombreBusquedaTxtMouseClicked(evt);
            }
        });

        codigoUnicoBusquedaTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        codigoUnicoBusquedaTxt.setText("Ingrese el código unico para realizar la búsqueda");
        codigoUnicoBusquedaTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                codigoUnicoBusquedaTxtMouseClicked(evt);
            }
        });

        busquedaButton.setFont(new java.awt.Font("CHICKEN Pie Height", 0, 18)); // NOI18N
        busquedaButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        busquedaButton.setText("BUSCAR");
        busquedaButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        busquedaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                busquedaButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout buscarEstudianteLayout = new javax.swing.GroupLayout(buscarEstudiante);
        buscarEstudiante.setLayout(buscarEstudianteLayout);
        buscarEstudianteLayout.setHorizontalGroup(
            buscarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buscarEstudianteLayout.createSequentialGroup()
                .addGroup(buscarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buscarEstudianteLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(buscarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nombreBusquedaTxt)
                            .addComponent(codigoUnicoBusquedaTxt)))
                    .addGroup(buscarEstudianteLayout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(busquedaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        buscarEstudianteLayout.setVerticalGroup(
            buscarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buscarEstudianteLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(nombreBusquedaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(codigoUnicoBusquedaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(busquedaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        menu.addTab("buscar", buscarEstudiante);

        matriculadosTxt.setColumns(20);
        matriculadosTxt.setRows(5);
        matriculadosTxt.setRequestFocusEnabled(false);
        jScrollPane2.setViewportView(matriculadosTxt);

        jLabel15.setFont(new java.awt.Font("CHICKEN Pie Height", 0, 24)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("ESTUDIANTES CON MATRÍCULA ACEPTADA: ");

        javax.swing.GroupLayout verMatriculadosLayout = new javax.swing.GroupLayout(verMatriculados);
        verMatriculados.setLayout(verMatriculadosLayout);
        verMatriculadosLayout.setHorizontalGroup(
            verMatriculadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, verMatriculadosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(verMatriculadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2))
                .addGap(32, 32, 32))
        );
        verMatriculadosLayout.setVerticalGroup(
            verMatriculadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, verMatriculadosLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        menu.addTab("verMatriculados", verMatriculados);

        jLabel5.setFont(new java.awt.Font("CHICKEN Pie Height", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("ESTUDIANTE: ");

        jLabel6.setFont(new java.awt.Font("CHICKEN Pie Height", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("C. ÚNICO: ");

        nextListaButton.setFont(new java.awt.Font("CHICKEN Pie Height", 0, 14)); // NOI18N
        nextListaButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nextListaButton.setText("SIGUIENTE");
        nextListaButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nextListaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextListaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextListaButtonMouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("CHICKEN Pie Height", 0, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("LISTA DE ESTUDIANTES");

        anteriorListaButton.setFont(new java.awt.Font("CHICKEN Pie Height", 0, 14)); // NOI18N
        anteriorListaButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        anteriorListaButton.setText("ANTERIOR");
        anteriorListaButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        anteriorListaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        anteriorListaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                anteriorListaButtonMouseClicked(evt);
            }
        });

        estudiantesListaTxt.setColumns(20);
        estudiantesListaTxt.setRows(5);
        estudiantesListaTxt.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(estudiantesListaTxt);

        jLabel14.setFont(new java.awt.Font("CHICKEN Pie Height", 0, 24)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("RECORRER LISTA");

        nombreListaTxt.setRequestFocusEnabled(false);

        codigoUnicoListaTxt.setRequestFocusEnabled(false);

        javax.swing.GroupLayout verTodosLayout = new javax.swing.GroupLayout(verTodos);
        verTodos.setLayout(verTodosLayout);
        verTodosLayout.setHorizontalGroup(
            verTodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(verTodosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(verTodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, verTodosLayout.createSequentialGroup()
                        .addGroup(verTodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(verTodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreListaTxt)
                            .addComponent(codigoUnicoListaTxt)))
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32))
            .addGroup(verTodosLayout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(anteriorListaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addComponent(nextListaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(164, Short.MAX_VALUE))
        );
        verTodosLayout.setVerticalGroup(
            verTodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(verTodosLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jLabel14)
                .addGap(28, 28, 28)
                .addGroup(verTodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nombreListaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(verTodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(codigoUnicoListaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(verTodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anteriorListaButton)
                    .addComponent(nextListaButton))
                .addGap(42, 42, 42))
        );

        menu.addTab("verTodos", verTodos);

        bg.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, -30, 590, 530));

        titulo.setFont(new java.awt.Font("CHICKEN Pie Height", 0, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(204, 204, 204));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("MENÚ");
        bg.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 48, 210, 80));

        gestionarButton.setFont(new java.awt.Font("CHICKEN Pie Height", 0, 14)); // NOI18N
        gestionarButton.setForeground(new java.awt.Color(153, 153, 153));
        gestionarButton.setText("1. GESTIONAR MATRÍCULAS");
        gestionarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gestionarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gestionarButtonMouseClicked(evt);
            }
        });
        bg.add(gestionarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 180, -1));

        subtitulo.setFont(new java.awt.Font("CHICKEN Pie Height", 0, 16)); // NOI18N
        subtitulo.setForeground(new java.awt.Color(204, 204, 204));
        subtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitulo.setText("ESTUDIANTES");
        bg.add(subtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 210, 40));

        buscarButton.setFont(new java.awt.Font("CHICKEN Pie Height", 0, 14)); // NOI18N
        buscarButton.setForeground(new java.awt.Color(153, 153, 153));
        buscarButton.setText("2. BUSCAR ESTUDIANTE");
        buscarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarButtonMouseClicked(evt);
            }
        });
        bg.add(buscarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 180, -1));

        verEstudiantesMatriculadosButton.setFont(new java.awt.Font("CHICKEN Pie Height", 0, 14)); // NOI18N
        verEstudiantesMatriculadosButton.setForeground(new java.awt.Color(153, 153, 153));
        verEstudiantesMatriculadosButton.setText("3. VER MATRICULADOS");
        verEstudiantesMatriculadosButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        verEstudiantesMatriculadosButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verEstudiantesMatriculadosButtonMouseClicked(evt);
            }
        });
        bg.add(verEstudiantesMatriculadosButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 180, 20));

        verListaButton.setFont(new java.awt.Font("CHICKEN Pie Height", 0, 14)); // NOI18N
        verListaButton.setForeground(new java.awt.Color(153, 153, 153));
        verListaButton.setText("4. VER LISTA COMPLETA");
        verListaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        verListaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verListaButtonMouseClicked(evt);
            }
        });
        bg.add(verListaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 180, 20));

        exitButton.setFont(new java.awt.Font("CHICKEN Pie Height", 0, 16)); // NOI18N
        exitButton.setForeground(new java.awt.Color(153, 153, 153));
        exitButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitButton.setText("CERRAR SESIÓN");
        exitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonMouseClicked(evt);
            }
        });
        bg.add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // VER GESTIÓN
    private void gestionarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestionarButtonMouseClicked
        mostrarPrimeraSolicitud();
        menu.setSelectedIndex(1);
    }//GEN-LAST:event_gestionarButtonMouseClicked
    private void buscarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarButtonMouseClicked
        nombreBusquedaTxt.setText("");
        codigoUnicoBusquedaTxt.setText("Ingrese el código unico para realizar la búsqueda");
        menu.setSelectedIndex(2);
    }//GEN-LAST:event_buscarButtonMouseClicked
    
    // VER LISTA DE ESTUDIANTES MATRICULADOS
    private void verEstudiantesMatriculadosButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verEstudiantesMatriculadosButtonMouseClicked
        NodoDoble temp = interfaz.listaEstudiantes.getCabeza();
        String estudiantes = "";
        
        while (temp != null) {
            
            if (estaMatriculadoEnAlgunaMateria(temp.estudiante)) {
                String nombre = temp.estudiante.nombre;
                String id = "" + temp.estudiante.id;
                estudiantes += "[" + nombre + ", " + id +"]\n";                
            }
            
            temp = temp.siguiente;
        }
        
        matriculadosTxt.setText(estudiantes);
        menu.setSelectedIndex(3);        
    }//GEN-LAST:event_verEstudiantesMatriculadosButtonMouseClicked
    private boolean estaMatriculadoEnAlgunaMateria(Estudiante estudiante) {
        // Recorre el arreglo de booleanos para verificar si el estudiante está matriculado en alguna materia
        for (boolean matriculado : estudiante.matriculado) {
            if (matriculado) {
                return true; // Si encuentra al menos un `true`, el estudiante está matriculado en alguna materia
            }
        }
        return false; // Si no encuentra ningún `true`, no está matriculado en ninguna materia
    }
    
    // VER LISTA DE TODOS LOS ESTUDIANTES
    private void verListaButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verListaButtonMouseClicked
        NodoDoble temp = interfaz.listaEstudiantes.getCabeza();
        Estudiante primerEstudiante = temp.estudiante;
        
        String estudiantes = "";
        
        while (temp != null) {
            
            String nombre = temp.estudiante.nombre;
            String id = "" + temp.estudiante.id;
            estudiantes += "[" + nombre + ", " + id +"]\n";
            
            temp = temp.siguiente;
        }
        
        estudiantesListaTxt.setText(estudiantes);
        nombreListaTxt.setText(primerEstudiante.nombre);
        codigoUnicoListaTxt.setText("" + primerEstudiante.id);

        menu.setSelectedIndex(4);        
    }//GEN-LAST:event_verListaButtonMouseClicked

    
    // GESTIÓN DE SOLICITUDES
    private void aceptarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceptarButtonMouseClicked
        
        Estudiante solicitud = getPrimeraSolicitud();
        
        if (solicitud == null) {
            return;
        }
        
        if (solicitud.contador > solicitud.materiasSolicitadas.length - 1) {
            setTextNoHaySolicitudes();
            return;
        }
        
        solicitud.matriculado[solicitud.contador] = true;
        JOptionPane.showMessageDialog(this, "La solicitud ha sido ACEPTADA");
        
        if (solicitud.contador == solicitud.cantidadSolicitudes - 1) {
            interfaz.colaMatriculacion.procesarSolicitud();
        }
        
        solicitud.contador ++;
        mostrarPrimeraSolicitud();
    }//GEN-LAST:event_aceptarButtonMouseClicked
    private void negarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_negarButtonMouseClicked

        Estudiante solicitud = getPrimeraSolicitud();
        
        if (solicitud == null) {
            return;
        }

        solicitud.matriculado[solicitud.contador] = false;
        JOptionPane.showMessageDialog(this, "La solicitud ha sido RECHAZADA");

        if (solicitud.contador == solicitud.cantidadSolicitudes - 1) {
            interfaz.colaMatriculacion.procesarSolicitud();
        }
        
        solicitud.contador ++;
        mostrarPrimeraSolicitud();
    }//GEN-LAST:event_negarButtonMouseClicked
    private Estudiante mostrarPrimeraSolicitud(){
        
        Estudiante solicitudActual = getPrimeraSolicitud();
        
        if (solicitudActual == null) {

            estudianteGestionTxt.setText("NO HAY SOLICITUDES");
            codigoUnicoGestionTxt.setText("NO HAY SOLICITUDES");
            materiaGestionTxt.setText("NO HAY SOLICITUDES");
            return null;
            
        } else if (solicitudActual != null) {
            
            Materia materia = solicitudActual.materiasSolicitadas[solicitudActual.contador];        
            estudianteGestionTxt.setText(solicitudActual.nombre);
            codigoUnicoGestionTxt.setText(solicitudActual.id + "");
            materiaGestionTxt.setText(materia.getNombre());

        }
        
        return solicitudActual;
    }
    private Estudiante getPrimeraSolicitud(){
        
        Estudiante solicitud = interfaz.colaMatriculacion.verPrimeraSolicitud();
        
        if (solicitud == null) {
            return null;
        }
        
        if (solicitud.contador > solicitud.cantidadSolicitudes - 1) {
            interfaz.colaMatriculacion.procesarSolicitud();
        }
        
        solicitud = interfaz.colaMatriculacion.verPrimeraSolicitud(); // Pasa a la siguiente?
        return solicitud;
    }
    private void setTextNoHaySolicitudes(){
        estudianteGestionTxt.setText("NO HAY SOLICITUDES");
        codigoUnicoGestionTxt.setText("NO HAY SOLICITUDES");
        materiaGestionTxt.setText("NO HAY SOLICITUDES");
    }
    
    // BÚSQUEDA
    private void busquedaButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_busquedaButtonMouseClicked
        
        String codigoUnico = codigoUnicoBusquedaTxt.getText();
        
        int id = 0;
        
        try {
            id = Integer.parseInt(codigoUnico);
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, "Se debe ingresar un número para poder realizar la búsqueda");
            codigoUnicoBusquedaTxt.setText("Ingrese el código unico para realizar la búsqueda");
        }
        
        if (id != 0) {
            Estudiante estudiante = interfaz.arbolEstudiantes.buscarEstudiante(id);
            if (estudiante!=null) {
                nombreBusquedaTxt.setText(estudiante.nombre);
            } else {
                nombreBusquedaTxt.setText("No se encontró ningun estudiante con el codigo único proporcionado");
            }
        }
        
    }//GEN-LAST:event_busquedaButtonMouseClicked

    // LISTA DE ESTUDIANTES
    private void anteriorListaButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anteriorListaButtonMouseClicked
        if (temp.anterior == null) {
            return;
        }
        temp = temp.anterior;
        actualizarEstudiante(temp.estudiante);
    }//GEN-LAST:event_anteriorListaButtonMouseClicked
    private void nextListaButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextListaButtonMouseClicked
        if (temp.siguiente == null) {
            return;
        }
        temp = temp.siguiente;
        actualizarEstudiante(temp.estudiante);
    }//GEN-LAST:event_nextListaButtonMouseClicked

    private void actualizarEstudiante(Estudiante estudiante){
        nombreListaTxt.setText(estudiante.nombre);
        codigoUnicoListaTxt.setText("" + estudiante.id);
    }
    
    // BÚSQUEDA
    private void nombreBusquedaTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreBusquedaTxtMouseClicked
        codigoUnicoBusquedaTxt.setText("Ingrese el código unico para realizar la búsqueda");
    }//GEN-LAST:event_nombreBusquedaTxtMouseClicked
    private void codigoUnicoBusquedaTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_codigoUnicoBusquedaTxtMouseClicked
        nombreBusquedaTxt.setText("");
        codigoUnicoBusquedaTxt.setText("");
    }//GEN-LAST:event_codigoUnicoBusquedaTxtMouseClicked

    // BOTON SALIR
    private void exitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseClicked
        interfaz.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_exitButtonMouseClicked

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aceptarButton;
    private javax.swing.JLabel anteriorListaButton;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel buscarButton;
    private javax.swing.JPanel buscarEstudiante;
    private javax.swing.JLabel busquedaButton;
    private javax.swing.JPanel cero;
    private javax.swing.JTextField codigoUnicoBusquedaTxt;
    private javax.swing.JTextField codigoUnicoGestionTxt;
    private javax.swing.JTextField codigoUnicoListaTxt;
    private javax.swing.JTextField estudianteGestionTxt;
    private javax.swing.JTextArea estudiantesListaTxt;
    private javax.swing.JLabel exitButton;
    private javax.swing.JPanel gestionar;
    private javax.swing.JLabel gestionarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField materiaGestionTxt;
    private javax.swing.JTextArea matriculadosTxt;
    private javax.swing.JTabbedPane menu;
    private javax.swing.JLabel negarButton;
    private javax.swing.JLabel nextListaButton;
    private javax.swing.JTextField nombreBusquedaTxt;
    private javax.swing.JTextField nombreListaTxt;
    private javax.swing.JLabel subtitulo;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel verEstudiantesMatriculadosButton;
    private javax.swing.JLabel verListaButton;
    private javax.swing.JPanel verMatriculados;
    private javax.swing.JPanel verTodos;
    // End of variables declaration//GEN-END:variables
}
