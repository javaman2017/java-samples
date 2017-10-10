package classes.vehicles;

import classes.energysources.EnergySource;

public class PassengerVehicle extends Vehicle {
	private final int numberOfSeats;
	private int occupiedNumberOfSeats;

	public PassengerVehicle(EnergySource energySource,String ownerName, int numberOfSeats) {
		super(energySource,ownerName);
		this.numberOfSeats = numberOfSeats;
	}
	
	public final int getOccupiedNumberOfSeats() {
		return occupiedNumberOfSeats;
	}

	public void setOccupiedNumberOfSeats(int occupiedNumberOfSeats) {
		this.occupiedNumberOfSeats = occupiedNumberOfSeats;
	}

	public final int getNumberOfSeats() {
		return numberOfSeats;
	}

	@Override
	public String toString() {
		return "PassengerVehicle [numberOfSeats=" + numberOfSeats + ", occupiedNumberOfSeats=" + occupiedNumberOfSeats
				+ "]";
	}

	public static void main(String[] args) {
		PassengerVehicle car = new PassengerVehicle(null, "Tom",4);
		car.setOccupiedNumberOfSeats(1);
		System.out.println(car);
		
		PassengerVehicle van = new PassengerVehicle(null, "Dick",2);
		car.setOccupiedNumberOfSeats(2);
		System.out.println(van);
	}
}
