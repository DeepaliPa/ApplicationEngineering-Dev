/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.TraficDeterminingDeptRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.CitizenOrganisation;
import Business.Organization.Citizens;
import Business.Organization.Organization;
import Business.Organization.PollutionDeterminingDeptOrganisation;
import Business.Organization.TraficControlRoomOrganisation;

import Business.Organization.TraficDeterminingDeptOrganisation;
import Business.Organization.TraficManagementPatrolOrganisation;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.TrafficCityArrayListClass;
import Business.WorkQueue.TrafficDeterToPollutionDeterDept;

import Business.WorkQueue.TrafficDeterminingDeptToTrafficControl;

import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author DeepaliP
 */
public class TraficDeterminingDeptWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private TraficDeterminingDeptOrganisation organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private ArrayList<Integer> list1;
    private ArrayList<String> list;
    private ArrayList<Integer> list2;
    private ArrayList<String> list3;
    int loopValue;

    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public TraficDeterminingDeptWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, TraficDeterminingDeptOrganisation organization, Enterprise enterprise) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        valueLabel.setText(enterprise.getName());
        list3 = new ArrayList<String>();
        populateDisplayTable();

    }

    public void populateDisplayTable() {
        list = new ArrayList<String>();
        list1 = new ArrayList<Integer>();
        list2 = new ArrayList<Integer>();

        //Adding values to the ArrayList
        list.add("Allston");
        list.add("Brighton");
        list.add("Fenway Kenmore");
        list.add("Mission Hill");
        list.add("Jamaica Plain");
        list.add("Roxbury");
        list.add("Downtown");
        list.add("CharlesTown");
        list.add("Back Bay");
        list.add("Dorchester");
        list.add("South End");
        list.add("Bay Village");
        list.add("South Boston");
        list.add("East Boston");

        DefaultTableModel model = (DefaultTableModel) tblTrafficDetermination.getModel();

        Random r = new Random();
        int Low = 10;
        int High = 80;

        model.setRowCount(0);
        for (int i = 0; i < list.size(); i++) {

            Object[] row = new Object[2];
            row[0] = list.get(i);

            row[1] = r.nextInt(High - Low) + Low;
            list2.add((Integer) row[1]);
            list1.add((Integer) row[1]);

            model.addRow(row);

        }
        Collections.sort(list1);
        messageJTextField.setText(String.valueOf(list1.get(13)));
        populateChart();
        for (int i = 0; i < tblTrafficDetermination.getRowCount(); i++) {
            int cellValue = (Integer) tblTrafficDetermination.getValueAt(i, 1);

            if (cellValue == list1.get(13)) {

                loopValue = i;

            }

        }

        RowTable table = new RowTable(model);
        table.setRowColor(1, Color.YELLOW);

    }

    public void populateChart() {

        Integer[] var = list2.toArray(new Integer[list2.size()]);

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(var[0], "Traffic", "Allston");
        dataset.setValue(var[1], "Traffic", "Brighton");
        dataset.setValue(var[2], "Traffic", "Fenway Kenmore");
        dataset.setValue(var[3], "Traffic", "Mission Hill");
        dataset.setValue(var[4], "Traffic", "Jamaica Plain");
        dataset.setValue(var[5], "Traffic", "Roxbury");
        dataset.setValue(var[6], "Traffic", "Downtown");
        dataset.setValue(var[7], "Traffic", "CharlesTown");
        dataset.setValue(var[8], "Traffic", "Back Bay");
        dataset.setValue(var[9], "Traffic", "Dorchester");
        dataset.setValue(var[10], "Traffic", "South End");
        dataset.setValue(var[11], "Traffic", "Bay Village");
        dataset.setValue(var[12], "Traffic", "South Boston");
        dataset.setValue(var[13], "Traffic", "East Boston");

        JFreeChart chart = ChartFactory.createBarChart("Traffic %", "", "", dataset, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.BLACK);
        ChartFrame frame = new ChartFrame("BarChart", chart);
        frame.setVisible(true);
        frame.setSize(450, 350);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        messageJTextField = new javax.swing.JTextField();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTrafficDetermination = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnSendRequest = new javax.swing.JButton();
        btnSendToPollutionDept = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        messageJTextField.setBackground(new java.awt.Color(255, 153, 153));
        messageJTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        valueLabel.setBackground(new java.awt.Color(204, 204, 255));
        valueLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        enterpriseLabel.setBackground(new java.awt.Color(204, 204, 255));
        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("ENTERPRISE");

        tblTrafficDetermination.setBackground(new java.awt.Color(204, 204, 255));
        tblTrafficDetermination.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblTrafficDetermination.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "City", "Traffic in %"
            }
        ));
        jScrollPane1.setViewportView(tblTrafficDetermination);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("HIGHEST TRAFFIC VALUE");

        btnSendRequest.setBackground(new java.awt.Color(204, 204, 255));
        btnSendRequest.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSendRequest.setText("SEND TO CONTROL ROOM");
        btnSendRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendRequestActionPerformed(evt);
            }
        });

        btnSendToPollutionDept.setBackground(new java.awt.Color(204, 204, 255));
        btnSendToPollutionDept.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSendToPollutionDept.setText("SEND TO POLLUTION DEPT");
        btnSendToPollutionDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendToPollutionDeptActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(204, 204, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setText("TRAFFIC DETERMNING DEPT WORK AREA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 190, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(824, 824, 824))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30)
                        .addComponent(messageJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(541, 541, 541))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSendRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(btnSendToPollutionDept)))
                        .addGap(410, 410, 410))))
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(137, 137, 137)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(messageJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(287, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSendToPollutionDept, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSendRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(206, 206, 206))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendRequestActionPerformed

        TrafficDeterminingDeptToTrafficControl req1 = new TrafficDeterminingDeptToTrafficControl();
        req1.setMessage(messageJTextField.getText());
        req1.setSender(userAccount);
        req1.setStatus("Sent");

        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof TraficControlRoomOrganisation) {
                org = organization;
                break;
            }
        }
        if (org != null) {
            org.getWorkQueue().getWorkRequestList().add(req1);
            userAccount.getWorkQueue().getWorkRequestList().add(req1);
        }
        JOptionPane.showMessageDialog(null, "Request Sent Successfully");


    }//GEN-LAST:event_btnSendRequestActionPerformed

    private void btnSendToPollutionDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendToPollutionDeptActionPerformed
        TrafficDeterToPollutionDeterDept req = new TrafficDeterToPollutionDeterDept();
        req.setMessage("Sent");
        req.setSender(userAccount);
        req.setStatus("Sent");

        for (Organization oz : enterprise.getOrganizationDirectory().getOrganizationList()) {

            TrafficCityArrayListClass tc = oz.getTrafficCityArrayList().add();
            tc.setList1(list);
            tc.setList2(list2);

        }

        Organization org1 = null;
        for (Organization organization1 : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization1 instanceof PollutionDeterminingDeptOrganisation) {
                org1 = organization1;
                break;
            }
        }
        if (org1 != null) {
            org1.getWorkQueue().getWorkRequestList().add(req);
            userAccount.getWorkQueue().getWorkRequestList().add(req);
        }
        JOptionPane.showMessageDialog(null, "Request Sent Successfully");
    }//GEN-LAST:event_btnSendToPollutionDeptActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSendRequest;
    private javax.swing.JButton btnSendToPollutionDept;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField messageJTextField;
    private javax.swing.JTable tblTrafficDetermination;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
