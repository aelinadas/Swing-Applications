/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import business.Uber;
import business.UberDirectory;
import java.awt.CardLayout;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aelinadas
 */
public class NumberOfSeatListJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NumberOfSeatListJPanel
     */
    int defaultMax = 10;
    int defaultMin = 1;
    private UberDirectory uberDirectory;
    private JPanel userJPanelController;
    NumberOfSeatListJPanel(JPanel userJPanelController, UberDirectory uberDirectory) {
        initComponents();
        this.uberDirectory = uberDirectory;
        this.userJPanelController = userJPanelController;
        txtMax.setText(defaultMax + "");
        txtMin.setText(defaultMin + "");
        
    }
    
    ArrayList<Uber> tempArray = new ArrayList<Uber>();
    
    private void populateTable(ArrayList<Uber> popList){
        DefaultTableModel dtm = (DefaultTableModel)tblManage.getModel();
        dtm.setRowCount(0);
        for(Uber uber: popList){
            Object row[] = new Object[4];
            row[0] = uber;
            row[1] = uber.getModelNumber(); 
            row[2] = uber.getSeats();
            if (uber.getAvailability()) {
               row[3]="Available";
            } else {
                row[3]="Not Available";
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
        lblMaxSeats = new javax.swing.JLabel();
        lblMinSeats = new javax.swing.JLabel();
        txtMax = new javax.swing.JTextField();
        txtMin = new javax.swing.JTextField();
        btnView1 = new javax.swing.JButton();

        lblManageField.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        lblManageField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lblManageField.setText("LIST OF CARS BY SEAT NUMBERS");
        lblManageField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblManageFieldActionPerformed(evt);
            }
        });

        tblManage.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Car Name", "Model Number", "Seats", "Availabilty"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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

        lblMaxSeats.setText("Max Seats");

        lblMinSeats.setText("Min Seats");

        txtMax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMaxKeyTyped(evt);
            }
        });

        txtMin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMinKeyTyped(evt);
            }
        });

        btnView1.setText("View");
        btnView1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnView1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(lblManageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack)
                            .addComponent(txtMax, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMin, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(btnSearch)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnView1))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblMaxSeats)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMinSeats))))))
                .addContainerGap(250, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblManageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaxSeats))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMinSeats))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(btnView1))
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addGap(308, 308, 308))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblManageFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblManageFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblManageFieldActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        int max = 0;
        int min = 0;
        if(txtMax.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Need a max number of seats entered!!");
        }else if(Integer.parseInt(txtMax.getText()) > defaultMax){
            JOptionPane.showMessageDialog(null, "The number is exceeding the maximum value!!");
        }else{
            if(!txtMin.getText().equals("") && !txtMax.getText().equals("")){
                min = Integer.parseInt(txtMin.getText());
                max = Integer.parseInt(txtMax.getText());
                tempArray = uberDirectory.getMaxMin(max, min);
                if(tempArray != null && !tempArray.isEmpty()){
                    populateTable(tempArray);
                }else{
                    JOptionPane.showMessageDialog(null, "Sorry!! No seats are currently available for the entered value.");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Need to enter some value");
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userJPanelController.remove(this);
        CardLayout layout = (CardLayout)userJPanelController.getLayout();
        layout.previous(userJPanelController);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtMaxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaxKeyTyped
        // TODO add your handling code here:
        char ch = evt.getKeyChar();
        int num = evt.getKeyCode();
        if(!Character.isDigit(ch) || (ch == KeyEvent.VK_BACK_SPACE) || (ch == KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_txtMaxKeyTyped

    private void txtMinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMinKeyTyped
        // TODO add your handling code here:
        char ch = evt.getKeyChar();
        int num = evt.getKeyCode();
        if(!Character.isDigit(ch) || (ch == KeyEvent.VK_BACK_SPACE) || (ch == KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_txtMinKeyTyped

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnView1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lblManageField;
    private javax.swing.JLabel lblMaxSeats;
    private javax.swing.JLabel lblMinSeats;
    private javax.swing.JTable tblManage;
    private javax.swing.JTextField txtMax;
    private javax.swing.JTextField txtMin;
    // End of variables declaration//GEN-END:variables
}
