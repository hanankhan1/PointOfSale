/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frames;

import subclasses.Employe;
import subclasses.Store;

/**
 *
 * @author pc
 */
public class signup extends javax.swing.JFrame {

    /**
     * Creates new form signup
     */
    public signup() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ename = new javax.swing.JTextField();
        epass = new javax.swing.JPasswordField();
        ecpass = new javax.swing.JPasswordField();
        equestion = new javax.swing.JComboBox<>();
        esignup = new javax.swing.JButton();
        eback = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        eanswer = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(500, 200, 0, 0));

        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 110, 120, 30);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Siqurity Question");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 250, 300, 40);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Welcome To Pos");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(150, 30, 300, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 150, 170, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Confirm pass");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 200, 230, 50);
        jPanel1.add(ename);
        ename.setBounds(290, 112, 300, 30);
        jPanel1.add(epass);
        epass.setBounds(290, 160, 300, 30);
        jPanel1.add(ecpass);
        ecpass.setBounds(290, 210, 300, 30);

        equestion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select your question", "Pet Name", "Your Nick Name", "Fav Place " }));
        jPanel1.add(equestion);
        equestion.setBounds(330, 260, 270, 22);

        esignup.setText("Sign up");
        esignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esignupActionPerformed(evt);
            }
        });
        jPanel1.add(esignup);
        esignup.setBounds(430, 370, 72, 23);

        eback.setText("Back");
        eback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ebackActionPerformed(evt);
            }
        });
        jPanel1.add(eback);
        eback.setBounds(510, 370, 72, 23);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Answer");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 300, 170, 30);
        jPanel1.add(eanswer);
        eanswer.setBounds(290, 302, 300, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/signup.jpg"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 0, 610, 420);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ebackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ebackActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        main Main = new main();
        Main.setVisible(true);
    }//GEN-LAST:event_ebackActionPerformed

    private void esignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esignupActionPerformed
        // TODO add your handling code here:
        if (!ename.getText().isEmpty()
                && !new String(epass.getPassword()).isEmpty()
                && !new String(ecpass.getPassword()).isEmpty()
                && equestion.getSelectedIndex() != 0
                && !eanswer.getText().isEmpty()) {
            if (new String(epass.getPassword()).equals(new String(ecpass.getPassword()))) {
                Employe e = new Employe(ename.getText(), new String(epass.getPassword()), (String) equestion.getSelectedItem(), eanswer.getText());
                Store.addEmployee(e);
                Store.showMsgError("You are Added succfully..!");
                this.setVisible(false);
                this.dispose();
                main M = new main();
                M.setVisible(true);
            } else {
                Store.showMsgError("password and confirm password must be same..!");
            }
        } else {
            Store.showMsgError("Filled the required field..!");
        }

    }//GEN-LAST:event_esignupActionPerformed

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
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField eanswer;
    private javax.swing.JButton eback;
    private javax.swing.JPasswordField ecpass;
    private javax.swing.JTextField ename;
    private javax.swing.JPasswordField epass;
    private javax.swing.JComboBox<String> equestion;
    private javax.swing.JButton esignup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
