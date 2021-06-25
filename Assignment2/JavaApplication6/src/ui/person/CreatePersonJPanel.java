/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.person;

import java.awt.CardLayout;
import java.awt.Component;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.person.City;
import model.person.Community;
import model.person.House;
import model.person.Person;
import model.person.PersonDirectory;

/**
 *
 * @author dhairyasheel
 */
public class CreatePersonJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreatePersonJPanel
     */
    JPanel mainWorkArea;
    PersonDirectory personDirectory;
    public CreatePersonJPanel(JPanel mainWorkArea,PersonDirectory personDirectory) {
        initComponents();
        this.mainWorkArea = mainWorkArea;
        this.personDirectory = personDirectory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addjPanel1 = new javax.swing.JPanel();
        lblStreet = new javax.swing.JLabel();
        txtStreet = new javax.swing.JTextField();
        lblPin = new javax.swing.JLabel();
        txtPin = new javax.swing.JTextField();
        lblCom = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        lblState = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        txtCom = new javax.swing.JTextField();
        PersonaljPanel = new javax.swing.JPanel();
        txtID = new javax.swing.JTextField();
        lblID = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblDOB = new javax.swing.JLabel();
        dcDOB = new com.toedter.calendar.JDateChooser();
        txtAge = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        GenderJC = new javax.swing.JComboBox<>();
        btnAddPer = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblTitle1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(254, 254, 254));

        addjPanel1.setBackground(new java.awt.Color(254, 254, 254));
        addjPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "House and Community", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 15), new java.awt.Color(95, 139, 162))); // NOI18N

        lblStreet.setBackground(new java.awt.Color(254, 254, 254));
        lblStreet.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblStreet.setForeground(new java.awt.Color(114, 150, 180));
        lblStreet.setText("Street:");

        txtStreet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStreetActionPerformed(evt);
            }
        });

        lblPin.setBackground(new java.awt.Color(254, 254, 254));
        lblPin.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblPin.setForeground(new java.awt.Color(114, 150, 180));
        lblPin.setText("Pin code:");

        lblCom.setBackground(new java.awt.Color(254, 254, 254));
        lblCom.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblCom.setForeground(new java.awt.Color(114, 150, 180));
        lblCom.setText("Community:");

        lblCity.setBackground(new java.awt.Color(254, 254, 254));
        lblCity.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblCity.setForeground(new java.awt.Color(114, 150, 180));
        lblCity.setText("City:");

        lblState.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        lblState.setForeground(new java.awt.Color(99, 119, 145));
        lblState.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblState.setText("State:");

        txtState.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addjPanel1Layout = new javax.swing.GroupLayout(addjPanel1);
        addjPanel1.setLayout(addjPanel1Layout);
        addjPanel1Layout.setHorizontalGroup(
            addjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addjPanel1Layout.createSequentialGroup()
                .addContainerGap(174, Short.MAX_VALUE)
                .addGroup(addjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblState)
                    .addComponent(lblCom)
                    .addComponent(lblPin)
                    .addComponent(lblCity)
                    .addComponent(lblStreet))
                .addGap(18, 18, 18)
                .addGroup(addjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addjPanel1Layout.createSequentialGroup()
                        .addGroup(addjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPin, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(277, 277, 277))
                    .addGroup(addjPanel1Layout.createSequentialGroup()
                        .addComponent(txtCom, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))))
        );
        addjPanel1Layout.setVerticalGroup(
            addjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addjPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStreet))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPin)
                    .addComponent(txtPin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCom)
                    .addComponent(txtCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblState))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PersonaljPanel.setBackground(new java.awt.Color(254, 254, 254));
        PersonaljPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Personal Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 15), new java.awt.Color(95, 139, 162))); // NOI18N

        txtID.setDisabledTextColor(new java.awt.Color(28, 21, 14));
        txtID.setEnabled(false);

        lblID.setBackground(new java.awt.Color(254, 254, 254));
        lblID.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblID.setForeground(new java.awt.Color(114, 150, 180));
        lblID.setText("Unique Person ID:");

        lblName.setBackground(new java.awt.Color(254, 254, 254));
        lblName.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblName.setForeground(new java.awt.Color(114, 150, 180));
        lblName.setText("Name:");

        lblDOB.setBackground(new java.awt.Color(254, 254, 254));
        lblDOB.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblDOB.setForeground(new java.awt.Color(114, 150, 180));
        lblDOB.setText("Date of Birth:");

        dcDOB.setBackground(new java.awt.Color(254, 254, 254));

        txtAge.setCaretColor(new java.awt.Color(45, 45, 24));
        txtAge.setEnabled(false);

        lblAge.setBackground(new java.awt.Color(254, 254, 254));
        lblAge.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblAge.setForeground(new java.awt.Color(114, 150, 180));
        lblAge.setText("Age:");

        lblGender.setBackground(new java.awt.Color(254, 254, 254));
        lblGender.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblGender.setForeground(new java.awt.Color(114, 150, 180));
        lblGender.setText("Gender:");

        GenderJC.setBackground(new java.awt.Color(254, 254, 254));
        GenderJC.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        GenderJC.setForeground(new java.awt.Color(120, 149, 162));
        GenderJC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        GenderJC.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout PersonaljPanelLayout = new javax.swing.GroupLayout(PersonaljPanel);
        PersonaljPanel.setLayout(PersonaljPanelLayout);
        PersonaljPanelLayout.setHorizontalGroup(
            PersonaljPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PersonaljPanelLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(PersonaljPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PersonaljPanelLayout.createSequentialGroup()
                        .addComponent(lblGender)
                        .addGap(18, 18, 18)
                        .addComponent(GenderJC, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PersonaljPanelLayout.createSequentialGroup()
                        .addGroup(PersonaljPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PersonaljPanelLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(PersonaljPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDOB)
                                    .addComponent(lblName)))
                            .addComponent(lblID, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblAge, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(PersonaljPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtID)
                            .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dcDOB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(297, Short.MAX_VALUE))
        );
        PersonaljPanelLayout.setVerticalGroup(
            PersonaljPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PersonaljPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PersonaljPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PersonaljPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PersonaljPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDOB)
                    .addComponent(dcDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PersonaljPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PersonaljPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(GenderJC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        btnAddPer.setBackground(new java.awt.Color(254, 254, 254));
        btnAddPer.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnAddPer.setForeground(new java.awt.Color(100, 149, 162));
        btnAddPer.setText("Create Person");
        btnAddPer.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAddPer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPerActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(109, 144, 149));
        lblTitle.setText("Person Directory");

        lblTitle1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblTitle1.setForeground(new java.awt.Color(109, 144, 149));
        lblTitle1.setText("Create New Person");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(btnAddPer, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addjPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PersonaljPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(lblTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(310, 310, 310)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(310, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PersonaljPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addjPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddPer, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(289, 289, 289)
                    .addComponent(lblTitle)
                    .addContainerGap(290, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddPerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPerActionPerformed
        // TODO add your handling code here:
        
        if(dcDOB.getDate() == null |txtCity.getText().isEmpty() ||txtStreet.getText().isEmpty()||txtPin.getText().isEmpty() ||txtState.getText().isEmpty() ||txtName.getText().isEmpty() ||txtCity.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter all the fields", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if(!txtName.getText().matches("^[a-zA-Z]+$")){
            JOptionPane.showMessageDialog(null, "Please enter only characters in Name","Error",JOptionPane.ERROR_MESSAGE);
        }else if(!txtCity.getText().matches("^[a-zA-Z]+$")){
            JOptionPane.showMessageDialog(null, "Please enter only characters in City","Error",JOptionPane.ERROR_MESSAGE);
        }else if(!txtState.getText().matches("^[a-zA-Z]+$")){
            JOptionPane.showMessageDialog(null, "Please enter only characters in State","Error",JOptionPane.ERROR_MESSAGE);
        }else if(!txtCom.getText().matches("^[a-zA-Z]+$")){
            JOptionPane.showMessageDialog(null, "Please enter only characters in Community","Error",JOptionPane.ERROR_MESSAGE);
        }else{
            DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
            DateFormat year = new SimpleDateFormat("yyyy");
            int ageDiff = 0;
            int DOB = Integer.parseInt(year.format(dcDOB.getDate()));
            ageDiff = 2021-DOB;
            
            int pin = 0;
            try{
                pin = Integer.parseInt(txtPin.getText()); 
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Please enter PINCODE in numerical format");
                return;
            }
            House house = new House();
            house.setStreet(txtStreet.getText());
            house.setPin(pin);
            house.setState(txtState.getText());
            house.setCommunity(txtCom.getText());
            house.setCity(txtCity.getText());
            
            Person person = personDirectory.addPerson();
            person.setName(txtName.getText());
            txtAge.setText(String.valueOf(ageDiff));
            person.setAge(ageDiff);
            person.setDate(fmt.format(dcDOB.getDate()));
            person.setGender((String) GenderJC.getSelectedItem());
            person.setAddress(house);
            
            City city =  new City();
            city.setCity(txtCity.getText());

            boolean compresent = false;
            List<Community> c = city.getCommunityList();
            for(Community com : c){
               if(com.equals(txtCom.getText())){
                    compresent = true;
                    com.addHouse(house);
                    return;
               }
            }
            if(!compresent){
                Community community = city.addCommunity();
                community.setCommunity(txtCom.getText());
                community.addHouse(house);
            }
            person.setCity(city);
            JOptionPane.showMessageDialog(this, "Supplier successfully added", "Success", JOptionPane.INFORMATION_MESSAGE);

            backMethod();
        }
    }//GEN-LAST:event_btnAddPerActionPerformed

    private void txtStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStateActionPerformed

    private void txtStreetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStreetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStreetActionPerformed

    private void backMethod(){
        mainWorkArea.remove(this);
        Component[] componentArray = mainWorkArea.getComponents();
        Component component = componentArray[componentArray.length - 1];
        PersonDirectoryJPanel personDirectoryJPanel = (PersonDirectoryJPanel) component;
        personDirectoryJPanel.refreshTable();
        personDirectoryJPanel.populateCombo();
        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.previous(mainWorkArea);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> GenderJC;
    private javax.swing.JPanel PersonaljPanel;
    private javax.swing.JPanel addjPanel1;
    private javax.swing.JButton btnAddPer;
    private com.toedter.calendar.JDateChooser dcDOB;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCom;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPin;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblStreet;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCom;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPin;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtStreet;
    // End of variables declaration//GEN-END:variables
}
