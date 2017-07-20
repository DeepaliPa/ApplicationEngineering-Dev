/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.RegularMaintainanceDeptOrganisation;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.RegularMaintainanceDeptRole.RegularMaintainanceWorkAreaJPanel;

/**
 *
 * @author DeepaliP
 */
public class RegularMaintainanceDeptRole extends Role {

    public RegularMaintainanceDeptRole() {
        super(Role.RoleType.TraficManagementPatrol.getValue());
    }
    

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new RegularMaintainanceWorkAreaJPanel(userProcessContainer, account, (RegularMaintainanceDeptOrganisation) organization, enterprise);
    }
}
