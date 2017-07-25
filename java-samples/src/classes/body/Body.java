package classes.body;

public class Body {
	public long idNum;
	public String name = "<unnamed>";
	public Body orbits = null;
	
	private static long nextID = 0;
	
	{
		idNum = nextID++;
	}
	
	Body(String bodyName, Body orbitsAround){
		name = bodyName;
		orbits = orbitsAround;
	}
	
	Body(String bodyName){
		this(bodyName,null);
	}
	
	Body(Body other){
		idNum = other.idNum;
		name = other.name;
		orbits = other.orbits;
	}
	
	public static void main(String[] args){
		Body sun = new Body("Sun");
		Body earth = new Body("Earth",sun); 
		Body earth2 = new Body(earth);
	
		System.out.println("The " + earth.name + " orbits the " + sun.name);
		System.out.println("Earth2 orbits " + earth2.orbits.name);
		
	}
}
