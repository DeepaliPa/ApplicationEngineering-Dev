/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author DeepaliP
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Type type) {
        Organization organization = null;

        if (type.getValue().equals(Type.TrafficControlRoom.getValue())) {
            organization = new TraficControlRoomOrganisation();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.TrafficManagementPatrol.getValue())) {
            organization = new TraficManagementPatrolOrganisation();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.RegularMaintainance.getValue())) {
            organization = new RegularMaintainanceDeptOrganisation();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.PollutionDeterminationDept.getValue())) {
            organization = new PollutionDeterminingDeptOrganisation();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.TrafficDeterminingDept.getValue())) {
            organization = new TraficDeterminingDeptOrganisation();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Citizens.getValue())) {
            organization = new CitizenOrganisation();
            organizationList.add(organization);
        }
//        else if (type.getValue().equals(Type.Registrar.getValue())) {
//            organization = new RegistrarOrganization();
//            organizationList.add(organization);
//        }

        return organization;
    }
}
