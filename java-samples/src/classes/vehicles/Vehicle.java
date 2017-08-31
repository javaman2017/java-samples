package classes.vehicles;

import classes.energysources.Battery;
import classes.energysources.EnergySource;
import classes.energysources.GasTank;

public class Vehicle {
	public enum Turn { LEFT, RIGHT };
	private static long nextID = 0;
	
	public final static long currentHighestId(){
		return (nextID - 1);
	}
	
	final private long id;
	final private EnergySource energySource;
	private double currentSpeed;
	private double currentDirection; // currentDirection is in degrees from north
	private String ownerName;
	private String[] driverNames = null;
	
    {
		id = nextID;
		nextID++;
	}
	
	public Vehicle(EnergySource energySource, String ownerName){
	    this.energySource = energySource;
		this.ownerName = ownerName;
	}
	
	public void changeSpeed(double newSpeed){
		this.currentSpeed = newSpeed;
	}
	
	public final void stop(){
		this.currentSpeed = 0.0;
	}
	
	public void turn(double degrees){
		currentDirection += degrees;
		currentDirection %= 360;
	}
	
	public void turn(byte direction){
		currentDirection += direction;
	}
	
	public final double getCurrentSpeed() {
		return currentSpeed;
	}
	
	public void setCurrentSpeed(double currentSpeed) {
		this.currentSpeed = currentSpeed;
	}

	public final double getCurrentDirection() {
		return currentDirection;
	}

	public void setCurrentDirection(double currentDirection) {
		this.currentDirection = currentDirection;
	}

	public final String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public final long getId() {
		return id;
	}

	public final String[] getDriverNames() {
		return driverNames;
	}
	
	public void setDriverNames(String... driverNames){
		this.driverNames = driverNames;
	}
	
    public final EnergySource getEnergySource() {
        return energySource;
    }
    
    public final void start(){
        if(energySource.empty())
            throw new RuntimeException("EnerySource is empty cannot start vehicle");
            
    }
    
    @Override
    public String toString() {
        String desc = "Vehicle [id=" + id + ", currentSpeed=" + currentSpeed +
                      ", currentDirection=" + currentDirection
                + ", ownerName=" + ownerName;
        if (driverNames != null){
            desc += ", drivers=[";
            desc += ownerName + ", ";
            int count = driverNames.length;
            for(int i = 0; i < count; i++){
                desc += driverNames[i];
                if (i < count - 1)
                    desc += ", ";
            }
        }
        desc += "]";
        return desc;
    }

	public static void main(String[] args){
		Vehicle car = new Vehicle(new GasTank(),"Tom");
		car.start();
		Vehicle electricCar = new Vehicle(new Battery(),"Dick");
		electricCar.start();
	}
}
