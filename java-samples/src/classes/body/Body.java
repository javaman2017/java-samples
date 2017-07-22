package classes.body;

public class Body {
	public long idNum;
	public String name = "<unnamed>";
	public Body orbits = null;
	
	private static long nextID = 0;
	
	Body(){
		idNum = nextID++;
	}
}
