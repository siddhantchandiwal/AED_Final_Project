/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ServicePersonRole;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.InventoryManagerOrganization;
import business.organization.Organization;
import business.useraccount.UserAccount;
import business.workqueue.ServicePersonProductRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class RequestProductJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem system;
    /**
     * Creates new form RequestLabTestJPanel
     */
    public RequestProductJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise,EcoSystem system) {
        initComponents();
        this.system = system;
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        valueLabel.setText(enterprise.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        requestTestJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        messageJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestTestJButton.setText("Request Test");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 95, -1, -1));

        jLabel1.setText("Message");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 40, -1, -1));
        add(messageJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 37, 89, -1));

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 138, -1, -1));

        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 130, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 120, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
        
        String message = messageJTextField.getText();
        
        ServicePersonProductRequest request = new ServicePersonProductRequest();
        request.setMessage(message);
        request.setSender(userAccount);
        request.setStatus("Sent");
        int flag=0;
      //              userAccount.getWorkQueue().getWorkRequestList().add(request);
        Organization org = null;
        for (Network network : system.getNetworkList()) {
            if(flag==0){
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                
                if (enterprise.getName().equals("HONDA")) {
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if (organization instanceof InventoryManagerOrganization) {
                        flag=1;
                            org = organization;
                            break;
                        }
                    }
                }
            }
            }
        }
       
        if (org!=null){
            
            org.getWorkQueue().getWorkRequestList().add(request);
            userAccount.getWorkQueue().getWorkRequestList().add(request);
        }
        
    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ServicePersonWorkAreaJPanel dwjp = (ServicePersonWorkAreaJPanel) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField messageJTextField;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
