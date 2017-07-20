/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CitizenstRole;
import Business.Role.RegistrarRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author DeepaliP
 */
public class RegistrarOrganization extends Organization{

    public RegistrarOrganization() {
        super(Organization.Type.Registrar.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new RegistrarRole());
        return roles;
    }
    
}
