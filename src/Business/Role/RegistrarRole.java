/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.RegistrarOrganization;
import Business.Organization.RegularMaintainanceDeptOrganisation;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.Registration.RegistrationWorkAreaPanel;
import userinterface.RegularMaintainanceDeptRole.RegularMaintainanceWorkAreaJPanel;

/**
 *
 * @author DeepaliP
 */
public class RegistrarRole extends Role {

    public RegistrarRole() {
        super(Role.RoleType.PollutionDeterminingDept.getValue());
    }
    

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new RegistrationWorkAreaPanel(userProcessContainer, account, (RegistrarOrganization) organization, enterprise);
    }
}
