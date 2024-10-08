/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frames;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import subclasses.Employe;
import subclasses.Store;


public class StaffManage extends javax.swing.JFrame {

   
    public void setEmpTable(){
    ArrayList<Employe>emp=Store.getAllEmployes();
    if(emp!=null){
    DefaultTableModel model = (DefaultTableModel) eTable.getModel();
    model.setRowCount(0);
        for (int i = 0; i < emp.size(); i++) {
           Object [] cols=new Object[5];
           cols [0]=emp.get(i).getEname();
           cols [1]=emp.get(i).geteIdCard();
           cols [2]=emp.get(i).getPhone_no();
           cols [3]=emp.get(i).getePost();
           cols [4]=emp.get(i).getEmail();
            model.addRow(cols);
        }
    
    }
    
    }
    public void setSingleEmp(Employe e){
    DefaultTableModel model=(DefaultTableModel) eTable.getModel();
    model.setRowCount(0);
    Object [] cols=new Object[5];
           cols [0]=e.getEname();
           cols [1]=e.geteIdCard();
           cols [2]=e.getPhone_no();
           cols [3]=e.getePost();
           cols [4]=e.getEmail();
            model.addRow(cols);
    
    }
    public StaffManage() {
        initComponents();
        Store.dummyemp();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        searchbyName = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        ephone = new javax.swing.JTextField();
        ecard = new javax.swing.JTextField();
        epost = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        eTable = new javax.swing.JTable();
        ename = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        add = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        btnsearch = new javax.swing.JButton();
        search = new javax.swing.JLabel();

        jLabel6.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(searchbyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 15, 412, 34));
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 301, 235, 35));
        jPanel1.add(ephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 174, 235, 31));
        jPanel1.add(ecard, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 116, 235, 31));
        jPanel1.add(epost, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 231, 235, 31));

        jLabel1.setText("Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 55, 60, 31));

        jLabel2.setText("Email");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 301, 60, 35));

        jLabel3.setText("Post");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 231, 60, 31));

        jLabel4.setText("Phone No.");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 177, 60, 28));

        jLabel5.setText("ID CARD");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 116, 60, 31));

        eTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "ID Card", "Phone No.", "Post", "Email"
            }
        ));
        jScrollPane1.setViewportView(eTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 55, 412, -1));
        jPanel1.add(ename, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 55, 236, 31));

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 445, 81, -1));

        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 388, 81, -1));

        remove.setText("Rmove");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        jPanel1.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 445, 81, -1));

        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 388, 81, -1));

        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/skin color.jpg"))); // NOI18N
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        AdminMenu a=new AdminMenu();
        a.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        if(!ename.getText().isEmpty()&&!ecard.getText().isEmpty()&&!ephone.getText().isEmpty()&&!epost.getText().isEmpty()&&!email.getText().isEmpty())
        {
        Employe e=new Employe();
        e.setEname(ename.getText());
        e.seteIdCard(Integer.parseInt(ecard.getText()));
        e.setPhone_no(Integer.parseInt(ephone.getText()));
        e.setePost(epost.getText());
        e.setEmail(email.getText());
        Store.addEmployee(e);
        setEmpTable();
        }else{
        Store.showMsgError("Filled the required field..!");
        }
        
        
    }//GEN-LAST:event_addActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:
        if(!searchbyName.getText().isEmpty()){
        Employe obj=Store.searchByNameEmp(searchbyName.getText());
        if(obj!=null){this.setSingleEmp(obj);}
        else{Store.showMsgError("Employee "+searchbyName.getText()+" not found");}
        }else{
        Store.showMsgError("Search field is empty..!");
        }
    }//GEN-LAST:event_btnsearchActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        // TODO add your handling code here:
         if(!ename.getText().isEmpty()&&!ecard.getText().isEmpty()&&!ephone.getText().isEmpty()&&!epost.getText().isEmpty()&&!email.getText().isEmpty())
        {
        Employe e=new Employe();
        e.setEname(ename.getText());
        e.seteIdCard(Integer.parseInt(ecard.getText()));
        e.setPhone_no(Integer.parseInt(ephone.getText()));
        e.setePost(epost.getText());
        e.setEmail(email.getText());
        Store.deletemp(e);
        }else{
        Store.showMsgError("Filled the required field..!");
        }

        
    }//GEN-LAST:event_removeActionPerformed

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
            java.util.logging.Logger.getLogger(StaffManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffManage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton back;
    private javax.swing.JButton btnsearch;
    private javax.swing.JTable eTable;
    private javax.swing.JTextField ecard;
    private javax.swing.JTextField email;
    private javax.swing.JTextField ename;
    private javax.swing.JTextField ephone;
    private javax.swing.JTextField epost;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton remove;
    private javax.swing.JLabel search;
    private javax.swing.JTextField searchbyName;
    // End of variables declaration//GEN-END:variables
}
