/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ServicePersonRole;

import UserInterface.SalesPersonRole.*;
import business.EcoSystem;
import business.enterprise.Enterprise;
import business.market.Product;
import business.market.ProductCategory;
import business.market.ServiceInventory;
import business.market.SupplierDirectory;

import business.organization.ServicePersonOrganization;
import business.organization.SalesPersonOrganization;
import business.useraccount.UserAccount;
import business.workqueue.SalesPersonWorkRequest;
import business.workqueue.ServicePersonProductRequest;
import business.workqueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Siddhant
 */
public class ServicePersonWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SalesPersonWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private Enterprise enterprise;
    
    private ServicePersonOrganization servicePersonOrganization;
    
    private ProductCategory productCategory;
    
    
    
   
    public ServicePersonWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, ServicePersonOrganization servicePersonOrganization,Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.userAccount=account;
        this.business=system;
        this.enterprise=enterprise;
        this.servicePersonOrganization=servicePersonOrganization;
        productCategory=new ProductCategory();
        
        
        populateComboBox();
        populateRequestTable();
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        refreshJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        prodDetailsJTable = new javax.swing.JTable();
        assignJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        productsComboBox = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        prodNameTxtField = new javax.swing.JTextField();
        countTxtField = new javax.swing.JTextField();
        requestTestJButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        workRequestJTable2 = new javax.swing.JTable();

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        prodDetailsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Available Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(prodDetailsJTable);

        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });

        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });

        productsComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "---products---" }));
        productsComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productsComboBoxActionPerformed(evt);
            }
        });

        jButton1.setText("display");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        requestTestJButton.setText("Request Test");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });

        workRequestJTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Message", "Receiver", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(workRequestJTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(184, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(processJButton)
                                .addGap(172, 172, 172)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(productsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(171, 171, 171)
                                .addComponent(refreshJButton)))
                        .addGap(229, 229, 229))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(prodNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(countTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(requestTestJButton)
                            .addComponent(assignJButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(refreshJButton)
                    .addComponent(productsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(processJButton)
                    .addComponent(jButton1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(prodNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(countTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(assignJButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(requestTestJButton)
                .addGap(94, 94, 94))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    
    public void populateComboBox()
    {
        productsComboBox.removeAllItems();
        //for(Product product:productCategory.getProductList())
           Product product = new Product();
        
            product=productCategory.addProduct();
            product.setProductName("air filter");
            product.getServiceInventory().setCount(11);
            productsComboBox.addItem(product);
            Product product1 = new Product();
            product1=productCategory.addProduct();
            product1.getServiceInventory().setCount(10);          
            product1.setProductName("turbo charger");
            productsComboBox.addItem(product1);
            Product product3 = new Product();
            product3=productCategory.addProduct();
            product3.getServiceInventory().setCount(10);
            
            product3.setProductName("diesel/petrol filer");
           productsComboBox.addItem(product3);
            Product product5 = new Product();
            product5=productCategory.addProduct();
            product5.getServiceInventory().setCount(10);
            product5.setProductName("inter-cooler");
            productsComboBox.addItem(product5);
           
            Product product7 = new Product();
            product7=productCategory.addProduct();
            product7.setProductName("worn injectors");
            product7.getServiceInventory().setCount(10);
            productsComboBox.addItem(product7);
            
            Product product8 = new Product();
            product8=productCategory.addProduct();
            product8.setProductName("EGR valves");
            product8.getServiceInventory().setCount(10);
            productsComboBox.addItem(product8);
            
           if(productsComboBox.getSelectedIndex()==1)
            {
                int number=product.getServiceInventory().getCount();
    countTxtField.setText(String.valueOf(number));
            }
             
        
    }
    public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) workRequestJTable2.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[4];
            row[0] = request.getMessage();
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            String result = ((ServicePersonProductRequest) request).getRequestResult();
            row[3] = result == null ? "Waiting" : result;
            
            model.addRow(row);
        }
    }

    public void populateTable(){
        
        DefaultTableModel model = (DefaultTableModel)prodDetailsJTable.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : servicePersonOrganization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getSender().getEmployee().getFirstName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getFirstName();
            row[3] = request.getStatus();
            
            model.addRow(row);
        }
    }
    
//    public void populateProductTable(){
//        DefaultTableModel model = (DefaultTableModel) productTable.getModel();
//
//        model.setRowCount(0);
//        for (Product product : productCategory.getProductList()) {
//            product=productCategory.addProduct();
//            product.setProductName("air filter");
//            
//            product=productCategory.addProduct();
//            product.setProductName("turbo charger");
//            product=productCategory.addProduct();
//            product.setProductName("diesel/petrol filer");
//            product=productCategory.addProduct();
//            product.setProductName("inter-cooler");
//            product=productCategory.addProduct();
//            product.setProductName("worn injectors");
//            product=productCategory.addProduct();
//            product.setProductName("EGR valves");
//            
//            Object[] row = new Object[2];
//                    row[0] = product;
//                    model.addRow(row);
//            
//            for (ServiceInventory inventory : product.getServiceInventoryList().getInventoryList()) {
//                if (inventory.getInventoryID() > 0) {
//                   
//
//                }
//
//            }
//        }
//        
//    }
    
    
    
    
    
    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        
        Product product=(Product) productsComboBox.getSelectedItem();
        if(product.getServiceInventory().getCount()>0)
        {
            
        }
        int selectedRow = prodDetailsJTable.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        WorkRequest request = (WorkRequest)prodDetailsJTable.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Pending");
        populateTable();

    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int selectedRow = prodDetailsJTable.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        SalesPersonWorkRequest request = (SalesPersonWorkRequest)prodDetailsJTable.getValueAt(selectedRow, 0);

        request.setStatus("Processing");

        SalesPersonProcessWorkRequestJPanel processWorkRequestJPanel = new SalesPersonProcessWorkRequestJPanel(userProcessContainer, request);
        userProcessContainer.add("SalesPersonProcessWorkRequestJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_processJButtonActionPerformed

    public void display(Product product)
    {   
         if(productsComboBox.getSelectedIndex()==0)
            {int number=product.getServiceInventory().getCount();
    countTxtField.setText(String.valueOf(number));
                
            }
            else if(productsComboBox.getSelectedIndex()==1)
            {
                int number=product.getServiceInventory().getCount();
    countTxtField.setText(String.valueOf(number));
            }
        
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 Product product=new Product();
        String prodName=product.getProductName();
    prodNameTxtField.setText(prodName);
    
    int number=product.getServiceInventory().getCount();
    countTxtField.setText(String.valueOf(number));
//ServicePersonProductDetailsCheck processWorkRequestJPanel = new ServicePersonProductDetailsCheck();
//        userProcessContainer.add("SalesPersonProcessWorkRequestJPanel", processWorkRequestJPanel);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);        



// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestLabTestJPanel", new RequestProductJPanel(userProcessContainer, userAccount, enterprise,business));
        layout.next(userProcessContainer);

    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void productsComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productsComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productsComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JTextField countTxtField;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton processJButton;
    private javax.swing.JTable prodDetailsJTable;
    private javax.swing.JTextField prodNameTxtField;
    private javax.swing.JComboBox productsComboBox;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JTable workRequestJTable2;
    // End of variables declaration//GEN-END:variables
}
