package classes.vehicles;

public class PassengerVehicle extends Vehicle {
	private final int numberOfSeats;
	private int occupiedNumberOfSeats;

	public PassengerVehicle(String ownerName, int numberOfSeats) {
		super(ownerName);
		this.numberOfSeats = numberOfSeats;
	}
	
	public int getOccupiedNumberOfSeats() {
		return occupiedNumberOfSeats;
	}

	public void setOccupiedNumberOfSeats(int occupiedNumberOfSeats) {
		this.occupiedNumberOfSeats = occupiedNumberOfSeats;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	@Override
	public String toString() {
		return "PassengerVehicle [numberOfSeats=" + numberOfSeats + ", occupiedNumberOfSeats=" + occupiedNumberOfSeats
				+ "]";
	}

	public static void main(String[] args) {
		PassengerVehicle car = new PassengerVehicle("Tom",4);
		car.setOccupiedNumberOfSeats(1);
		System.out.println(car);
		
		PassengerVehicle van = new PassengerVehicle("Dick",2);
		car.setOccupiedNumberOfSeats(2);
		System.out.println(van);
	}
}
