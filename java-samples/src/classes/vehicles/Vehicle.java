package classes.vehicles;

public class Vehicle {
	public static long nextID = 0;
	public long   id;
	public double currentSpeed;
	public double currentDirection; // currentDirection is in degrees from north
	public String ownerName;
	
	Vehicle(){		
	}
	
	public Vehicle(String ownerName){
		this.ownerName = ownerName;
	}
	
	public static void main(String[] args){
		Vehicle vehicle1 = new Vehicle("Tom");
		vehicle1.id = Vehicle.nextID;
		vehicle1.currentSpeed = 10;
		vehicle1.currentDirection = 1;
		Vehicle.nextID++;
		
		Vehicle vehicle2 = new Vehicle("Dick");
		vehicle2.id = Vehicle.nextID;
		vehicle2.currentSpeed = 20;
		vehicle2.currentDirection = -1;
		Vehicle.nextID++;
		
		Vehicle vehicle3 = new Vehicle("Harry");
		vehicle3.id = Vehicle.nextID;
		vehicle3.currentSpeed = 30;
		vehicle3.currentDirection = 0;
		Vehicle.nextID++;
		
		Vehicle[] vehicles = new Vehicle[] {vehicle1, vehicle2, vehicle3};
		
		for(int i = 0; i < vehicles.length; i++){
			System.out.println("id=" + vehicles[i].id + ": " + "currentSpeed=" + vehicles[i].currentSpeed
					+ ", currentDirection=" + vehicles[i].currentDirection + ", ownerName="
					+ vehicles[i].ownerName);					
		}
	}
}
