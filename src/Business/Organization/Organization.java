/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.TrafficCityArrayList;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author DeepaliP
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter;
    private TrafficCityArrayList trafficCityArrayList;
    private CitizenDirectory citizenDirectory;

    public enum Type {

        Admin("Admin Organization"),
        TrafficControlRoom("TrafficControlRoom"),
        //FacilityControlRoom("FacilityControlRoom Organization"),
        TrafficManagementPatrol("TrafficManagementPatrol"),
        RegularMaintainance("RegularMaintainance"),
        PollutionDeterminationDept("PollutionDeterminationDept"),
        TrafficDeterminingDept("TrafficDeterminingDepts"),
        Citizens("Citizens"),
        Registrar("Registrar");

        // RegistrationOffice("RegistrationOffice Oraganization");
        private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
        trafficCityArrayList = new TrafficCityArrayList();
        

    }

    public abstract ArrayList<Role> getSupportedRole();

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public TrafficCityArrayList getTrafficCityArrayList() {
        return trafficCityArrayList;
    }

    public void setTrafficCityArrayList(TrafficCityArrayList trafficCityArrayList) {
        this.trafficCityArrayList = trafficCityArrayList;
    }

    public CitizenDirectory getCitizenDirectory() {
        return citizenDirectory;
    }

    public void setCitizenDirectory(CitizenDirectory citizenDirectory) {
        this.citizenDirectory = citizenDirectory;
    }

    
    @Override
    public String toString() {
        return name;
    }

}
