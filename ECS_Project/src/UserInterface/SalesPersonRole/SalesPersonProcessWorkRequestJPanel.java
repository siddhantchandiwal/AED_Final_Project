/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SalesPersonRole;

import business.consumer.Appliance;
import business.consumer.Automobile;
import business.workqueue.SalesPersonWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Siddhant
 */
public class SalesPersonProcessWorkRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SalesPersonProcessWorkRequestJPanel
     */
    JPanel userProcessContainer;
    SalesPersonWorkRequest request;

    public SalesPersonProcessWorkRequestJPanel(JPanel userProcessContainer, SalesPersonWorkRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        selectedModelCmbBox.setVisible(false);
        selectedACCmbBox.setVisible(false);
        selectedACLbl.setVisible(false);
        selectedModelLbl.setVisible(false);
        selectedRefLbl.setVisible(false);
        selectedRefrigeratorCmbBox.setVisible(false);
        populateComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        resultJTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        submitJButton = new javax.swing.JButton();
        selectedModelCmbBox = new javax.swing.JComboBox<>();
        selectedModelLbl = new javax.swing.JLabel();
        selectedACLbl = new javax.swing.JLabel();
        selectedACCmbBox = new javax.swing.JComboBox<>();
        selectedRefLbl = new javax.swing.JLabel();
        selectedRefrigeratorCmbBox = new javax.swing.JComboBox<>();

        resultJTextField.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel1.setText("Result");

        backJButton.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        submitJButton.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        submitJButton.setText("Submit Result");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        selectedModelCmbBox.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        selectedModelLbl.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        selectedModelLbl.setText("Selected Model:");

        selectedACLbl.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        selectedACLbl.setText("Selected AC:");

        selectedACCmbBox.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        selectedRefLbl.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        selectedRefLbl.setText("Selected Refrigerator:");

        selectedRefrigeratorCmbBox.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(selectedModelLbl)
                    .addComponent(selectedACLbl)
                    .addComponent(selectedRefLbl)
                    .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(selectedACCmbBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 137, Short.MAX_VALUE)
                    .addComponent(selectedModelCmbBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(submitJButton, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultJTextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectedRefrigeratorCmbBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(222, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, selectedACLbl, selectedModelLbl, selectedRefLbl});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(resultJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectedModelCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectedModelLbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectedACLbl)
                    .addComponent(selectedACCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectedRefLbl)
                    .addComponent(selectedRefrigeratorCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton)
                    .addComponent(submitJButton))
                .addContainerGap(164, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, resultJTextField, selectedACLbl, selectedModelLbl, selectedRefLbl});

    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SalesPersonWorkAreaJPanel spwjp = (SalesPersonWorkAreaJPanel) component;
        spwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
       
        String result = resultJTextField.getText();
       if(result.isEmpty() || result.startsWith(" ")){
           JOptionPane.showMessageDialog(this, "Please enter Result !!!");
           return;
       }
        request.setRequestResult(resultJTextField.getText());
        request.setStatus("Completed");
        JOptionPane.showMessageDialog(this,"Result submitted successfully !!!");

        if (request.getEnterpriseName().equalsIgnoreCase("retailer")
                || request.getEnterpriseName().equalsIgnoreCase("toyota")
                || request.getEnterpriseName().equalsIgnoreCase("BMW")
                || request.getEnterpriseName().equalsIgnoreCase("Honda")
                || request.getEnterpriseName().equalsIgnoreCase("renault")) {
            if (selectedModelCmbBox.getSelectedItem().toString().equals("---")) {
                JOptionPane.showMessageDialog(this, "Customer did not buy anything!!");
            } else {
                Automobile automobile = new Automobile();
                automobile.setAutomobileName(selectedModelCmbBox.getSelectedItem().toString());
                automobile.setBattery(100);
                request.getCustomer().getAutomobileDirectory().add(automobile);
               // JOptionPane.showMessageDialog(this, "Request Sent Successfully !!!");
            }
        }
        
        if (request.getEnterpriseName().equalsIgnoreCase("LG")
                || request.getEnterpriseName().equalsIgnoreCase("SAMSUNG")) {
            if (!selectedACCmbBox.getSelectedItem().toString().equals("---")) {
                Appliance appliance = new Appliance();
                appliance.setApplianceName(selectedACCmbBox.getSelectedItem().toString());
                request.getCustomer().getApplianceDirectory().add(appliance);
            } 
            if (!selectedRefrigeratorCmbBox.getSelectedItem().toString().equals("---")) {
                Appliance appliance = new Appliance();
                appliance.setApplianceName(selectedRefrigeratorCmbBox.getSelectedItem().toString());
                request.getCustomer().getApplianceDirectory().add(appliance);
            } 
            if (selectedACCmbBox.getSelectedItem().toString().equals("---")
                    && selectedRefrigeratorCmbBox.getSelectedItem().toString().equals("---")) {
                JOptionPane.showMessageDialog(this, "Customer did not buy anything!!");
                //return;
            }
        }
       // JOptionPane.showMessageDialog(this, "Request Sent Successfully !!!");
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void populateComboBox() {
        if (request.getEnterpriseName().equalsIgnoreCase("Honda")) {
            selectedModelLbl.setVisible(true);
            selectedModelCmbBox.setVisible(true);
            selectedModelCmbBox.addItem("---");
            selectedModelCmbBox.addItem("Honda Civic");
            selectedModelCmbBox.addItem("Honda Captur");
            selectedModelCmbBox.addItem("Honda CRV");
            selectedModelCmbBox.addItem("Honda HRV");
        }
        
        if (request.getEnterpriseName().equalsIgnoreCase("toyota")) {
            selectedModelLbl.setVisible(true);
            selectedModelCmbBox.setVisible(true);
            selectedModelCmbBox.addItem("---");
            selectedModelCmbBox.addItem("Toyota Prius");
            selectedModelCmbBox.addItem("Toyota Land Cruiser");
            selectedModelCmbBox.addItem("Toyota Verso");
            selectedModelCmbBox.addItem("Toyota Camry");
        }
        
        if (request.getEnterpriseName().equalsIgnoreCase("BMW")) {
            selectedModelLbl.setVisible(true);
            selectedModelCmbBox.setVisible(true);
            selectedModelCmbBox.addItem("---");
            selectedModelCmbBox.addItem("BMW i3");
            selectedModelCmbBox.addItem("BMW x1");
            selectedModelCmbBox.addItem("BMW M4 Coupe");
            selectedModelCmbBox.addItem("BMW M2 Coupe");
        }
        
        if (request.getEnterpriseName().equalsIgnoreCase("Renault")) {
            selectedModelLbl.setVisible(true);
            selectedModelCmbBox.setVisible(true);
            selectedModelCmbBox.addItem("---");
            selectedModelCmbBox.addItem("Renault Captur");
            selectedModelCmbBox.addItem("Renault Clio");
            selectedModelCmbBox.addItem("Renault Megane");
            selectedModelCmbBox.addItem("Renault Grand Scenic");
        }
        
        
        if (request.getEnterpriseName().equalsIgnoreCase("LG")) {
            selectedACCmbBox.setVisible(true);
            selectedACLbl.setVisible(true);
            selectedRefLbl.setVisible(true);
            selectedRefrigeratorCmbBox.setVisible(true);
            selectedACCmbBox.addItem("---");
            selectedACCmbBox.addItem("LG LSA5PW3A L-Pearl AC");
            selectedACCmbBox.addItem("LG LSA3NP5A L-Nova AC");
            selectedACCmbBox.addItem("LG LSA5NP3A1 L-Nova AC");
            selectedACCmbBox.addItem("LG BSA18IBE Inverter AC");
            selectedRefrigeratorCmbBox.addItem("---");
            selectedRefrigeratorCmbBox.addItem("LG GL-I292RPZL Refrigerator");
            selectedRefrigeratorCmbBox.addItem("LG GC-J237JSNV Refrigerator");
            selectedRefrigeratorCmbBox.addItem("LG GL-D221AMLL.DMLZEBN Refrigerator");
        }

        if (request.getEnterpriseName().equalsIgnoreCase("SAMSUNG")) {
            selectedACCmbBox.setVisible(true);
            selectedACLbl.setVisible(true);
            selectedRefLbl.setVisible(true);
            selectedRefrigeratorCmbBox.setVisible(true);
            selectedACCmbBox.addItem("---");
            selectedACCmbBox.addItem("Samsung AR12JC2HATP AC");
            selectedACCmbBox.addItem("Samsung AR18HC5TFUR AC");
            selectedACCmbBox.addItem("Samsung AR18JC3USUQ AC");
            selectedACCmbBox.addItem("Samsung AR12JV5NBWK AC");
            selectedRefrigeratorCmbBox.addItem("---");
            selectedRefrigeratorCmbBox.addItem("Samsung RR19J21C3RJ Refrigerator");
            selectedRefrigeratorCmbBox.addItem("Samsung RT34K3753S9/HL Refrigerator");
            selectedRefrigeratorCmbBox.addItem("Samsung RS21HSTPN Refrigerator");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField resultJTextField;
    private javax.swing.JComboBox<String> selectedACCmbBox;
    private javax.swing.JLabel selectedACLbl;
    private javax.swing.JComboBox<String> selectedModelCmbBox;
    private javax.swing.JLabel selectedModelLbl;
    private javax.swing.JLabel selectedRefLbl;
    private javax.swing.JComboBox<String> selectedRefrigeratorCmbBox;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}