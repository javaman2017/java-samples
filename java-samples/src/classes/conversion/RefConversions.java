package classes.conversion;

import classes.energysources.GasTank;
import classes.vehicles.PassengerVehicle;
import classes.vehicles.Vehicle;

public class RefConversions {

    public static void main(String[] args) {        
        Vehicle vehicle1 = new PassengerVehicle(new GasTank(),"Tom", 4);
        
        Vehicle vehicle2 = new PassengerVehicle(new GasTank(),"Harry", 4);
        PassengerVehicle passengerVehicle2 = (PassengerVehicle) vehicle2;
    }
}
