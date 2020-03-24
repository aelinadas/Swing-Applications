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
public class DefaultUber {
    
    private UberDirectory uberDirectory;
    
    public DefaultUber(UberDirectory uberDirectory){
        this.uberDirectory = uberDirectory;
        defaultCarList();    
    }
    
    private void defaultCarList(){
        Uber car1 = uberDirectory.addCar();
        car1.setCarName("Ferrari");
        car1.setCity("Boston");
        car1.setModelNumber("F11");
        car1.setSerialNumber("2");
        car1.setSeats(2);
        car1.setManufactureYear(2011);
        car1.setMaintenanceCertificate(true);
        car1.setAvailability(true);
        
        
        Uber car2 = uberDirectory.addCar();
        car2.setCarName("BMW");
        car2.setCity("New York");
        car2.setModelNumber("T1");
        car2.setSerialNumber("2");
        car2.setSeats(4);
        car2.setManufactureYear(2015);
        car2.setMaintenanceCertificate(false);
        car2.setAvailability(true);
        
        
        Uber car3 = uberDirectory.addCar();
        car3.setCarName("Toyota");
        car3.setCity("Chicago");
        car3.setModelNumber("G1");
        car3.setSerialNumber("18");
        car3.setSerialNumber("3");
        car3.setSeats(6);
        car3.setManufactureYear(2019);
        car3.setMaintenanceCertificate(false);
        car3.setAvailability(true);
        
        
        Uber car4 = uberDirectory.addCar();
        car4.setCarName("GM");
        car4.setCity("New Jersey");
        car4.setModelNumber("X1");
        car4.setSerialNumber("12");
        car4.setSeats(4);
        car4.setManufactureYear(2019);
        car4.setMaintenanceCertificate(false);
        car4.setAvailability(true);
        
        Uber car5 = uberDirectory.addCar();
        car5.setCarName("Mustang");
        car5.setCity("California");
        car5.setModelNumber("G3");
        car5.setSerialNumber("11");
        car5.setSeats(4);
        car5.setManufactureYear(2019);
        car5.setMaintenanceCertificate(true);
        car5.setAvailability(true);
        
        
        Uber car6 = uberDirectory.addCar();
        car6.setCarName("Toyota");
        car6.setCity("Dallas");
        car6.setModelNumber("G1");
        car6.setSerialNumber("15");
        car6.setSeats(6);
        car6.setManufactureYear(2011);
        car6.setMaintenanceCertificate(false);
        car6.setAvailability(true);
        
        
        Uber car7 = uberDirectory.addCar();
        car7.setCarName("Hyundai");
        car7.setCity("New York");
        car7.setModelNumber("SUV");
        car7.setSerialNumber("11");
        car7.setSeats(4);
        car7.setManufactureYear(2000);
        car7.setMaintenanceCertificate(true);
        car7.setAvailability(false);
        
        
        Uber car8 = uberDirectory.addCar();
        car8.setCarName("Mercedes");
        car8.setCity("Boston");
        car8.setModelNumber("F3");
        car8.setSerialNumber("146");
        car8.setSeats(6);
        car8.setManufactureYear(2019);
        car8.setMaintenanceCertificate(false);
        car8.setAvailability(true);
        
        
        Uber car9 = uberDirectory.addCar();
        car9.setCarName("Ford");
        car9.setCity("Los Angeles");
        car9.setModelNumber("G5");
        car9.setSerialNumber("7");
        car9.setSeats(2);
        car9.setManufactureYear(2001);
        car9.setMaintenanceCertificate(true);
        car9.setAvailability(true);
        
        
        Uber car10 = uberDirectory.addCar();
        car10.setCarName("Toyota");
        car10.setCity("New York");
        car10.setModelNumber("F2");
        car10.setSerialNumber("1");
        car10.setSeats(6);
        car10.setManufactureYear(2008);
        car10.setMaintenanceCertificate(true);
        car10.setAvailability(true);    
        
    }
    
}
