/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyectofinal;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author amufr
 */
public class fNuevoUsuario extends javax.swing.JFrame {

    /**
     * Creates new form fNuevoUsuario
     */
    public fNuevoUsuario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        background = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        nombreApellidos = new javax.swing.JLabel();
        txtNContraseña = new javax.swing.JPasswordField();
        volver = new javax.swing.JButton();
        txtLocal = new javax.swing.JTextField();
        local = new javax.swing.JLabel();
        txtNombreApellido = new javax.swing.JTextField();
        txtNUsuario = new javax.swing.JTextField();
        registrarse = new javax.swing.JButton();
        nombreUsuario = new javax.swing.JLabel();
        contraseña = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));

        header.setBackground(new java.awt.Color(250, 240, 220));

        title.setIcon(new javax.swing.ImageIcon("C:\\Users\\amufr\\Desktop\\proyectoFinal\\src\\main\\java\\img\\header-logo-cappuccino-grand-cafe.png")); // NOI18N

        logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\amufr\\Desktop\\proyectoFinal\\src\\main\\java\\img\\logo.png")); // NOI18N

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logo)
                .addContainerGap())
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logo)
                    .addComponent(title))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        nombreApellidos.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        nombreApellidos.setForeground(new java.awt.Color(27, 71, 45));
        nombreApellidos.setText("Nombre y apellidos");

        txtNContraseña.setBackground(new java.awt.Color(250, 240, 220));

        volver.setBackground(new java.awt.Color(255, 255, 255));
        volver.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        volver.setForeground(new java.awt.Color(42, 27, 22));
        volver.setText("Volver al inicio de sesión");
        volver.setBorder(null);
        volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volverMouseClicked(evt);
            }
        });
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        txtLocal.setBackground(new java.awt.Color(250, 240, 220));
        txtLocal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocalActionPerformed(evt);
            }
        });

        local.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        local.setForeground(new java.awt.Color(27, 71, 45));
        local.setText("Local");

        txtNombreApellido.setBackground(new java.awt.Color(250, 240, 220));
        txtNombreApellido.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNombreApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreApellidoActionPerformed(evt);
            }
        });

        txtNUsuario.setBackground(new java.awt.Color(250, 240, 220));
        txtNUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNUsuarioActionPerformed(evt);
            }
        });

        registrarse.setBackground(new java.awt.Color(255, 255, 255));
        registrarse.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        registrarse.setForeground(new java.awt.Color(27, 71, 45));
        registrarse.setText("Registrarse");
        registrarse.setBorder(null);
        registrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrarseMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                registrarseMousePressed(evt);
            }
        });
        registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarseActionPerformed(evt);
            }
        });
        registrarse.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                registrarseKeyPressed(evt);
            }
        });

        nombreUsuario.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        nombreUsuario.setForeground(new java.awt.Color(27, 71, 45));
        nombreUsuario.setText("Nombre de usuario");

        contraseña.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        contraseña.setForeground(new java.awt.Color(27, 71, 45));
        contraseña.setText("Contraseña:");

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(volver))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(registrarse)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreApellidos)
                    .addComponent(txtNombreApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contraseña))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(local)
                    .addComponent(nombreUsuario))
                .addGap(83, 83, 83))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreApellidos)
                    .addComponent(nombreUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(local)
                    .addComponent(contraseña))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(registrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(volver)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseClicked
        fLogin login = new fLogin();
        login.setVisible(true);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_volverMouseClicked

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_volverActionPerformed

    private void txtLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocalActionPerformed

    }//GEN-LAST:event_txtLocalActionPerformed

    private void txtNombreApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreApellidoActionPerformed

    private void txtNUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNUsuarioActionPerformed

    private void registrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarseMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_registrarseMouseClicked

    private void registrarseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarseMousePressed
        String local = txtLocal.getText();
        String contra = txtNContraseña.getText();
        String usuario = txtNUsuario.getText();
        String nombre = txtNombreApellido.getText();

        if (usuario.isEmpty() || contra.isEmpty() || local.isEmpty() || nombre.isEmpty()){

            JOptionPane.showMessageDialog(this, "algunos campos estan vacios");
        }
        else{
            clases.CLogin nuevoLogin = new clases.CLogin();
            nuevoLogin.nuevoUsuario(txtNUsuario, txtNContraseña, txtNombreApellido, txtLocal);
            dispose();}   // TODO add your handling code here:       // TODO add your handling code here:
    }//GEN-LAST:event_registrarseMousePressed

    private void registrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registrarseActionPerformed

    private void registrarseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_registrarseKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){String usuario = txtLocal.getText();
            String contra = txtNContraseña.getText();

            if (usuario.isEmpty() || contra.isEmpty()){

                JOptionPane.showMessageDialog(this, "usuario o contraseña vacios");
            }
            else{
                clases.CLogin nuevoLogin = new clases.CLogin();
                nuevoLogin.nuevoUsuario(txtNUsuario, txtNContraseña, txtNombreApellido, txtLocal);
                dispose(); }   // TODO add your handling code here:       // TODO add your handling code here:

        }
    }//GEN-LAST:event_registrarseKeyPressed

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
            java.util.logging.Logger.getLogger(fNuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fNuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fNuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fNuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fNuevoUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JLabel contraseña;
    private javax.swing.JPanel header;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel local;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel nombreApellidos;
    private javax.swing.JLabel nombreUsuario;
    private javax.swing.JButton registrarse;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtLocal;
    private javax.swing.JPasswordField txtNContraseña;
    private javax.swing.JTextField txtNUsuario;
    private javax.swing.JTextField txtNombreApellido;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
