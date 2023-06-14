/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyectofinal;

import java.awt.event.KeyEvent;



public class fLogin extends javax.swing.JFrame {

    
    
    public fLogin() {
        initComponents();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        ingresar = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        contraseña = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        iniciarSesion = new javax.swing.JButton();
        nuevaCuenta = new javax.swing.JLabel();
        crearCuenta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 420));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 420));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setPreferredSize(new java.awt.Dimension(600, 420));

        header.setBackground(new java.awt.Color(250, 240, 220));

        title.setIcon(new javax.swing.ImageIcon("C:\\Users\\amufr\\Desktop\\proyectoFinal\\src\\main\\java\\img\\header-logo-cappuccino-grand-cafe.png")); // NOI18N

        logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\amufr\\Desktop\\proyectoFinal\\src\\main\\java\\img\\logo.png")); // NOI18N

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logo)
                .addGap(14, 14, 14))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title)
                    .addComponent(logo))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        ingresar.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        ingresar.setForeground(new java.awt.Color(27, 71, 45));
        ingresar.setText("Úsuario:");

        txtUsuario.setBackground(new java.awt.Color(250, 240, 220));
        txtUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        contraseña.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        contraseña.setForeground(new java.awt.Color(27, 71, 45));
        contraseña.setText("Contraseña:");

        txtContraseña.setBackground(new java.awt.Color(250, 240, 220));
        txtContraseña.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        iniciarSesion.setBackground(new java.awt.Color(255, 255, 255));
        iniciarSesion.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        iniciarSesion.setForeground(new java.awt.Color(27, 71, 45));
        iniciarSesion.setText("Iniciar sesión");
        iniciarSesion.setBorder(null);
        iniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iniciarSesionMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                iniciarSesionMousePressed(evt);
            }
        });
        iniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarSesionActionPerformed(evt);
            }
        });
        iniciarSesion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                iniciarSesionKeyPressed(evt);
            }
        });

        nuevaCuenta.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        nuevaCuenta.setForeground(new java.awt.Color(42, 27, 22));
        nuevaCuenta.setText("¿Aun no tienes cuenta?");

        crearCuenta.setBackground(new java.awt.Color(255, 255, 255));
        crearCuenta.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        crearCuenta.setForeground(new java.awt.Color(42, 27, 22));
        crearCuenta.setText("Crear");
        crearCuenta.setBorder(null);
        crearCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearCuentaMouseClicked(evt);
            }
        });
        crearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearCuentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(contraseña)
                .addGap(236, 236, 236))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(nuevaCuenta)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(crearCuenta))))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(ingresar))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(iniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(166, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(iniciarSesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crearCuenta)
                    .addComponent(nuevaCuenta)))
        );

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 370));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void iniciarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciarSesionMouseClicked

    }//GEN-LAST:event_iniciarSesionMouseClicked

    private void iniciarSesionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciarSesionMousePressed
       // TODO add your handling code here:
    }//GEN-LAST:event_iniciarSesionMousePressed

    private void iniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarSesionActionPerformed
        clases.CLogin objetoLogin = new clases.CLogin();
        objetoLogin.validaUsuario(txtUsuario, txtContraseña);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_iniciarSesionActionPerformed

    private void iniciarSesionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iniciarSesionKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            clases.CLogin objetoLogin = new clases.CLogin();
            objetoLogin.validaUsuario(txtUsuario, txtContraseña);
            dispose();
        }
    }//GEN-LAST:event_iniciarSesionKeyPressed

    private void crearCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearCuentaMouseClicked
      // TODO add your handling code here:
    }//GEN-LAST:event_crearCuentaMouseClicked

    private void crearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearCuentaActionPerformed
        fNuevoUsuario nueva = new fNuevoUsuario();
        nueva.setVisible(true);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_crearCuentaActionPerformed

   
    public static void main(String args[]) {
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JLabel contraseña;
    private javax.swing.JButton crearCuenta;
    private javax.swing.JPanel header;
    private javax.swing.JLabel ingresar;
    private javax.swing.JButton iniciarSesion;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel nuevaCuenta;
    private javax.swing.JLabel title;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
