/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


import Business.Role.Role;
import Business.Role.TraficControlRoomRole;
import java.util.ArrayList;

/**
 *
 * @author DeepaliP
 */
public class TraficControlRoomOrganisation extends Organization {

    public TraficControlRoomOrganisation() {
        super(Organization.Type.TrafficControlRoom.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new TraficControlRoomRole());
        return roles;
    }
}
