/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Personalinformation.MedicalRecord;

/**
 *
 * @author akshay
 */
public class viewmedicalJpanel extends javax.swing.JPanel {

    /**
     * Creates new form viewmedicalJpanel
     */
    private MedicalRecord medicalRecord;
    public viewmedicalJpanel(MedicalRecord medicalRecord) {
        initComponents();
        displayMedicalRecord(medicalRecord);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        firstnamelabel = new javax.swing.JLabel();
        MedRecNoview = new javax.swing.JTextField();
        lastnamelabel = new javax.swing.JLabel();
        Alergy1 = new javax.swing.JTextField();
        phnolabel = new javax.swing.JLabel();
        Alergy2 = new javax.swing.JTextField();
        doblabel = new javax.swing.JLabel();
        Alergy3 = new javax.swing.JTextField();

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("View Medical Info");

        firstnamelabel.setText("Record number");

        MedRecNoview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedRecNoviewActionPerformed(evt);
            }
        });

        lastnamelabel.setText("Alergy 1");

        Alergy1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Alergy1ActionPerformed(evt);
            }
        });

        phnolabel.setText("Alergy 2");

        doblabel.setText("Alergy 3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstnamelabel)
                            .addComponent(lastnamelabel)
                            .addComponent(phnolabel)
                            .addComponent(doblabel))
                        .addGap(115, 115, 115)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Alergy3, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .addComponent(Alergy2)
                            .addComponent(Alergy1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(MedRecNoview))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstnamelabel)
                    .addComponent(MedRecNoview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastnamelabel)
                    .addComponent(Alergy1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phnolabel)
                    .addComponent(Alergy2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doblabel)
                    .addComponent(Alergy3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(159, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void MedRecNoviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedRecNoviewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MedRecNoviewActionPerformed

    private void Alergy1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Alergy1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Alergy1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Alergy1;
    private javax.swing.JTextField Alergy2;
    private javax.swing.JTextField Alergy3;
    private javax.swing.JTextField MedRecNoview;
    private javax.swing.JLabel doblabel;
    private javax.swing.JLabel firstnamelabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lastnamelabel;
    private javax.swing.JLabel phnolabel;
    // End of variables declaration//GEN-END:variables

    private void displayMedicalRecord(MedicalRecord medicalRecord) {
        String MedRecNo = medicalRecord.getMedicalrecordno();
        MedRecNoview.setText(MedRecNo);
        
        String Alrgy1 = medicalRecord.getAlergy1();
        Alergy1.setText(Alrgy1);
        
        String Alrgy2 = medicalRecord.getAlergy2();
        Alergy2.setText(Alrgy2);

        String Alrgy3 = medicalRecord.getAlergy3();
        Alergy3.setText(Alrgy3);
        
                
    }

}