/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.CitizenOrganisation;
import Business.Organization.Organization;
import Business.Organization.PollutionDeterminingDeptOrganisation;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.CitizenOrganisationRole.CitizenOrganisationWorkAreaJPanel;
import userinterface.PollutionDeterminingDeptRole.PollutionDeterminingDeptWorkAreaJPanel;

/**
 *
 * @author DeepaliP
 */
public class CitizenstRole extends Role {

    public CitizenstRole() {
        
        super(Role.RoleType.Citizen.getValue());
    }
    

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new CitizenOrganisationWorkAreaJPanel(userProcessContainer, account, (CitizenOrganisation) organization, enterprise);
    }
}
