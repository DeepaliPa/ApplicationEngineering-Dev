/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Registration;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.CitizenOrganisation;
import Business.Organization.Citizens;
import Business.Organization.Organization;
import static Business.Organization.Organization.Type.Citizens;
import Business.Organization.RegistrarOrganization;
import Business.Organization.RegularMaintainanceDeptOrganisation;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static userinterface.Registration.MailSender.emailBody;
import static userinterface.Registration.MailSender.emailSubject;

/**
 *
 * @author DeepaliP
 */
public class RegistrationWorkAreaPanel extends javax.swing.JPanel {

    /**
     * Creates new form RegistrationWorkAreaPanel
     */
    private JPanel userProcessContainer;
    private RegistrarOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private CitizenOrganisation ho;
    private Employee emp;

    public RegistrationWorkAreaPanel(JPanel userProcessContainer, UserAccount account, RegistrarOrganization organization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        valueLabel.setText(enterprise.getName());
        popOrganizationComboBox();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegister = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtVehicleNumber = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTelephoneNumber = new javax.swing.JTextField();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtEmailId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        passwordJTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        organizationJComboBox = new javax.swing.JComboBox();
        nameJTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        roleJComboBox = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        txtOne = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtlastName = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        btnRegister.setBackground(new java.awt.Color(204, 204, 255));
        btnRegister.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegister.setText("REGISTER");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("LAST NAME");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("VEHICLE NUMBER");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("TELEPHONE NUMBER");

        valueLabel.setBackground(new java.awt.Color(204, 204, 255));
        valueLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        enterpriseLabel.setBackground(new java.awt.Color(204, 204, 255));
        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("ENTERPRISE");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("EMAIL ID");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("PASSWORD");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("ORGANIZATION");

        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("ROLE");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("USERNAME");

        jLabel6.setBackground(new java.awt.Color(204, 204, 255));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel6.setText("REGISTRATION WORK AREA PANEL");

        txtOne.setEditable(false);
        txtOne.setText("1");

        jLabel10.setBackground(new java.awt.Color(204, 204, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("FIRST NAME");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel5)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(btnRegister, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)))
                                    .addGap(66, 66, 66)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtVehicleNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtEmailId)
                                                .addComponent(nameJTextField)
                                                .addComponent(passwordJTextField)
                                                .addComponent(organizationJComboBox, 0, 172, Short.MAX_VALUE)
                                                .addComponent(roleJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtOne, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtTelephoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtlastName, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(129, 129, 129)
                                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(360, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtlastName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVehicleNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTelephoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addComponent(txtOne, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roleJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(passwordJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
 public void popOrganizationComboBox() {
        organizationJComboBox.removeAllItems();

        for (Organization o1 : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (o1 instanceof CitizenOrganisation) {
                organizationJComboBox.addItem(o1);
            }
        }
    }

    private void populateRoleComboBox(Organization organiz) {
        roleJComboBox.removeAllItems();
        for (Role role : organiz.getSupportedRole()) {
            roleJComboBox.addItem(role);
        }
    }
    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        Pattern p = Pattern.compile("[a-zA-Z0-9_.]*@[a-zA-Z]*.[a-zA-Z]*");
        Matcher m = p.matcher(txtEmailId.getText());
        boolean bm = m.matches();

        if (nameJTextField.getText().matches("[a-zA-Z0-9]+")
                & String.valueOf(passwordJTextField.getText()).matches("[a-zA-Z0-9]+")
                & txtFirstName.getText().matches("[a-zA-Z]+")
                & txtlastName.getText().matches("[a-zA-Z]+")
                & txtVehicleNumber.getText().matches("[1-9]+")
                & (!txtEmailId.getText().equals("") & bm == true)
                & (txtTelephoneNumber.getText().matches("\\d{10}"))
                & (!txtTelephoneNumber.getText().matches("[a-zA-Z]+"))) {
            String firstName = txtFirstName.getText();
            String lastName = txtlastName.getText();
            String name = firstName + lastName;
            String vehicle_no = txtVehicleNumber.getText();
            String phone_no = txtOne.getText() + txtTelephoneNumber.getText();
            String email_id = txtEmailId.getText();

            for (Organization or : enterprise.getOrganizationDirectory().getOrganizationList()) {

                if (or instanceof CitizenOrganisation) {
                    ho = (CitizenOrganisation) or;
                    emp = ho.getEmployeeDirectory().createEmployee(name);

                }
            }
            
            for(Citizens citiz:ho.cD.getCitizensdirectory()){
                if(citiz.getVehicle_no().equals(vehicle_no)){
                    JOptionPane.showMessageDialog(null, "Vehicle no already registered!");
                    return;
                }
            }

            Citizens c = ho.cD.addCitizens();
            c.setTelephone_no(phone_no);
            c.setVehicle_no(vehicle_no);
            c.setEmail_id(email_id);
            
            

            String userName = nameJTextField.getText();
            String password = passwordJTextField.getText();
            Organization o3 = (Organization) organizationJComboBox.getSelectedItem();
            // Employee employee = (Employee) employeeJComboBox.getSelectedItem();
            Role role = (Role) roleJComboBox.getSelectedItem();

            for (UserAccount u : o3.getUserAccountDirectory().getUserAccountList()) {
                if (u.getUsername().equals(userName)) {
                    JOptionPane.showMessageDialog(null, "Username name already exists");
                    return;
                }
            }

            o3.getUserAccountDirectory().createUserAccount(userName, password, emp, role);

            MailSender mailSender = new MailSender(email_id, emailSubject, emailBody);
             try {
                            // Construct data
                            String data = "";
                            /*
                             * Note the suggested encoding for certain parameters, notably
                             * the username, password and especially the message.  ISO-8859-1
                             * is essentially the character set that we use for message bodies,
                             * with a few exceptions for e.g. Greek characters.  For a full list,
                             * see:  http://developer.bulksms.com/eapi/submission/character-encoding/
                             */
                            data += "username=" + URLEncoder.encode("BhaktiHalkude", "ISO-8859-1");
                            data += "&password=" + URLEncoder.encode("BhaktiHalkude", "ISO-8859-1");
                            data += "&message=" + URLEncoder.encode("This is a test", "ISO-8859-1");
                            data += "&want_report=1";
                            data += "&msisdn=" + phone_no;

         
                            // Please see the FAQ regarding HTTPS (port 443) and HTTP (port 80/5567)
                            URL url = new URL("http://usa.bulksms.com/eapi/submission/send_sms/2/2.0");

                            URLConnection conn = url.openConnection();
                            conn.setDoOutput(true);
                            OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
                            wr.write(data);
                            wr.flush();

                            // Get the response
                            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                            String line;
                            while ((line = rd.readLine()) != null) {
                        // Print the response output...

                            }
                            wr.close();
                            rd.close();
                            JOptionPane.showMessageDialog(null, "Message Sent Successfully");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
            nameJTextField.setText("");
            passwordJTextField.setText("");
            txtFirstName.setText("");
            txtlastName.setText("");
            txtVehicleNumber.setText("");
            txtTelephoneNumber.setText("");
            txtEmailId.setText("");

            JOptionPane.showMessageDialog(null, "Citizen created and Registration email sent Successfully");
        } else {
            JOptionPane.showMessageDialog(null, "Please enter proper input value");
        }

    }//GEN-LAST:event_btnRegisterActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        Organization o2 = (Organization) organizationJComboBox.getSelectedItem();
        if (o2 != null) {
            populateRoleComboBox(o2);
        }
    }//GEN-LAST:event_organizationJComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTextField passwordJTextField;
    private javax.swing.JComboBox roleJComboBox;
    private javax.swing.JTextField txtEmailId;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtOne;
    private javax.swing.JTextField txtTelephoneNumber;
    private javax.swing.JTextField txtVehicleNumber;
    private javax.swing.JTextField txtlastName;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}