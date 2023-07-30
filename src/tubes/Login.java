/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tubes;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
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

        tittleLogin = new javax.swing.JLabel();
        frameLogin = new javax.swing.JPanel();
        labelUsername = new javax.swing.JLabel();
        inputUsername = new javax.swing.JTextField();
        labelPassword = new javax.swing.JLabel();
        inputPassword = new javax.swing.JPasswordField();
        btLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1920, 1080));

        tittleLogin.setFont(new java.awt.Font("Colonna MT", 1, 24)); // NOI18N
        tittleLogin.setText("LOGIN");

        labelUsername.setText("Username");

        inputUsername.setText("Masukan username anda");
        inputUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputUsernameActionPerformed(evt);
            }
        });

        labelPassword.setText("Password");

        inputPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPasswordActionPerformed(evt);
            }
        });

        btLogin.setText("Login");
        btLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frameLoginLayout = new javax.swing.GroupLayout(frameLogin);
        frameLogin.setLayout(frameLoginLayout);
        frameLoginLayout.setHorizontalGroup(
            frameLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frameLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frameLoginLayout.createSequentialGroup()
                        .addGroup(frameLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelUsername)
                            .addComponent(labelPassword))
                        .addGap(18, 18, 18)
                        .addGroup(frameLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputUsername)
                            .addComponent(inputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameLoginLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        frameLoginLayout.setVerticalGroup(
            frameLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frameLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUsername)
                    .addComponent(inputUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(frameLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPassword)
                    .addComponent(inputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(btLogin)
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(tittleLogin))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(frameLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(tittleLogin)
                .addGap(23, 23, 23)
                .addComponent(frameLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputUsernameActionPerformed

    private void inputPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPasswordActionPerformed

    }//GEN-LAST:event_inputPasswordActionPerformed

    private void btLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoginActionPerformed
    String username = inputUsername.getText();
    String password = new String(inputPassword.getPassword());
    Object[] data ={ username,password};

        boolean loginSuccess;
        loginSuccess = saveLoginToDatabase(username, password);
        if (loginSuccess) {
            Menu menu = new Menu();
            menu.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Login gagal. Silakan coba lagi.", "Login Failed", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    private boolean saveLoginToDatabase(String username, String password) {
     //=== Konfigurasi koneksi database === //
    String url = "jdbc:mysql://localhost:3306/tiket";
    String user = "Bunga"; //otentikasi //inget2 bung
    String passwordDb = "123";

    // cek username di table
    String checkQuery = "SELECT COUNT(*) FROM login WHERE username = ?";

    // save data to table
    String insertQuery = "INSERT INTO login (username, password) VALUES (?, ?)";

    try (Connection conn = DriverManager.getConnection(url, user, passwordDb);
         PreparedStatement checkStmt = conn.prepareStatement(checkQuery);
         PreparedStatement insertStmt = conn.prepareStatement(insertQuery)) {

        // Set parameter pada PreparedStatement buat memeriksa username
        checkStmt.setString(1, username);

        
        var resultSet = checkStmt.executeQuery();
        resultSet.next();
        int count = resultSet.getInt(1);

        // Jika username sudah ada, kembalikan true tanpa menyimpan data
        if (count > 0) {
            System.out.println("Username sudah terdaftar.");
            return true;
        }

        // Set parameter pada PreparedStatement untuk menyimpan data login
        insertStmt.setString(1, username);
        insertStmt.setString(2, password);

        // Eksekusi query untuk menyimpan data login
        int rowsInserted = insertStmt.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("Data login berhasil disimpan.");
            return true;
        } else {
            System.out.println("Gagal menyimpan data login.");
            return false;
        }
    } catch (SQLException e) {
        System.out.println("Terjadi kesalahan saat menyimpan data login: " + e.getMessage());
        return false;
    }

}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLogin;
    private javax.swing.JPanel frameLogin;
    private javax.swing.JPasswordField inputPassword;
    private javax.swing.JTextField inputUsername;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JLabel tittleLogin;
    // End of variables declaration//GEN-END:variables
}