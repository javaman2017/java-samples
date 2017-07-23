package classes.body;

public class Body {
	public long idNum;
	public String name = "<unnamed>";
	public Body orbits = null;
	
	private static long nextID = 0;
	
	Body(){
		idNum = nextID++;
	}
	
	Body(String bodyName, Body orbitsAround){
		this(); 
		name = bodyName;
		orbits = orbitsAround;
	}
	
	Body(String bodyName){
		this(bodyName,null);
	}
	
	public static void main(String[] args){
		Body sun = new Body("Sun");
		Body earth = new Body("Earth",sun); 
	
		System.out.println("The " + earth.name + " orbits the " + sun.name);
		
	}
}
