/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CitizenstRole;
import Business.Role.PollutionDeterminingDeptRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author DeepaliP
 */
public class CitizenOrganisation extends Organization {

    public CitizenDirectory cD;

    public CitizenOrganisation() {
        super(Organization.Type.Citizens.getValue());
        cD = new CitizenDirectory();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new CitizenstRole());
        return roles;
    }

    public CitizenDirectory getcD() {
        return cD;
    }

    public void setcD(CitizenDirectory cD) {
        this.cD = cD;
    }
    

}
