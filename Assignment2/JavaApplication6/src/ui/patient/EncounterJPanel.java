/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.patient;

import java.awt.CardLayout;
import java.awt.Component;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.patient.Encounter;
import model.patient.Patient;
import model.patient.VitalSigns;

/**
 *
 * @author dhairyasheel
 */
public class EncounterJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EncounterJPanel
     */
    JPanel mainWorkArea;
    Patient patient;
    public EncounterJPanel(JPanel mainWorkArea,Patient patient) {
        initComponents();
        this.mainWorkArea = mainWorkArea;
        this.patient = patient;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        PersonaljPanel1 = new javax.swing.JPanel();
        txtPluse = new javax.swing.JTextField();
        Pulse = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        lblWeight = new javax.swing.JLabel();
        lblTemp = new javax.swing.JLabel();
        txtTemp = new javax.swing.JTextField();
        lblHeight = new javax.swing.JLabel();
        txtHeight = new javax.swing.JTextField();
        lblBP = new javax.swing.JLabel();
        txtBP = new javax.swing.JTextField();
        Pulse1 = new javax.swing.JLabel();
        Pulse2 = new javax.swing.JLabel();
        Pulse4 = new javax.swing.JLabel();
        Pulse5 = new javax.swing.JLabel();
        lblPulse = new javax.swing.JLabel();
        PersonaljPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDiag = new javax.swing.JTextArea();
        PersonaljPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtSym = new javax.swing.JTextArea();
        btnAdd = new javax.swing.JButton();
        lblDOE = new javax.swing.JLabel();
        dcDOE = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(254, 254, 254));

        lblTitle1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblTitle1.setForeground(new java.awt.Color(109, 144, 149));
        lblTitle1.setText(" New Encounter");

        btnBack.setBackground(new java.awt.Color(254, 254, 254));
        btnBack.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnBack.setForeground(new java.awt.Color(100, 149, 162));
        btnBack.setText("Back");
        btnBack.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        PersonaljPanel1.setBackground(new java.awt.Color(254, 254, 254));
        PersonaljPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Vital Signs", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 15), new java.awt.Color(95, 139, 162))); // NOI18N

        txtPluse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPluseActionPerformed(evt);
            }
        });

        Pulse.setBackground(new java.awt.Color(254, 254, 254));
        Pulse.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        Pulse.setForeground(new java.awt.Color(114, 150, 180));
        Pulse.setText("/min");

        lblWeight.setBackground(new java.awt.Color(254, 254, 254));
        lblWeight.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblWeight.setForeground(new java.awt.Color(114, 150, 180));
        lblWeight.setText("Weight:");

        lblTemp.setBackground(new java.awt.Color(254, 254, 254));
        lblTemp.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblTemp.setForeground(new java.awt.Color(114, 150, 180));
        lblTemp.setText("Temperature:");

        txtTemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTempActionPerformed(evt);
            }
        });

        lblHeight.setBackground(new java.awt.Color(254, 254, 254));
        lblHeight.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblHeight.setForeground(new java.awt.Color(114, 150, 180));
        lblHeight.setText("Height:");

        txtHeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHeightActionPerformed(evt);
            }
        });

        lblBP.setBackground(new java.awt.Color(254, 254, 254));
        lblBP.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblBP.setForeground(new java.awt.Color(114, 150, 180));
        lblBP.setText("Blood Pressure:");

        Pulse1.setBackground(new java.awt.Color(254, 254, 254));
        Pulse1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        Pulse1.setForeground(new java.awt.Color(114, 150, 180));
        Pulse1.setText("mmHg");

        Pulse2.setBackground(new java.awt.Color(254, 254, 254));
        Pulse2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        Pulse2.setForeground(new java.awt.Color(114, 150, 180));
        Pulse2.setText("F");

        Pulse4.setBackground(new java.awt.Color(254, 254, 254));
        Pulse4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        Pulse4.setForeground(new java.awt.Color(114, 150, 180));
        Pulse4.setText("ft");

        Pulse5.setBackground(new java.awt.Color(254, 254, 254));
        Pulse5.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        Pulse5.setForeground(new java.awt.Color(114, 150, 180));
        Pulse5.setText("lbs");

        lblPulse.setBackground(new java.awt.Color(254, 254, 254));
        lblPulse.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblPulse.setForeground(new java.awt.Color(114, 150, 180));
        lblPulse.setText("Pluse:");

        javax.swing.GroupLayout PersonaljPanel1Layout = new javax.swing.GroupLayout(PersonaljPanel1);
        PersonaljPanel1.setLayout(PersonaljPanel1Layout);
        PersonaljPanel1Layout.setHorizontalGroup(
            PersonaljPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PersonaljPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PersonaljPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBP)
                    .addComponent(lblPulse, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTemp, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(PersonaljPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtPluse, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(txtTemp, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBP))
                .addGap(3, 3, 3)
                .addGroup(PersonaljPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Pulse1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pulse, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pulse2, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addGroup(PersonaljPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PersonaljPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lblHeight))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PersonaljPanel1Layout.createSequentialGroup()
                        .addComponent(lblWeight)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PersonaljPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtHeight, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .addComponent(txtWeight))
                .addGap(3, 3, 3)
                .addGroup(PersonaljPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pulse5)
                    .addComponent(Pulse4))
                .addGap(112, 112, 112))
        );
        PersonaljPanel1Layout.setVerticalGroup(
            PersonaljPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PersonaljPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(PersonaljPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PersonaljPanel1Layout.createSequentialGroup()
                        .addGroup(PersonaljPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTemp)
                            .addComponent(txtTemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pulse2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PersonaljPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPluse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pulse)
                            .addComponent(lblPulse)))
                    .addGroup(PersonaljPanel1Layout.createSequentialGroup()
                        .addGroup(PersonaljPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblWeight)
                            .addComponent(Pulse5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PersonaljPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHeight)
                            .addComponent(Pulse4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PersonaljPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBP)
                    .addComponent(Pulse1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PersonaljPanel3.setBackground(new java.awt.Color(254, 254, 254));
        PersonaljPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Diagnosis", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 15), new java.awt.Color(95, 139, 162))); // NOI18N

        txtDiag.setColumns(20);
        txtDiag.setRows(5);
        jScrollPane2.setViewportView(txtDiag);

        javax.swing.GroupLayout PersonaljPanel3Layout = new javax.swing.GroupLayout(PersonaljPanel3);
        PersonaljPanel3.setLayout(PersonaljPanel3Layout);
        PersonaljPanel3Layout.setHorizontalGroup(
            PersonaljPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PersonaljPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PersonaljPanel3Layout.setVerticalGroup(
            PersonaljPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PersonaljPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PersonaljPanel4.setBackground(new java.awt.Color(254, 254, 254));
        PersonaljPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Symptoms", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 15), new java.awt.Color(95, 139, 162))); // NOI18N

        txtSym.setColumns(20);
        txtSym.setRows(5);
        jScrollPane3.setViewportView(txtSym);

        javax.swing.GroupLayout PersonaljPanel4Layout = new javax.swing.GroupLayout(PersonaljPanel4);
        PersonaljPanel4.setLayout(PersonaljPanel4Layout);
        PersonaljPanel4Layout.setHorizontalGroup(
            PersonaljPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PersonaljPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        PersonaljPanel4Layout.setVerticalGroup(
            PersonaljPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PersonaljPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAdd.setBackground(new java.awt.Color(254, 254, 254));
        btnAdd.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(100, 149, 162));
        btnAdd.setText("Submit");
        btnAdd.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        lblDOE.setBackground(new java.awt.Color(254, 254, 254));
        lblDOE.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblDOE.setForeground(new java.awt.Color(114, 150, 180));
        lblDOE.setText("Date of Encounter:");

        dcDOE.setBackground(new java.awt.Color(254, 254, 254));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(305, 305, 305))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(326, 326, 326))))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDOE)
                        .addGap(18, 18, 18)
                        .addComponent(dcDOE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(434, 434, 434))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PersonaljPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PersonaljPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                                .addComponent(PersonaljPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle1)
                .addGap(9, 9, 9)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDOE)
                    .addComponent(dcDOE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(PersonaljPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PersonaljPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PersonaljPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(108, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        backMethod();
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtHeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHeightActionPerformed

    private void txtPluseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPluseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPluseActionPerformed

    private void txtTempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTempActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTempActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
            String temperaturematch = "^([0-9]{1,2}(?:\\.[0-9]{1,2})?$)|(1[00][0-9]{1,2}(?:\\.[0-9]{1,3})?$)"; 
            Pattern tempValidate = Pattern.compile(temperaturematch);
            Matcher tempmatcher = tempValidate.matcher(txtTemp.getText());
            Boolean tempValue = tempmatcher.matches();  
        if(dcDOE.getDate() == null| txtBP.getText().isEmpty()|txtDiag.getText().isEmpty()|txtHeight.getText().isEmpty()|txtPluse.getText().isEmpty()|txtSym.getText().isEmpty()|txtTemp.getText().isEmpty()|txtWeight.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please fillup all the fields","Error",JOptionPane.ERROR_MESSAGE); 
        } else if(!txtHeight.getText().matches("^[0-9]+\\'?[0-9]+\\\"$")){
            JOptionPane.showMessageDialog(null, "Please enter valid Height in ft","Error",JOptionPane.ERROR_MESSAGE);
        }else if(tempValue == false){
            JOptionPane.showMessageDialog(null, "Please enter valid Temperature","Error",JOptionPane.ERROR_MESSAGE);
        }else if(!txtPluse.getText().matches("^([0-9]{1,2}$)|(1[0-9]{1,2}$)|(2[0-9]{1,2}$)")){
            JOptionPane.showMessageDialog(null, "Please enter valid Pluse","Error",JOptionPane.ERROR_MESSAGE);
        }else if(!txtWeight.getText().matches("\\b\\d+\\b")){
            JOptionPane.showMessageDialog(null, "Please enter valid Weight","Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(!txtBP.getText().matches("^\\d{1,3}\\/\\d{1,3}$")){
            JOptionPane.showMessageDialog(null, "Please enter valid blood Pressure","Error",JOptionPane.ERROR_MESSAGE);
        }else {
            VitalSigns vital = new VitalSigns();
            
            int age = patient.getAge();
            
             String[]bp = txtBP.getText().split("/");
             int first = Integer.parseInt(bp[0]);
             int Second = Integer.parseInt(bp[1]);
             
             if(age <=13 || age == 0){
                 if(first < 80 && Second < 40){
                    patient.setHighBP("Low");
                 } else if(first > 120 && Second > 80){
                     patient.setHighBP("High");
                 }
             }else if(age >=14  && age <=20){
                 if(first < 95 && Second < 60){
                    patient.setHighBP("Low");
                 } else if(first > 135 && Second > 80){
                     patient.setHighBP("High");
                 }
             }else if(age >=21  && age <=55){
                 if(first < 90 && Second < 50){
                    patient.setHighBP("Low");
                 } else if(first > 120 && Second > 80){
                     patient.setHighBP("High");
                 }
             }else if(age >=56  && age <=80){
                 if(first < 110 && Second < 70){
                    patient.setHighBP("Low");
                 } else if(first > 145 && Second > 90){
                     patient.setHighBP("High");
                 }
             } else{
                 patient.setHighBP("Normal");
             }
             
            DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
            Encounter encounter = patient.addEncounter();
            
            vital.setBp(txtBP.getText());
            vital.setPluse(Integer.parseInt(txtPluse.getText()));
            vital.setTemp(Double.parseDouble(txtTemp.getText()));
            vital.setHeight(txtHeight.getText());
            vital.setWeight(txtWeight.getText());
            
            encounter.setDate(fmt.format(dcDOE.getDate()));
            encounter.setDiagosis(txtDiag.getText());
            encounter.setSymptoms(txtSym.getText());
            encounter.setVitalSigns(vital);
            JOptionPane.showMessageDialog(this, "Supplier successfully added", "Success", JOptionPane.INFORMATION_MESSAGE);
            backMethod();
        }
        
    }//GEN-LAST:event_btnAddActionPerformed
    
    private void backMethod(){
        mainWorkArea.remove(this);
        Component[] componentArray = mainWorkArea.getComponents();
        Component component = componentArray[componentArray.length - 1];
        PatientProfileJPanel patientProfileJPanel = (PatientProfileJPanel) component;
        patientProfileJPanel.refreshTable();
        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.previous(mainWorkArea);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PersonaljPanel1;
    private javax.swing.JPanel PersonaljPanel3;
    private javax.swing.JPanel PersonaljPanel4;
    private javax.swing.JLabel Pulse;
    private javax.swing.JLabel Pulse1;
    private javax.swing.JLabel Pulse2;
    private javax.swing.JLabel Pulse4;
    private javax.swing.JLabel Pulse5;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private com.toedter.calendar.JDateChooser dcDOE;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblBP;
    private javax.swing.JLabel lblDOE;
    private javax.swing.JLabel lblHeight;
    private javax.swing.JLabel lblPulse;
    private javax.swing.JLabel lblTemp;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JTextField txtBP;
    private javax.swing.JTextArea txtDiag;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtPluse;
    private javax.swing.JTextArea txtSym;
    private javax.swing.JTextField txtTemp;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}