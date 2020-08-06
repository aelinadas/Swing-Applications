/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import business.Uber;
import business.UberDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aelinadas
 */
public class SerialNumberListJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SerialNumberListJPanel
     */
    private UberDirectory uberDirectory;
    private JPanel userJPanelController;
    SerialNumberListJPanel(JPanel userJPanelController, UberDirectory uberDirectory) {
        initComponents();
        this.uberDirectory = uberDirectory;
        this.userJPanelController = userJPanelController;
    }

    
    ArrayList<Uber> tempArray = new ArrayList<Uber>();
    
    private void populateTable(ArrayList<Uber> popList){
        DefaultTableModel dtm = (DefaultTableModel)tblManage.getModel();
        dtm.setRowCount(0);
        for(Uber uber: popList){
            Object[] row = new Object[3];
            row[0] = uber;
            row[1] = uber.getSerialNumber();
            if (uber.getMaintenanceCertificate()) {
               row[2]="Expired";
            } else {
               row[2]="Not Expired";
            }

            dtm.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblManageField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblManage = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnView1 = new javax.swing.JButton();
        chkMaintain = new javax.swing.JCheckBox();

        lblManageField.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        lblManageField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lblManageField.setText("LIST OF CARS BY SERIAL NUMBER");
        lblManageField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblManageFieldActionPerformed(evt);
            }
        });

        tblManage.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Car Name", "Serial Number", "Maintenance Certificate"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblManage.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(tblManage);

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnBack.setText("<Back");
        btnBack.setToolTipText("");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        btnView1.setText("View");
        btnView1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnView1ActionPerformed(evt);
            }
        });

        chkMaintain.setText("Cars with Maintenance Certificate");
        chkMaintain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMaintainActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(lblManageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnSearch)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnBack)
                            .addGap(146, 146, 146)
                            .addComponent(chkMaintain)
                            .addGap(56, 56, 56)
                            .addComponent(btnView1)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblManageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnView1)
                    .addComponent(chkMaintain))
                .addContainerGap(357, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblManageFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblManageFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblManageFieldActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        tempArray.clear();
        for(Uber uber: uberDirectory.getUberDirectory()){
            if(uber.getSerialNumber().equalsIgnoreCase(txtSearch.getText())){
                tempArray.add(uber);
            }
        }
        if (tempArray!=null && !tempArray.isEmpty()) {
            populateTable(tempArray);
        } else {
            JOptionPane.showMessageDialog(null, "Sorry. No car exist with the entered with this serial number.");
        }
    }//GEN-LAST:event_btnSearchActionPerformed
    
    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userJPanelController.remove(this);
        CardLayout layout = (CardLayout)userJPanelController.getLayout();
        layout.previous(userJPanelController);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnView1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnView1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblManage.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row from the table to view details");
        }else{
            Uber uber = (Uber)tblManage.getValueAt(selectedRow, 0);
            ViewListJPanel panel = new ViewListJPanel(userJPanelController, uber);
            userJPanelController.add("ViewListJPanel", panel);
            CardLayout layout = (CardLayout)userJPanelController.getLayout();
            layout.next(userJPanelController);
        }
    }//GEN-LAST:event_btnView1ActionPerformed

    private void chkMaintainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMaintainActionPerformed
        // TODO add your handling code here:
        if (chkMaintain.isSelected()) {
            ArrayList<Uber> tempList = new ArrayList<Uber>();
            for (Uber uber : tempArray) {
                if (!uber.getMaintenanceCertificate()) {
                    tempList.add(uber);
                }
            }
            if (!tempList.isEmpty() && tempList != null) {
                populateTable(tempList);
            } else {
                JOptionPane.showMessageDialog(null, "Current results do not have any expired maintenance list");
                chkMaintain.setSelected(false);
            }
            
        }
        else{
            btnSearchActionPerformed(evt);
        }
    }//GEN-LAST:event_chkMaintainActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnView1;
    private javax.swing.JCheckBox chkMaintain;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lblManageField;
    private javax.swing.JTable tblManage;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}