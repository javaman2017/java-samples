package classes.vehicles;

public class Vehicle {
	private static long nextID = 0;
	
	public static long currentHighestId(){
		return (nextID - 1);
	}
	
	final private long   id;
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
	
	public void stop(){
		this.currentSpeed = 0.0;
	}

	public double getCurrentSpeed() {
		return currentSpeed;
	}
	
	public void setCurrentSpeed(double currentSpeed) {
		this.currentSpeed = currentSpeed;
	}

	public double getCurrentDirection() {
		return currentDirection;
	}

	public void setCurrentDirection(double currentDirection) {
		this.currentDirection = currentDirection;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public long getId() {
		return id;
	}

	public String[] getDriverNames() {
		return driverNames;
	}
	
	public void setDriverNames(String... driverNames){
		this.driverNames = driverNames;
	}

	public static void main(String[] args){
		Vehicle vehicle1 = new Vehicle("Tom");
		vehicle1.currentSpeed = 10;
		vehicle1.currentDirection = 1;
		vehicle1.setDriverNames("Dick","Harry");
		System.out.println(vehicle1);
	}
}
