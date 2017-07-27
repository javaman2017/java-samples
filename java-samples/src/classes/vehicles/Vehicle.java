package classes.vehicles;

public class Vehicle {
	private static long nextID = 0;
	
	public static long currentHighestId(){
		return (nextID - 1);
	}
	
	private long   id;
	public double currentSpeed;
	public double currentDirection; // currentDirection is in degrees from north
	private String ownerName;
	private String[] driverNames = null;
	
	{
		id = nextID;
		nextID++;
	}
	
	public Vehicle(String ownerName){
		this.ownerName = ownerName;
	}
	
	public void setDriverNames(String... driverNames){
		this.driverNames = driverNames;
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

	public static void main(String[] args){
		Vehicle vehicle1 = new Vehicle("Tom");
		vehicle1.currentSpeed = 10;
		vehicle1.currentDirection = 1;
		vehicle1.setDriverNames("Dick","Harry");
		System.out.println(vehicle1);
	}
}
