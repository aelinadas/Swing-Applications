/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author aelinadas
 */

public class UberDirectory {
    private ArrayList<Uber> uberDirectory;
    private String lastModified;

    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }
    
    public UberDirectory(){
        this.uberDirectory = new ArrayList<Uber>();
        DateFormat date = new SimpleDateFormat("MM/DD/YYYY HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        this.lastModified = date.format(cal.getTime());
    }

    public ArrayList<Uber> getUberDirectory() {
        return uberDirectory;
    }

    public void setUberDirectory(ArrayList<Uber> UberDirectory) {
        this.uberDirectory = UberDirectory;
    }
    
    public Uber addCar(){
        Uber uber = new Uber();
        uberDirectory.add(uber);
        return uber;
    }
    
    public void deleteCar(Uber uber){
        uberDirectory.remove(uber);
    }
    
    public ArrayList searchFirstAvailableCar(String city){
        ArrayList<Uber> list = new ArrayList<Uber>();
        for(Uber uber: uberDirectory){
            if(uber.getAvailability() && uber.getCity().equalsIgnoreCase(city)){
                list.add(uber);
            }
        }
        if(list != null && !list.isEmpty()){
            return list;
        }
        return null;     
    }
    
    public ArrayList<Uber> getMaxMin(int max, int min){
        ArrayList<Uber> list = new ArrayList<>();
        for(Uber uber: uberDirectory){
            if(uber.getAvailability() && uber.getSeats() <= max && uber.getSeats() >= min){
                list.add(uber);
            }
        } 
        if(list != null && !list.isEmpty()){
            return list;
        }
        return null;
    }
}
