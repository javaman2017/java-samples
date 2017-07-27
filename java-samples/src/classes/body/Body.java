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
	
	public String toString(){
		String desc = idNum + " (" + name + ")";
		if(orbits != null)
			desc += " orbits " + orbits.toString();
		return desc;
	}
	
	public static void main(String[] args){
		Body sun = new Body("Sun");
		Body earth = new Body("Earth",sun); 
		System.out.println(sun);
		System.out.println(earth);
		
	}
}
