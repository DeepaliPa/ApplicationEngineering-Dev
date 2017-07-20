/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.TraficDeterminingDeptOrganisation;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.TraficDeterminingDeptRole.TraficDeterminingDeptWorkAreaJPanel;

/**
 *
 * @author DeepaliP
 */
public class TraficDeterminingDeptRole extends Role {

    public TraficDeterminingDeptRole() {
        super(Role.RoleType.TraficDeterminingDept.getValue());
    }
    

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new TraficDeterminingDeptWorkAreaJPanel(userProcessContainer, account, (TraficDeterminingDeptOrganisation) organization, enterprise);
    }
}
