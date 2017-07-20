/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author DeepaliP
 */
public class TrafficCityArrayList {

    private ArrayList<TrafficCityArrayListClass> trafficCityArrayList;

    public TrafficCityArrayList() {
        trafficCityArrayList = new ArrayList<>();
    }

    public ArrayList<TrafficCityArrayListClass> getTrafficCityArrayList() {
        return trafficCityArrayList;
    }

    public void setTrafficCityArrayList(ArrayList<TrafficCityArrayListClass> trafficCityArrayList) {
        this.trafficCityArrayList = trafficCityArrayList;
    }

    public TrafficCityArrayListClass add() {
        TrafficCityArrayListClass tc = new TrafficCityArrayListClass();
        trafficCityArrayList.add(tc);
        return tc;
    }

}
