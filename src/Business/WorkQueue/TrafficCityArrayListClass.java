/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import com.db4o.collections.ActivatableArrayList;
import java.util.ArrayList;

/**
 *
 * @author DeepaliP
 */
public class TrafficCityArrayListClass {

    private ArrayList<String> list1;
    private ArrayList<Integer> list2;

    public TrafficCityArrayListClass() {
        
        list1 = new ArrayList<String>();
        list2 = new ArrayList<Integer>();
    }

    public ArrayList<String> getList1() {
        return list1;
    }

    public void setList1(ArrayList<String> list1) {
        this.list1 = list1;
    }

    public ArrayList<Integer> getList2() {
        return list2;
    }

    public void setList2(ArrayList<Integer> list2) {
        this.list2 = list2;
    }
    

}
