/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author aelinadas
 */
public class VitalSignHistory {
    
    private ArrayList<VitalSigns> vitalSignHistory;
    
    public VitalSignHistory(){
        vitalSignHistory = new ArrayList<VitalSigns>();
    }

    public ArrayList<VitalSigns> getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(ArrayList<VitalSigns> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    
    public VitalSigns addVitals(){
        VitalSigns vs = new VitalSigns();
        vitalSignHistory.add(vs);
        return vs;
    }
    
    public void deleteVitals(VitalSigns vitalSigns){
        vitalSignHistory.remove(vitalSigns);
    }
    
    public ArrayList<VitalSigns> getAbnormalList(double max, double min){
        ArrayList<VitalSigns> list = new ArrayList<>();
        for(VitalSigns vs: this.getVitalSignHistory()){
            if(vs.getBloodPressure() < min || vs.getBloodPressure() > max){
                list.add(vs);
            }
        }
        return list;
    }
}
