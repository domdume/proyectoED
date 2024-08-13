package interfaz;

import java.awt.Color;
import javax.swing.JOptionPane;
import sistemaMatriculacion.*;

public class Login extends javax.swing.JFrame {

    public GUI interfaz;
    private boolean LoginExitoso;
    
    public Login(GUI interfaz) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.interfaz = interfaz;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgBlue = new javax.swing.JPanel();
        bgWhite = new javax.swing.JPanel();
        login = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        userTxt = new javax.swing.JTextField();
        contraseña = new javax.swing.JLabel();
        passwordTxt = new javax.swing.JPasswordField();
        okButton = new javax.swing.JLabel();
        back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(14, 34, 64));
        setUndecorated(true);

        bgBlue.setBackground(new java.awt.Color(14, 34, 64));
        bgBlue.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgWhite.setBackground(new java.awt.Color(255, 255, 255));

        login.setFont(new java.awt.Font("CHICKEN Pie Height", 0, 48)); // NOI18N
        login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login.setText("INICIO DE SESIÓN");

        usuario.setFont(new java.awt.Font("CHICKEN Pie Height", 0, 18)); // NOI18N
        usuario.setText("USUARIO");

        userTxt.setForeground(new java.awt.Color(204, 204, 204));
        userTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userTxt.setText("Ingrese su usuario");
        userTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userTxtFocusGained(evt);
            }
        });
        userTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userTxtMouseClicked(evt);
            }
        });

        contraseña.setFont(new java.awt.Font("CHICKEN Pie Height", 0, 18)); // NOI18N
        contraseña.setText("CONTRASEÑA");

        passwordTxt.setForeground(new java.awt.Color(204, 204, 204));
        passwordTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordTxt.setText("********");
        passwordTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordTxtFocusGained(evt);
            }
        });
        passwordTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordTxtMouseClicked(evt);
            }
        });

        okButton.setBackground(new java.awt.Color(255, 255, 255));
        okButton.setFont(new java.awt.Font("CHICKEN Pie Height", 0, 18)); // NOI18N
        okButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        okButton.setText("INGRESAR");
        okButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        okButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                okButtonMouseClicked(evt);
            }
        });

        back.setFont(new java.awt.Font("CHICKEN Pie Height", 0, 18)); // NOI18N
        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setText("REGRESAR");
        back.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bgWhiteLayout = new javax.swing.GroupLayout(bgWhite);
        bgWhite.setLayout(bgWhiteLayout);
        bgWhiteLayout.setHorizontalGroup(
            bgWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bgWhiteLayout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addGroup(bgWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(bgWhiteLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addComponent(contraseña, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userTxt)
                    .addComponent(passwordTxt))
                .addContainerGap(166, Short.MAX_VALUE))
        );
        bgWhiteLayout.setVerticalGroup(
            bgWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgWhiteLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(bgWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        bgBlue.add(bgWhite, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 680, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgBlue, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgBlue, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTxtMouseClicked
        if (userTxt.getText().equals("Ingrese su usuario")) {
            userTxt.setText("");
            userTxt.setForeground(Color.black);
        }
        if (String.valueOf(passwordTxt.getPassword()).isEmpty()) {
            passwordTxt.setText("********");
            passwordTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_userTxtMouseClicked
    private void passwordTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordTxtMouseClicked
        if (String.valueOf(passwordTxt.getPassword()).equals("********")) {
            passwordTxt.setText("");
            passwordTxt.setForeground(Color.black);
        }
        if (userTxt.getText().isEmpty()) {
            userTxt.setText("Ingrese su usuario");
            userTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_passwordTxtMouseClicked
    private void okButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okButtonMouseClicked
        String userIn = userTxt.getText();
        String passwordIn = String.valueOf(passwordTxt.getPassword());
        Usuario user = interfaz.listaUsuarios.validarUsuario(userIn, passwordIn);
        
        if (user != null) {
            
            if (esEstudiante(user)) {
                EstudianteGUI estudianteGUI = new EstudianteGUI((Estudiante) user, interfaz);
                estudianteGUI.setVisible(true);
                this.dispose();
                
            } else if (esAdministrador(user)){
                AdminGUI adminGUI = new AdminGUI(interfaz);
                adminGUI.setVisible(true);
                this.dispose();                
            } else {
                JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos");                
            }
            
        } else {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos");
        }
    }//GEN-LAST:event_okButtonMouseClicked
    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        interfaz.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked
    private void passwordTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordTxtFocusGained
        if (String.valueOf(passwordTxt.getPassword()).equals("********")) {
            passwordTxt.setText("");
            passwordTxt.setForeground(Color.black);
        }
        if (userTxt.getText().isEmpty()) {
            userTxt.setText("Ingrese su usuario");
            userTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_passwordTxtFocusGained
    private void userTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userTxtFocusGained
        if (userTxt.getText().equals("Ingrese su usuario")) {
            userTxt.setText("");
            userTxt.setForeground(Color.black);
        }
        if (String.valueOf(passwordTxt.getPassword()).isEmpty()) {
            passwordTxt.setText("********");
            passwordTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_userTxtFocusGained

    private boolean esAdministrador(Usuario user){
        return (user instanceof Administrador && interfaz.administrador);
    }
    private boolean esEstudiante(Usuario user){
        return (user instanceof Estudiante && interfaz.estudiante);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JPanel bgBlue;
    private javax.swing.JPanel bgWhite;
    private javax.swing.JLabel contraseña;
    private javax.swing.JLabel login;
    private javax.swing.JLabel okButton;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JTextField userTxt;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
