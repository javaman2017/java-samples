package classes.conversion;

import classes.vehicles.PassengerVehicle;
import classes.vehicles.Vehicle;

public class RefConversions {

    public static void main(String[] args) {
        PassengerVehicle passengerVehicle = new PassengerVehicle("Tom", 4);
        
        Vehicle vehicle;
        vehicle = passengerVehicle;
        
        Vehicle newVehicle = new Vehicle("Dick");
        
        PassengerVehicle newPassengerVehicle;
        try{
            newPassengerVehicle = (PassengerVehicle)newVehicle;
        } catch (ClassCastException cce){
            System.out.println(cce.getMessage());
        }
        
        newVehicle = new PassengerVehicle("Harry", 4);
        newPassengerVehicle = (PassengerVehicle) newVehicle;
    }
}
