/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Personalinformation.MedicalRecord;
import javax.swing.JOptionPane;

/**
 *
 * @author murgod
 */
public class createmedicalJpanel extends javax.swing.JPanel {

    /**
     * Creates new form createmedicalJpanel
     */
    private MedicalRecord medicalRecord;
    public createmedicalJpanel(MedicalRecord medicalRecord) {
        initComponents();
        this.medicalRecord=medicalRecord;
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
        MedRecNo = new javax.swing.JTextField();
        Alergy1 = new javax.swing.JTextField();
        Alergy2 = new javax.swing.JTextField();
        Alergy3 = new javax.swing.JTextField();
        SaveMediInfo = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Enter Medical Info");

        firstnamelabel.setText("Record number");

        lastnamelabel.setText("Alergy 1");

        phnolabel.setText("Alergy 2");

        doblabel.setText("Alergy 3");

        MedRecNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedRecNoActionPerformed(evt);
            }
        });

        Alergy1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Alergy1ActionPerformed(evt);
            }
        });

        SaveMediInfo.setText("Save");
        SaveMediInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveMediInfoActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Alergy3, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .addComponent(Alergy2)
                            .addComponent(Alergy1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(MedRecNo)
                            .addComponent(SaveMediInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(191, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstnamelabel)
                    .addComponent(MedRecNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastnamelabel)
                    .addComponent(Alergy1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phnolabel)
                    .addComponent(Alergy2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doblabel)
                    .addComponent(Alergy3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(SaveMediInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(218, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 557, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void MedRecNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedRecNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MedRecNoActionPerformed

    private void Alergy1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Alergy1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Alergy1ActionPerformed

    private void SaveMediInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveMediInfoActionPerformed
        medicalRecord.setMedicalrecordno(MedRecNo.getText());
        medicalRecord.setAlergy1(Alergy1.getText());
        medicalRecord.setAlergy2(Alergy2.getText());
        medicalRecord.setAlergy3(Alergy3.getText());
        
        JOptionPane.showMessageDialog(null, "Medical Information saved successfully");        
    }//GEN-LAST:event_SaveMediInfoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Alergy1;
    private javax.swing.JTextField Alergy2;
    private javax.swing.JTextField Alergy3;
    private javax.swing.JTextField MedRecNo;
    private javax.swing.JButton SaveMediInfo;
    private javax.swing.JLabel doblabel;
    private javax.swing.JLabel firstnamelabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lastnamelabel;
    private javax.swing.JLabel phnolabel;
    // End of variables declaration//GEN-END:variables
}