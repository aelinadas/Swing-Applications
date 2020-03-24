/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Users.Admin;
import Business.Users.Customer;
import Business.Users.Supplier;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
 * @author AEDSpring2019
 */
public class AdminCreateScreen extends javax.swing.JPanel {

    /**
     * Creates new form AdminScreen
     */
    private JPanel panelRight;
    private Admin admin;

    public AdminCreateScreen(JPanel panelRight, Admin admin) {
        initComponents();
        this.panelRight = panelRight;
        this.admin = admin;
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCreate = new javax.swing.JButton();
        txtUser = new javax.swing.JTextField();
        txtPword = new javax.swing.JTextField();
        txtRePword = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        radioCustomer = new javax.swing.JRadioButton();
        radioSupplier = new javax.swing.JRadioButton();
        btnBack = new javax.swing.JButton();

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });

        jLabel1.setText("username:");

        jLabel2.setText("password:");

        jLabel3.setText("re-enter password :");

        radioCustomer.setText("Customer");
        radioCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioCustomerActionPerformed(evt);
            }
        });

        radioSupplier.setText("Supplier");

        btnBack.setText("< BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPword, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRePword, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radioSupplier)
                                    .addComponent(radioCustomer)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnBack)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRePword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioCustomer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioSupplier)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCreate)
                .addContainerGap(47, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        String p1 = txtPword.getText();
        String p2 = txtRePword.getText();
        String userName = txtUser.getText();
        txtUser.setBorder(new LineBorder(new Color(128, 128, 128)));
        txtRePword.setBorder(new LineBorder(new Color(128, 128, 128)));
        txtPword.setBorder(new LineBorder(new Color(128, 128, 128)));

        jLabel1.setForeground(Color.BLACK);
        jLabel2.setForeground(Color.BLACK);
        jLabel3.setForeground(Color.BLACK);
        if (userName == null || userName.equals("")) {
            txtUser.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel1.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "UserName Can't be empty");
            return;
        }
        if (!usernamePatternCorrect()) {
            JOptionPane.showMessageDialog(null, "Enter valid user name");
            txtUser.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel1.setForeground(Color.RED);
            return;
        }
        if (p1 == null || p1.equals("")) {
            txtPword.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel2.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Password Can't be empty");
            return;
        }
        if (!passwordPatternCorrect()) {
            JOptionPane.showMessageDialog(null, "Password must be atleast be 6 characters long and a combination of number, uppercase letter, lowercase letter and special character $,%,&,#");
            txtPword.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel2.setForeground(Color.RED);
            return;
        }
        if (!p1.equals(p2)) {
            JOptionPane.showMessageDialog(null, "Passwords need to be same.");
            txtPword.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtRePword.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel2.setForeground(Color.RED);
            jLabel3.setForeground(Color.RED);
            return;
        }
        if (!radioCustomer.isSelected() && !radioSupplier.isSelected()) {
            JOptionPane.showMessageDialog(null, "Please select a Role");
            return;
        }
        if (radioSupplier.isSelected()) {
            admin.getSuppDir().getSupplierList().add(new Supplier(p1, userName));
            JOptionPane.showMessageDialog(null, "New Supplier Added");
            txtUser.setText("");
            txtPword.setText("");
            txtRePword.setText("");
            radioCustomer.setSelected(false);
            radioSupplier.setSelected(false);

        }

        if (radioCustomer.isSelected()) {
            Customer customer = new Customer(p1, userName);
            DateFormat dateFormat = new SimpleDateFormat("EE MMM dd HH:mm:ss zzz");
            Calendar calendar = Calendar.getInstance();
            customer.setDate(dateFormat.format(calendar.getTime()));
            admin.getCustDir().getCustomerList().add(customer);
            JOptionPane.showMessageDialog(null, "New Customer Added");
            txtUser.setText("");
            txtPword.setText("");
            txtRePword.setText("");
            radioCustomer.setSelected(false);
            radioSupplier.setSelected(false);

        }

    }//GEN-LAST:event_btnCreateActionPerformed
    private boolean passwordPatternCorrect() {
        Pattern p = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[$*#&])[A-Za-z\\d$*#&]{6,}$");
        Matcher m = p.matcher(txtPword.getText());
        boolean b = m.matches();
        return b;
    }

    private boolean usernamePatternCorrect() {
        Pattern p = Pattern.compile("^[a-zA-Z0-9]+_[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$");
        Matcher m = p.matcher(txtUser.getText());
        boolean b = m.matches();
        return b;
    }

    private void toMainScreen() {
        CardLayout cardLayout = (CardLayout) this.panelRight.getLayout();
        this.panelRight.remove(this);
        Component components[] = this.panelRight.getComponents();
        for (Component component : components) {
            if (component instanceof AdminMainScreen) {
                AdminMainScreen panel = (AdminMainScreen) component;
                panel.populate();
                panel.populateCustomer();

            }
        }
        cardLayout.previous(panelRight);
    }
    private void radioCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioCustomerActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

//        CardLayout layout = (CardLayout) panelRight.getLayout();
//        panelRight.remove(this);
//        layout.previous(panelRight);
        toMainScreen();
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton radioCustomer;
    private javax.swing.JRadioButton radioSupplier;
    private javax.swing.JTextField txtPword;
    private javax.swing.JTextField txtRePword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
