/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author DeepaliP
 */
public class CitizenDirectory {

    private ArrayList<Citizens> citizensdirectory;

    public CitizenDirectory() {
        citizensdirectory = new ArrayList<>();
    }

    public ArrayList<Citizens> getCitizensdirectory() {
        return citizensdirectory;
    }

    public void setCitizensdirectory(ArrayList<Citizens> citizensdirectory) {
        this.citizensdirectory = citizensdirectory;
    }

    public Citizens addCitizens() {

        Citizens citizens = new Citizens();
        citizensdirectory.add(citizens);
        return citizens;
    }

}
