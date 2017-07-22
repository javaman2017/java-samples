package classes.body;

public class Body {
	public long idNum;
	public String name = "<unnamed>";
	public Body orbits = null;
	
	private static long nextID = 0;
	
	Body(){
		idNum = nextID++;
	}
	
	public static void main(String[] args){
		Body sun = new Body();  //idNum is 0
		sun.name = "Sun";
		
		Body earth = new Body(); //idNum is 1
		earth.name = "Earth";
		earth.orbits = sun;
		
		System.out.println("The " + earth.name + " orbits the " + sun.name);
		
	}
}
