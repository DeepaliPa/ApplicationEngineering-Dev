/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class TrafficDeterToPollutionDeterDept extends WorkRequest{
    
    private String testResult;
    private ArrayList<Integer> listt1;
    private ArrayList<String> listt2;

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public ArrayList<Integer> getListt1() {
        return listt1;
    }

    public void setListt1(ArrayList<Integer> listt1) {
        this.listt1 = listt1;
    }

    public ArrayList<String> getListt2() {
        return listt2;
    }

    public void setListt2(ArrayList<String> listt2) {
        this.listt2 = listt2;
    }
    
    
}
