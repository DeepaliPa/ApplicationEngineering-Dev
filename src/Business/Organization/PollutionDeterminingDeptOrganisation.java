/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


import Business.Role.PollutionDeterminingDeptRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author DeepaliP
 */
public class PollutionDeterminingDeptOrganisation extends Organization {

    public PollutionDeterminingDeptOrganisation() {
        super(Organization.Type.PollutionDeterminationDept.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PollutionDeterminingDeptRole());
        return roles;
    }
}