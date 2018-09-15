/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Personalinformation.Checkingaccountinfo;

/**
 *
 * @author murgod
 */
public class viewcheckingJpanel extends javax.swing.JPanel {

    /**
     * Creates new form viewcheckingJpanel
     */
    private Checkingaccountinfo checkingaccountinfo;
    public viewcheckingJpanel(Checkingaccountinfo checkingaccountinfo) {
        initComponents();
        displayCheckingaccountinfo(checkingaccountinfo);
    }
    private void displayCheckingaccountinfo(Checkingaccountinfo checkingaccountinfo) {
        String BankName = checkingaccountinfo.getBankname();
        ChkBankNameView.setText(BankName);
        
        String BankRoutingNo = checkingaccountinfo.getBankroutingno();
        ChkBankRouNo.setText(BankRoutingNo);
        
        String BankAccNo = checkingaccountinfo.getBankAccNo();
        ChkBankAccNo.setText(BankAccNo);
        
        String AccBalance = checkingaccountinfo.getBankaccountbalance();
        ChkAccBal.setText(AccBalance);
        
        String AccType = checkingaccountinfo.getAccounttype();
        ChkAccType.setText(AccType);
        
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
        agelabel = new javax.swing.JLabel();
        ChkBankNameView = new javax.swing.JTextField();
        ChkBankRouNo = new javax.swing.JTextField();
        ChkBankAccNo = new javax.swing.JTextField();
        ChkAccBal = new javax.swing.JTextField();
        ChkAccType = new javax.swing.JTextField();

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("View Checkingacc Info");

        firstnamelabel.setText("Bank name");

        lastnamelabel.setText("Bank Routing no");

        phnolabel.setText("Bank Acc no");

        doblabel.setText("Account Balance");

        agelabel.setText("Account type");

        ChkBankNameView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkBankNameViewActionPerformed(evt);
            }
        });

        ChkBankRouNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkBankRouNoActionPerformed(evt);
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
                            .addComponent(doblabel)
                            .addComponent(agelabel))
                        .addGap(115, 115, 115)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ChkAccType, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .addComponent(ChkAccBal)
                            .addComponent(ChkBankAccNo)
                            .addComponent(ChkBankRouNo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ChkBankNameView))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstnamelabel)
                    .addComponent(ChkBankNameView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastnamelabel)
                    .addComponent(ChkBankRouNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phnolabel)
                    .addComponent(ChkBankAccNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doblabel)
                    .addComponent(ChkAccBal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agelabel)
                    .addComponent(ChkAccType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 454, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 345, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ChkBankNameViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkBankNameViewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkBankNameViewActionPerformed

    private void ChkBankRouNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkBankRouNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkBankRouNoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ChkAccBal;
    private javax.swing.JTextField ChkAccType;
    private javax.swing.JTextField ChkBankAccNo;
    private javax.swing.JTextField ChkBankNameView;
    private javax.swing.JTextField ChkBankRouNo;
    private javax.swing.JLabel agelabel;
    private javax.swing.JLabel doblabel;
    private javax.swing.JLabel firstnamelabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lastnamelabel;
    private javax.swing.JLabel phnolabel;
    // End of variables declaration//GEN-END:variables


}