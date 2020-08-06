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
public class MaintenanceCertListJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MaintenanceCertListJPanel
     */
    private UberDirectory uberDirectory;
    private JPanel userJPanelController;
    MaintenanceCertListJPanel(JPanel userJPanelController, UberDirectory uberDirectory) {
        initComponents();
        this.uberDirectory = uberDirectory;
        this.userJPanelController = userJPanelController;
    }
    
    ArrayList<Uber> tempArray = new ArrayList<Uber>();
    
    private void populateTable(ArrayList<Uber> popList){
        DefaultTableModel dtm = (DefaultTableModel)tblManage.getModel();
        dtm.setRowCount(0);
        for(Uber uber: popList){
            Object[] row = new Object[2];
            row[0] = uber;
            if (uber.getMaintenanceCertificate()) {
               row[1]="Expired";
            } else {
               row[1]="Not Expired";
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

        jPanel1 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        lblManageField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblManage = new javax.swing.JTable();
        btnListCars = new javax.swing.JButton();
        btnView = new javax.swing.JButton();

        btnBack.setText("<Back");
        btnBack.setToolTipText("");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblManageField.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        lblManageField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lblManageField.setText("LIST OF CARS HAVING EXPIRED MAINTENANCE CERTIFICATE");
        lblManageField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblManageFieldActionPerformed(evt);
            }
        });

        tblManage.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Car Name", "Maintenance Certificate"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblManage.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(tblManage);

        btnListCars.setText("List of Cars");
        btnListCars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListCarsActionPerformed(evt);
            }
        });

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(238, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addComponent(lblManageField, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnListCars)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnView))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(229, 229, 229))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBack, btnListCars});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblManageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListCars)
                    .addComponent(btnView))
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addContainerGap(384, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userJPanelController.remove(this);
        CardLayout layout = (CardLayout)userJPanelController.getLayout();
        layout.previous(userJPanelController);
    }//GEN-LAST:event_btnBackActionPerformed

    private void lblManageFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblManageFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblManageFieldActionPerformed

    private void btnListCarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListCarsActionPerformed
        // TODO add your handling code here:
        tempArray.clear();
        for(Uber uber: uberDirectory.getUberDirectory()){
            if(uber.getMaintenanceCertificate()){
                tempArray.add(uber);        
            }
        }
        if (tempArray!=null && !tempArray.isEmpty()) {
            populateTable(tempArray);
        } else {
            JOptionPane.showMessageDialog(null, "Sorry. No car exist.");
        }
    }//GEN-LAST:event_btnListCarsActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
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
    }//GEN-LAST:event_btnViewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnListCars;
    private javax.swing.JButton btnView;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lblManageField;
    private javax.swing.JTable tblManage;
    // End of variables declaration//GEN-END:variables
}