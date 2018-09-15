/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Personalinformation.Addressinfo;
import javax.swing.JOptionPane;

/**
 *
 * @author murgod
 */
public class createAddrJpanel extends javax.swing.JPanel {

    /**
     * Creates new form createAddrJpanel
     */
    private Addressinfo addressinfo;
    public createAddrJpanel(Addressinfo addressinfo) {
        this.addressinfo = addressinfo;
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        firstnamelabel = new javax.swing.JLabel();
        lastnamelabel = new javax.swing.JLabel();
        phnolabel = new javax.swing.JLabel();
        doblabel = new javax.swing.JLabel();
        StreetAddrsTextField = new javax.swing.JTextField();
        CityTextField = new javax.swing.JTextField();
        StateInfoTextField = new javax.swing.JTextField();
        ZipCodeTextField = new javax.swing.JTextField();
        jButtonSaveAddrsInfo = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(700, 600));

        jPanel1.setPreferredSize(new java.awt.Dimension(700, 600));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Enter Address Info");

        firstnamelabel.setText("Street addr");

        lastnamelabel.setText("City");

        phnolabel.setText("State");

        doblabel.setText("Zip code");

        StreetAddrsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StreetAddrsTextFieldActionPerformed(evt);
            }
        });

        CityTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CityTextFieldActionPerformed(evt);
            }
        });

        jButtonSaveAddrsInfo.setText("save");
        jButtonSaveAddrsInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveAddrsInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstnamelabel)
                            .addComponent(lastnamelabel)
                            .addComponent(phnolabel)
                            .addComponent(doblabel))
                        .addGap(115, 115, 115)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonSaveAddrsInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ZipCodeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                .addComponent(StateInfoTextField)
                                .addComponent(CityTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(StreetAddrsTextField)))))
                .addContainerGap(302, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstnamelabel)
                    .addComponent(StreetAddrsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastnamelabel)
                    .addComponent(CityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phnolabel)
                    .addComponent(StateInfoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doblabel)
                    .addComponent(ZipCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(jButtonSaveAddrsInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(267, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void StreetAddrsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StreetAddrsTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StreetAddrsTextFieldActionPerformed

    private void CityTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CityTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CityTextFieldActionPerformed

    private void jButtonSaveAddrsInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveAddrsInfoActionPerformed
        addressinfo.setStreetadr(StreetAddrsTextField.getText());
        addressinfo.setCity(CityTextField.getText());
        addressinfo.setState(StateInfoTextField.getText());
        addressinfo.setZipcode(ZipCodeTextField.getText());
        
        JOptionPane.showMessageDialog(null, "Address Information saved successfully");
        
    }//GEN-LAST:event_jButtonSaveAddrsInfoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CityTextField;
    private javax.swing.JTextField StateInfoTextField;
    private javax.swing.JTextField StreetAddrsTextField;
    private javax.swing.JTextField ZipCodeTextField;
    private javax.swing.JLabel doblabel;
    private javax.swing.JLabel firstnamelabel;
    private javax.swing.JButton jButtonSaveAddrsInfo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lastnamelabel;
    private javax.swing.JLabel phnolabel;
    // End of variables declaration//GEN-END:variables
}