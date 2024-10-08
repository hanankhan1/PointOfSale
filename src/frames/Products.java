package frames;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import subclasses.Product;
import subclasses.Store;

public class Products extends javax.swing.JFrame {

    /**
     * Creates new form Products
     */
    public Products() {
        initComponents();
        Store.dummyProducts();
        setTableValue();
    }
// set table content

    void setTableValue() {
        ArrayList<Product> pro = Store.getAllProducts();
        if (pro != null) {
            DefaultTableModel model = (DefaultTableModel) productList.getModel();
            model.setRowCount(0);
            
            for (int i = 0; i < pro.size(); i++) {
                Object[] cols = new Object[6];
                cols[0] = pro.get(i).getPid();
                cols[1] = pro.get(i).getName();
                cols[2] = pro.get(i).getStock();
                cols[3] = pro.get(i).getWholeSale();
                cols[4] = pro.get(i).getSellingp();
                cols[5] = pro.get(i).getCatagory();
                model.addRow(cols);
            }
        }
        
    }
    
    void setSingleItemValue(Product p) {
        
        DefaultTableModel model = (DefaultTableModel) productList.getModel();
        model.setRowCount(0);
        
        Object[] cols = new Object[6];
        cols[0] = p.getPid();
        cols[1] = p.getName();
        cols[2] = p.getStock();
        cols[3] = p.getWholeSale();
        cols[4] = p.getSellingp();
        cols[5] = p.getCatagory();
        model.addRow(cols);
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        productList = new javax.swing.JTable();
        save = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        back = new javax.swing.JButton();
        pid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        wholes = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        catagory = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        byname = new javax.swing.JTextField();
        sellingp = new javax.swing.JTextField();
        stock = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        productList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product id", "Name", "Stock", "Whole Sale", "Retail price", "Catagory"
            }
        ));
        productList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(productList);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, -1));

        save.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        save.setText("Add");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel1.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 110, -1));

        remove.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        remove.setText("Remove");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        jPanel1.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 110, -1));

        back.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 80, -1));

        pid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pidActionPerformed(evt);
            }
        });
        jPanel1.add(pid, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 250, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setText("Product id");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 90, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel6.setText("Whole Sale");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 80, 30));
        jPanel1.add(wholes, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 250, 30));

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 250, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setText("Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 80, 30));

        update.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 110, -1));

        catagory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "none", "Soft Drinks", "Water", "Snaks", "Lays", "Korkre", "Choclates", "Candes", "Juice", "Ice Cream", "Buiscit", "rice", "grains", "Washing powder", "Laundry soup", "Face wash", "Body wash", "Cofee", " " }));
        jPanel1.add(catagory, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 250, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Catagory");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 70, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel7.setText("Stock");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 90, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setText("Selling price");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 90, 30));
        jPanel1.add(byname, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 440, 30));
        jPanel1.add(sellingp, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 250, 30));
        jPanel1.add(stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 250, 30));

        search.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 110, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/skin color.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-140, 0, 1020, 480));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        AdminMenu admin = new AdminMenu();
        admin.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        if (!pid.getText().isEmpty()
                && !catagory.getSelectedItem().toString().isEmpty()
                && !name.getText().isEmpty()
                && !stock.getText().isEmpty()
                && !wholes.getText().isEmpty()
                && !sellingp.getText().isEmpty()) {
            Product p = new Product();
            p.setPid(Integer.parseInt(pid.getText()));
            p.setName(name.getText());
            p.setCatagory(catagory.getSelectedItem().toString());
            p.setSellingp(Double.parseDouble(sellingp.getText()));
            p.setWholeSale(Double.parseDouble(wholes.getText()));
            p.setStock(Double.parseDouble(stock.getText()));
            Store.addProduct(p);
            setTableValue();
        } else {
            JOptionPane.showMessageDialog(null, "filled thie required fields...!");
        }
    }//GEN-LAST:event_saveActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        if (!byname.getText().isEmpty()) {
            Product obj = Store.searchByName(byname.getText());
            if (obj != null) {
                this.setSingleItemValue(obj);
            } else {
                JOptionPane.showMessageDialog(null, "Product " + byname + " not found ");
            }
        } else {
            JOptionPane.showMessageDialog(null, "fill the required states..!");
        }

    }//GEN-LAST:event_searchActionPerformed

    private void productListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productListMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) productList.getModel();
        int index = productList.getSelectedRow();
        pid.setText(model.getValueAt(index, 0).toString());
        name.setText(model.getValueAt(index, 1).toString());
        stock.setText(model.getValueAt(index, 2).toString());
        wholes.setText(model.getValueAt(index, 3).toString());
        sellingp.setText(model.getValueAt(index, 4).toString());
        catagory.setSelectedItem(model.getValueAt(index, 5));

    }//GEN-LAST:event_productListMouseClicked

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        // TODO add your handling code here:
        if (!pid.getText().isEmpty()
                && !catagory.getSelectedItem().toString().isEmpty()
                && !name.getText().isEmpty()
                && !stock.getText().isEmpty()
                && !wholes.getText().isEmpty()
                && !sellingp.getText().isEmpty()) {
            Product p = new Product();
            p.setPid(Integer.parseInt(pid.getText()));
            p.setName(name.getText());
            p.setCatagory(catagory.getSelectedItem().toString());
            p.setSellingp(Double.parseDouble(sellingp.getText()));
            p.setWholeSale(Double.parseDouble(wholes.getText()));
            p.setStock(Double.parseDouble(stock.getText()));
            Store.deletpro(p);
        }

    }//GEN-LAST:event_removeActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        if (!pid.getText().isEmpty()
                && !catagory.getSelectedItem().toString().isEmpty()
                && !name.getText().isEmpty()
                && !stock.getText().isEmpty()
                && !wholes.getText().isEmpty()
                && !sellingp.getText().isEmpty()) {
            Product p = new Product();
            p.setPid(Integer.parseInt(pid.getText()));
            p.setName(name.getText());
            p.setCatagory(catagory.getSelectedItem().toString());
            p.setSellingp(Double.parseDouble(sellingp.getText()));
            p.setWholeSale(Double.parseDouble(wholes.getText()));
            p.setStock(Double.parseDouble(stock.getText()));
            Store.update(p.getPid(), p);
            
        }
    }//GEN-LAST:event_updateActionPerformed

    private void pidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pidActionPerformed

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
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Products().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JTextField byname;
    private javax.swing.JComboBox<String> catagory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField pid;
    private javax.swing.JTable productList;
    private javax.swing.JButton remove;
    private javax.swing.JButton save;
    private javax.swing.JButton search;
    private javax.swing.JTextField sellingp;
    private javax.swing.JTextField stock;
    private javax.swing.JButton update;
    private javax.swing.JTextField wholes;
    // End of variables declaration//GEN-END:variables
}
