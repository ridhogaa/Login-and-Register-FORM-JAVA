/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package LoginRegister;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import java.sql.*;

/**
 *
 * @author Ridho Gymnastiar AL Rasyid, Aldhaf Fadlilah
 */
public class UpdatePassword extends javax.swing.JFrame {

    /**
     * Creates new form UpdatePassword
     */
    Border textField_border = BorderFactory.createMatteBorder(0, 0, 2, 0, Color.red);
    
    private KoneksiDB db = new KoneksiDB();
    private boolean flagA;
    protected String username, pw;
    
    public UpdatePassword() {
        initComponents();
        this.setLocationRelativeTo(null);
        jLabel_PassLama.setIcon(new ImageIcon(getClass().getResource("images/lock.png")));
        jLabel_PassBaru.setIcon(new ImageIcon(getClass().getResource("images/lock.png")));
        jPasswordField_PassLama.setBorder(textField_border);
        jPasswordField_PassBaru.setBorder(textField_border);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton_Update = new javax.swing.JButton();
        jLabel_Error1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel_PassLama = new javax.swing.JLabel();
        jLabel_PassBaru = new javax.swing.JLabel();
        jPasswordField_PassLama = new javax.swing.JPasswordField();
        jPasswordField_PassBaru = new javax.swing.JPasswordField();
        jLabel_BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(425, 400));
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_Update.setBackground(new java.awt.Color(25, 181, 254));
        jButton_Update.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jButton_Update.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Update.setText("Update");
        jButton_Update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UpdateActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 130, 40));

        jLabel_Error1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel_Error1.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jLabel_Error1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 270, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Password Baru");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 110, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Password Lama");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 120, 30));

        jCheckBox1.setText("Show Password");
        jCheckBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 120, 30));
        jPanel1.add(jLabel_PassLama, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 30, 30));
        jPanel1.add(jLabel_PassBaru, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 30, 28));

        jPasswordField_PassLama.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPasswordField_PassLama.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordField_PassLama.setText("password");
        jPasswordField_PassLama.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField_PassLamaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField_PassLamaFocusLost(evt);
            }
        });
        jPasswordField_PassLama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordField_PassLamaKeyReleased(evt);
            }
        });
        jPanel1.add(jPasswordField_PassLama, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 272, -1));

        jPasswordField_PassBaru.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPasswordField_PassBaru.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordField_PassBaru.setText("password");
        jPasswordField_PassBaru.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField_PassBaruFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField_PassBaruFocusLost(evt);
            }
        });
        jPasswordField_PassBaru.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordField_PassBaruKeyReleased(evt);
            }
        });
        jPanel1.add(jPasswordField_PassBaru, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 272, -1));

        jLabel_BG.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\Created By Ridho Gymnastiar Al Rasyid 1402020069 & Aldhaf Fadlilah 1402020112 (2).png")); // NOI18N
        jPanel1.add(jLabel_BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 360));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField_PassLamaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField_PassLamaFocusGained
        // TODO add your handling code here:
        String passValue = String.valueOf(jPasswordField_PassLama.getPassword()).trim().toLowerCase();

        if (passValue.equals("password")) {
            jPasswordField_PassLama.setText("");
            jPasswordField_PassLama.setForeground(Color.black);
        }
    }//GEN-LAST:event_jPasswordField_PassLamaFocusGained

    private void jPasswordField_PassLamaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField_PassLamaFocusLost
        // TODO add your handling code here:
        String passValue = String.valueOf(jPasswordField_PassLama.getPassword()).trim().toLowerCase();

        if (passValue.equals("password") || passValue.equals("")) {
            jPasswordField_PassLama.setText("password");
            jPasswordField_PassLama.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jPasswordField_PassLamaFocusLost

    private void jPasswordField_PassLamaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField_PassLamaKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jPasswordField_PassLamaKeyReleased

    private void jPasswordField_PassBaruFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField_PassBaruFocusGained
        // TODO add your handling code here:
        String passValue = String.valueOf(jPasswordField_PassBaru.getPassword()).trim().toLowerCase();

        if (passValue.equals("password")) {
            jPasswordField_PassBaru.setText("");
            jPasswordField_PassBaru.setForeground(Color.black);
        }
    }//GEN-LAST:event_jPasswordField_PassBaruFocusGained

    private void jPasswordField_PassBaruFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField_PassBaruFocusLost
        // TODO add your handling code here:
        String passValue = String.valueOf(jPasswordField_PassBaru.getPassword()).trim().toLowerCase();

        if (passValue.equals("password") || passValue.equals("")) {
            jPasswordField_PassBaru.setText("password");
            jPasswordField_PassBaru.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jPasswordField_PassBaruFocusLost

    // Regex PASSWORD BARU
    private void jPasswordField_PassBaruKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField_PassBaruKeyReleased
        // TODO add your handling code here:
         String PATTERN = "^([a-zA-Z0-9])+$";
        if (jPasswordField_PassBaru.getText().matches(PATTERN)) {
            jLabel_Error1.setText("");
            flagA = true;
            if (jPasswordField_PassBaru.getText().length() < 8) {
                jLabel_Error1.setText("ERROR PANJANG PASSWORD < 8");
                flagA = false;
            }
            if (jPasswordField_PassBaru.getText().length() > 12) {
                jLabel_Error1.setText("ERROR PANJANG PASSWORD > 12");
                flagA = false;
            }
        } else {
            jLabel_Error1.setText("ERROR PASSWORD TIDAK VALID");
            flagA = false;
        }
        if (jPasswordField_PassBaru.getText().equals("")) {
            jLabel_Error1.setText("");
            flagA = false;
        }
    }//GEN-LAST:event_jPasswordField_PassBaruKeyReleased

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox1.isSelected()) {
            jPasswordField_PassLama.setEchoChar((char) 0);
            jPasswordField_PassBaru.setEchoChar((char) 0);
        } else {
            jPasswordField_PassBaru.setEchoChar('*');
            jPasswordField_PassLama.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UpdateActionPerformed
        // TODO add your handling code here:
        if (flagA && jPasswordField_PassLama.getText().equals(pw)) {
            if (evt.getSource() == jButton_Update) {
                db.koneksiDatabase();
                try {
                    Statement statement = db.getKoneksi().createStatement();
                    ResultSet results = statement.executeQuery("SELECT * FROM user");
                    if (results.next() == false) {
                        
                    } else {
                        do {
                            boolean z = username.equals(results.getString("username")) && pw.equals(results.getString("password"));
                            if (z) {
                                jLabel_Error1.setText(null);
                                String query = "update user set password = ? where username = ?";
                                PreparedStatement state = db.getKoneksi().prepareStatement(query);
                                state.setString(1, jPasswordField_PassBaru.getText());
                                state.setString(2, username);
                                state.execute();
                                break;
                            } else {
                                jLabel_Error1.setText("Data Kosong");
                            }
                        } while (results.next());
                    }
                } catch (Exception e) {
                    
                }
                JOptionPane.showMessageDialog(null, "UPDATE PASSWORD BERHASIL!\nSupaya keamanan tetap terjaga\nSilakan Login Ulang", "UPDATE PASSWORD", JOptionPane.INFORMATION_MESSAGE);
                LoginRegister z = new LoginRegister();
                z.setVisible(true);
                new Welcome().setVisible(false);
                this.dispose();
            }
        } else {
            JOptionPane.showMessageDialog(null, "INVALID PASSWORD!", "ERROR PASSWORD", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton_UpdateActionPerformed

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
            java.util.logging.Logger.getLogger(UpdatePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdatePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdatePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdatePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdatePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Update;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_BG;
    private javax.swing.JLabel jLabel_Error1;
    private javax.swing.JLabel jLabel_PassBaru;
    private javax.swing.JLabel jLabel_PassLama;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField_PassBaru;
    private javax.swing.JPasswordField jPasswordField_PassLama;
    // End of variables declaration//GEN-END:variables
}
