/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;



/**
 *
 * @author aelinadas
 */
public class Uber {
    
    private String carName;
    private int manufactureYear;
    private int seats;
    private String serialNumber;
    private String modelNumber;
    private String city;
    private boolean maintenanceCertificate;
    private boolean availability;

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean getMaintenanceCertificate() {
        return maintenanceCertificate;
    }

    public void setMaintenanceCertificate(boolean maintenanceCertificate) {
        this.maintenanceCertificate= maintenanceCertificate;
    }

    public boolean getAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability= availability;
    }
    
    @Override
    public String toString(){
        return carName;
    }
    
}
