/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Business.Car;
import javax.swing.JFileChooser;

import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;
/**
 *
 * @author aelinadas
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    private Car car;
    

    public CreateJPanel(Car car) {
        initComponents();
        this.car = car;
    }

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel15 = new javax.swing.JLabel();
        create = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        model = new javax.swing.JLabel();
        color = new javax.swing.JLabel();
        serial_no = new javax.swing.JLabel();
        dimensions = new javax.swing.JLabel();
        description = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        avail_num = new javax.swing.JLabel();
        seat_type = new javax.swing.JLabel();
        lights = new javax.swing.JLabel();
        display = new javax.swing.JLabel();
        horsePower = new javax.swing.JLabel();
        door = new javax.swing.JLabel();
        wheel_arm = new javax.swing.JLabel();
        mirrors = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        modelTxt = new javax.swing.JTextField();
        colorTxt = new javax.swing.JTextField();
        serialTxt = new javax.swing.JTextField();
        dmTxt = new javax.swing.JTextField();
        descTxt = new javax.swing.JTextField();
        priceTxt = new javax.swing.JTextField();
        availTxt = new javax.swing.JTextField();
        seatTxt = new javax.swing.JTextField();
        lightTxt = new javax.swing.JTextField();
        displayTxt = new javax.swing.JTextField();
        hpTxt = new javax.swing.JTextField();
        doorTxt = new javax.swing.JTextField();
        wheelTxt = new javax.swing.JTextField();
        mirrorTxt = new javax.swing.JTextField();
        createBtn = new javax.swing.JToggleButton();
        uploadBtn = new javax.swing.JButton();
        text = new javax.swing.JLabel();

        jLabel15.setText("jLabel15");

        create.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        create.setText("Create");

        name.setText("Name:");

        model.setText("Model:");

        color.setText("Color:");

        serial_no.setText("Serial No:");

        dimensions.setText("Dimensions:");

        description.setText("Description:");

        price.setText("Price:");

        avail_num.setText("Available No:");

        seat_type.setText("Seat Type:");

        lights.setText("Lights:");

        display.setText("Display:");

        horsePower.setText("Horse Power:");

        door.setText("Wheel Arm:");

        wheel_arm.setText("Door:");

        mirrors.setText("Mirrors:");

        nameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextActionPerformed(evt);
            }
        });

        serialTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serialTxtActionPerformed(evt);
            }
        });

        dmTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dmTxtActionPerformed(evt);
            }
        });

        availTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availTxtActionPerformed(evt);
            }
        });

        lightTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lightTxtActionPerformed(evt);
            }
        });

        displayTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayTxtActionPerformed(evt);
            }
        });

        mirrorTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mirrorTxtActionPerformed(evt);
            }
        });

        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        uploadBtn.setText("Upload");
        uploadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadBtnActionPerformed(evt);
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
                            .addComponent(mirrors)
                            .addComponent(name)
                            .addComponent(model)
                            .addComponent(serial_no)
                            .addComponent(color)
                            .addComponent(dimensions)
                            .addComponent(description)
                            .addComponent(price)
                            .addComponent(avail_num)
                            .addComponent(seat_type)
                            .addComponent(lights)
                            .addComponent(display)
                            .addComponent(horsePower)
                            .addComponent(wheel_arm)
                            .addComponent(door)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(createBtn)))
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(uploadBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(serialTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dmTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(priceTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(descTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(availTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(seatTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lightTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(displayTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(hpTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(doorTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(wheelTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mirrorTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(colorTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(create)
                    .addComponent(nameText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                    .addComponent(modelTxt, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(create)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(model)
                    .addComponent(modelTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(color)
                    .addComponent(colorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serial_no)
                    .addComponent(serialTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dimensions, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dmTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(description)
                    .addComponent(descTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(price)
                    .addComponent(priceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(avail_num)
                    .addComponent(availTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seat_type)
                    .addComponent(seatTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lights)
                    .addComponent(lightTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(display)
                    .addComponent(displayTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(horsePower)
                    .addComponent(hpTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wheel_arm)
                    .addComponent(doorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(door)
                    .addComponent(wheelTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mirrors)
                    .addComponent(mirrorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createBtn)
                    .addComponent(uploadBtn)
                    .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void mirrorTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mirrorTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mirrorTxtActionPerformed

    private void availTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_availTxtActionPerformed

    private void serialTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serialTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serialTxtActionPerformed

    private void dmTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dmTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dmTxtActionPerformed

    private void lightTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lightTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lightTxtActionPerformed

    private void displayTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_displayTxtActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        //Binding user input to Car  
        car.setName(nameText.getText());
        car.setModel(modelTxt.getText());
        car.setAvail_num(availTxt.getText());
        car.setColor(colorTxt.getText());
        car.setDescription(descTxt.getText());
        car.setDimensions(dmTxt.getText());
        car.setDisplay(displayTxt.getText());
        car.setDoor(doorTxt.getText());
        car.setHorsePower(hpTxt.getText());
        car.setLights(lightTxt.getText());
        car.setMirrors(mirrorTxt.getText());
        car.setPrice(priceTxt.getText());
        car.setSeat_type(seatTxt.getText());
        car.setSerial_no(serialTxt.getText());
        car.setWheel_arm(wheelTxt.getText());
        
        //Pop up for user confirmation
        JOptionPane.showMessageDialog(null, "Form filled successfully");
    }//GEN-LAST:event_createBtnActionPerformed

    private void nameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextActionPerformed

    private void uploadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadBtnActionPerformed
        JFileChooser uploadBtn = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        uploadBtn.showOpenDialog(null);
        uploadBtn.setAcceptAllFileFilterUsed(false); 
        int r = uploadBtn.showSaveDialog(uploadBtn);
        if (r == JFileChooser.APPROVE_OPTION){
            car.setBtnUpload(uploadBtn.getSelectedFile().getAbsolutePath());
        }
        else
            JOptionPane.showMessageDialog(null, "No Image ");   
    }//GEN-LAST:event_uploadBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField availTxt;
    private javax.swing.JLabel avail_num;
    private javax.swing.JLabel color;
    private javax.swing.JTextField colorTxt;
    private javax.swing.JLabel create;
    private javax.swing.JToggleButton createBtn;
    private javax.swing.JTextField descTxt;
    private javax.swing.JLabel description;
    private javax.swing.JLabel dimensions;
    private javax.swing.JLabel display;
    private javax.swing.JTextField displayTxt;
    private javax.swing.JTextField dmTxt;
    private javax.swing.JLabel door;
    private javax.swing.JTextField doorTxt;
    private javax.swing.JLabel horsePower;
    private javax.swing.JTextField hpTxt;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JTextField lightTxt;
    private javax.swing.JLabel lights;
    private javax.swing.JTextField mirrorTxt;
    private javax.swing.JLabel mirrors;
    private javax.swing.JLabel model;
    private javax.swing.JTextField modelTxt;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nameText;
    private javax.swing.JLabel price;
    private javax.swing.JTextField priceTxt;
    private javax.swing.JTextField seatTxt;
    private javax.swing.JLabel seat_type;
    private javax.swing.JTextField serialTxt;
    private javax.swing.JLabel serial_no;
    private javax.swing.JLabel text;
    private javax.swing.JButton uploadBtn;
    private javax.swing.JTextField wheelTxt;
    private javax.swing.JLabel wheel_arm;
    // End of variables declaration//GEN-END:variables
}
