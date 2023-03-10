/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projectgui;

import java.awt.Dimension;

/**
 *
 * @author Naufal D~A
 */
public class Login_page extends javax.swing.JFrame {

    /**
     * Creates new form TugasBesarGUI
     */
    public static String username;    
    public static String password;

    public Login_page() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        password_textField = new javax.swing.JPasswordField();
        sign_in_button = new javax.swing.JButton();
        close_mouseClicked = new javax.swing.JLabel();
        minimize_mouseClicked = new javax.swing.JLabel();
        warningLabel = new javax.swing.JLabel();
        username_textField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(360, 440));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(360, 440));
        getContentPane().setLayout(null);

        login_panel.setBackground(new java.awt.Color(31, 29, 43));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(241, 240, 242));
        jLabel1.setText("Login");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(80, 79, 94));
        jLabel2.setText("Sign In to Continue");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(241, 240, 242));
        jLabel3.setText("Username");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(241, 240, 242));
        jLabel4.setText("Password");

        password_textField.setBackground(new java.awt.Color(43, 41, 55));
        password_textField.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        password_textField.setForeground(new java.awt.Color(241, 240, 242));
        password_textField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sign_in_button.setBackground(new java.awt.Color(108, 94, 207));
        sign_in_button.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        sign_in_button.setForeground(new java.awt.Color(241, 240, 242));
        sign_in_button.setText("Sign In");
        sign_in_button.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sign_in_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_in_buttonActionPerformed(evt);
            }
        });

        close_mouseClicked.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        close_mouseClicked.setForeground(new java.awt.Color(241, 240, 242));
        close_mouseClicked.setText("X");
        close_mouseClicked.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close_mouseClickedMouseClicked(evt);
            }
        });

        minimize_mouseClicked.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        minimize_mouseClicked.setForeground(new java.awt.Color(241, 240, 242));
        minimize_mouseClicked.setText("-");
        minimize_mouseClicked.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimize_mouseClickedMouseClicked(evt);
            }
        });

        warningLabel.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        warningLabel.setForeground(new java.awt.Color(255, 0, 0));
        warningLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        username_textField.setBackground(new java.awt.Color(43, 41, 55));
        username_textField.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        username_textField.setForeground(new java.awt.Color(241, 240, 242));
        username_textField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout login_panelLayout = new javax.swing.GroupLayout(login_panel);
        login_panel.setLayout(login_panelLayout);
        login_panelLayout.setHorizontalGroup(
            login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_panelLayout.createSequentialGroup()
                .addGroup(login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(login_panelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(warningLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(password_textField, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(sign_in_button)
                            .addComponent(username_textField, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                        .addGap(0, 139, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, login_panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(minimize_mouseClicked)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(close_mouseClicked)))
                .addContainerGap())
        );
        login_panelLayout.setVerticalGroup(
            login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(close_mouseClicked)
                    .addComponent(minimize_mouseClicked))
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(warningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sign_in_button)
                .addContainerGap(159, Short.MAX_VALUE))
        );

        getContentPane().add(login_panel);
        login_panel.setBounds(0, 0, 360, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sign_in_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign_in_buttonActionPerformed
        // TODO add your handling code here:
        if(username_textField.getText().equals(Register_page.username)&& (password_textField.getText().equals(Register_page.password))){
            // ke Halaman Home
            Home_page hp = new Home_page();
            hp.setVisible(true);
            hp.pack();
            this.dispose();
            hp.setMinimumSize(new Dimension (725,460));
            hp.setLocationRelativeTo(null);
            hp.setDefaultCloseOperation(Home_page.EXIT_ON_CLOSE);
            
        } else {
            warningLabel.setText("Your password or username is invalid");
        }
    }//GEN-LAST:event_sign_in_buttonActionPerformed

    private void minimize_mouseClickedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize_mouseClickedMouseClicked
        // TODO add your handling code here:
        // Untuk Minimize Halaman
        this.setState(1);
    }//GEN-LAST:event_minimize_mouseClickedMouseClicked

    private void close_mouseClickedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_mouseClickedMouseClicked
        // TODO add your handling code here:
        // Untuk Close Halaman
        System.exit(0);
    }//GEN-LAST:event_close_mouseClickedMouseClicked

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
            java.util.logging.Logger.getLogger(Login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel close_mouseClicked;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel login_panel;
    private javax.swing.JLabel minimize_mouseClicked;
    private javax.swing.JPasswordField password_textField;
    private javax.swing.JButton sign_in_button;
    private javax.swing.JTextField username_textField;
    private javax.swing.JLabel warningLabel;
    // End of variables declaration//GEN-END:variables
}
