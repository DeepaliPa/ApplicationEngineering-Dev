/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;

import Business.Organization.TraficManagementPatrolOrganisation;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.TraficManagementPatrolRole.TraficManagementPatrolWorkAreaJPanel;

/**
 *
 * @author DeepaliP
 */
public class TraficManagementPatrolRole extends Role {

    public TraficManagementPatrolRole() {
        super(Role.RoleType.TraficManagementPatrol.getValue());
    }
    
    

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new TraficManagementPatrolWorkAreaJPanel(userProcessContainer, account, (TraficManagementPatrolOrganisation) organization,enterprise, business);
    }
}
