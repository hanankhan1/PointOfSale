/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frames;

/**
 *
 * @author pc
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() {
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

        jPanel1 = new javax.swing.JPanel();
        empLogin = new javax.swing.JButton();
        empsignup = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        adminLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(250, 100, 0, 0));

        jPanel1.setLayout(null);

        empLogin.setBackground(new java.awt.Color(157, 97, 97));
        empLogin.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        empLogin.setForeground(new java.awt.Color(255, 255, 255));
        empLogin.setText("LOG IN");
        empLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empLoginActionPerformed(evt);
            }
        });
        jPanel1.add(empLogin);
        empLogin.setBounds(640, 270, 250, 50);

        empsignup.setBackground(new java.awt.Color(157, 97, 97));
        empsignup.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        empsignup.setForeground(new java.awt.Color(255, 255, 255));
        empsignup.setText("SIGN UP");
        empsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empsignupActionPerformed(evt);
            }
        });
        jPanel1.add(empsignup);
        empsignup.setBounds(640, 210, 250, 50);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 60)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(196, 93, 93));
        jLabel2.setText("PLEASE SIGNUP/LOGIN FIRST");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(150, 30, 850, 90);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 172, 146));
        jLabel3.setText("Employe ");
        jLabel3.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(647, 140, 240, 50);

        Back.setBackground(new java.awt.Color(255, 51, 51));
        Back.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel1.add(Back);
        Back.setBounds(650, 460, 240, 70);

        adminLogin.setBackground(new java.awt.Color(255, 153, 153));
        adminLogin.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        adminLogin.setText("Admin Login");
        adminLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminLoginActionPerformed(evt);
            }
        });
        jPanel1.add(adminLogin);
        adminLogin.setBounds(650, 370, 240, 70);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-190, -150, 1220, 790);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1033, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void empsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empsignupActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        signup Signup = new signup();
        Signup.setVisible(true);

    }//GEN-LAST:event_empsignupActionPerformed

    private void empLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empLoginActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        Eportal employe = new Eportal();
        employe.setVisible(true);
    }//GEN-LAST:event_empLoginActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:

        this.setVisible(false);
        this.dispose();
        MainPage main = new MainPage();
        main.setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    private void adminLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminLoginActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        Login l=new Login();
        l.setVisible(true);
    }//GEN-LAST:event_adminLoginActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton adminLogin;
    private javax.swing.JButton empLogin;
    private javax.swing.JButton empsignup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
