package interfaz;

import sistemaMatriculacion.*;

public class GUI extends javax.swing.JFrame {
    
    public ListaUsuarios listaUsuarios = new ListaUsuarios();
    public ListaMaterias listaMaterias = new ListaMaterias();
    public ListaDoble listaEstudiantes = new ListaDoble();
    public ArbolBinarioBusqueda arbolEstudiantes = new ArbolBinarioBusqueda();
    public ColaMatriculacion colaMatriculacion = new ColaMatriculacion(1000);
    
    public boolean estudiante;
    public boolean administrador;
    
    public GUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        listaUsuarios.agregarUsuario(new Administrador("admin", "admin123"));
        agregarEstudiante(new sistemaMatriculacion.Estudiante("juan", "juan123", 202218837, "Juan Perez"));
        agregarEstudiante(new sistemaMatriculacion.Estudiante("domenica", "domenica123", 202218839, "Doménica Cárdenas"));
        agregarEstudiante(new sistemaMatriculacion.Estudiante("danna", "danna123", 202218838, "Danna Morales"));
        agregarEstudiante(new sistemaMatriculacion.Estudiante("viviana", "viviana23", 202218835, "Vivivana Espín"));
        agregarEstudiante(new sistemaMatriculacion.Estudiante("samira", "samira123", 202218834, "Samira Arizaga"));
        agregarEstudiante(new sistemaMatriculacion.Estudiante("paul", "paul123", 202220766, "Paul Dávila"));
        agregarEstudiante(new sistemaMatriculacion.Estudiante("salma", "salma123", 202220765, "Salma Morales"));
    }
    
    public void agregarEstudiante(sistemaMatriculacion.Estudiante estudiante) {
        listaUsuarios.agregarUsuario(estudiante);
        listaEstudiantes.agregarEstudiante(estudiante);
        arbolEstudiantes.agregarEstudiante(estudiante);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        título1 = new javax.swing.JLabel();
        título2 = new javax.swing.JLabel();
        exitButton = new javax.swing.JLabel();
        estudianteButton = new javax.swing.JLabel();
        adminButton = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(14, 34, 64));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        título1.setBackground(new java.awt.Color(84, 84, 67));
        título1.setFont(new java.awt.Font("CHICKEN Pie Height", 1, 48)); // NOI18N
        título1.setForeground(new java.awt.Color(14, 34, 64));
        título1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        título1.setText("SISTEMA DE");
        jPanel1.add(título1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 570, 70));

        título2.setBackground(new java.awt.Color(84, 84, 67));
        título2.setFont(new java.awt.Font("CHICKEN Pie Height", 1, 48)); // NOI18N
        título2.setForeground(new java.awt.Color(14, 34, 64));
        título2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        título2.setText("MATRICULACIÓN");
        jPanel1.add(título2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 570, 70));

        exitButton.setBackground(new java.awt.Color(230, 211, 168));
        exitButton.setFont(new java.awt.Font("CHICKEN Pie Height", 1, 18)); // NOI18N
        exitButton.setForeground(new java.awt.Color(14, 34, 64));
        exitButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitButton.setText("SALIR");
        exitButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        exitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonMouseClicked(evt);
            }
        });
        jPanel1.add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 90, 30));

        estudianteButton.setBackground(new java.awt.Color(230, 211, 168));
        estudianteButton.setFont(new java.awt.Font("CHICKEN Pie Height", 1, 24)); // NOI18N
        estudianteButton.setForeground(new java.awt.Color(14, 34, 64));
        estudianteButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estudianteButton.setText("ESTUDIANTE");
        estudianteButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        estudianteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        estudianteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                estudianteButtonMouseClicked(evt);
            }
        });
        jPanel1.add(estudianteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 210, 50));

        adminButton.setBackground(new java.awt.Color(230, 211, 168));
        adminButton.setFont(new java.awt.Font("CHICKEN Pie Height", 1, 24)); // NOI18N
        adminButton.setForeground(new java.awt.Color(14, 34, 64));
        adminButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminButton.setText("ADMINISTRADOR");
        adminButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        adminButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adminButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminButtonMouseClicked(evt);
            }
        });
        jPanel1.add(adminButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 210, 50));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 680, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void estudianteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_estudianteButtonMouseClicked
        estudiante = true;
        Login login = new Login(this);
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_estudianteButtonMouseClicked

    private void exitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitButtonMouseClicked

    private void adminButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminButtonMouseClicked
        administrador = true;
        Login login = new Login(this);
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_adminButtonMouseClicked

    public void run(){
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminButton;
    private javax.swing.JLabel estudianteButton;
    private javax.swing.JLabel exitButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel título1;
    private javax.swing.JLabel título2;
    // End of variables declaration//GEN-END:variables
}
