package classes.vehicles;

public class Vehicle {
	final public static byte TURN_LEFT = -45;
	final public static byte TURN_RIGHT = 45;
	private static long nextID = 0;
	
	public final static long currentHighestId(){
		return (nextID - 1);
	}
	
	final private long id;
	private double currentSpeed;
	private double currentDirection; // currentDirection is in degrees from north
	private String ownerName;
	private String[] driverNames = null;
	
	{
		id = nextID;
		nextID++;
	}
	
	public Vehicle(String ownerName){
		this.ownerName = ownerName;
	}
	
	@Override
	public String toString() {
		String desc = "Vehicle [id=" + id + ", currentSpeed=" + currentSpeed + ", currentDirection=" + currentDirection
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

	public static void main(String[] args){
		Vehicle vehicle1 = new Vehicle("Tom");
		vehicle1.currentSpeed = 10;
		vehicle1.currentDirection = 10;
		System.out.println("Current direction: " + vehicle1.getCurrentDirection());
		System.out.println("Turning 20 degrees");
		vehicle1.turn(20.0);
		System.out.println("Current direction: " + vehicle1.getCurrentDirection());
		System.out.println("Turning Left");
		vehicle1.turn(Vehicle.TURN_LEFT);
		System.out.println("Current direction: " + vehicle1.getCurrentDirection());
	}
}
