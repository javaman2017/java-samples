package classes.body;

import java.util.Arrays;

public class Body {
	public long idNum;
	public String name = "<unnamed>";
	public Body orbits = null;
	private Body[] orbiters = null;
	
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
	
	@Override
	public String toString() {
		String desc =  "Body [idNum=" + idNum + ", name=" + name ; 
		if (orbits != null)
			desc += ", orbits=[" + orbits.name + "]";
		if (orbiters != null){
			desc += ", orbiters=[";
			int count = orbiters.length;
			for (int i = 0; i < count; i++){
				desc += orbiters[i].name;
				if (i < count - 1)
					desc += ", ";
			}
		}
		
		desc += "]";
	    return desc;
	}

	public void setOrbiters(Body... orbiters){
		this.orbiters = orbiters;
	}
	
	public static void main(String[] args){
		Body sun = new Body("Sun");
		
		Body earth = new Body("Earth",sun); 
		Body moon = new Body("Moon",earth);
		earth.setOrbiters(moon);
		
		System.out.println(earth);
			
		Body mars = new Body("Mars",sun);
		Body phobos = new Body("Phobos",mars);
		Body deimos = new Body("Deimos",mars);
		mars.setOrbiters(phobos,deimos);
		

		System.out.println(mars);		
	}
}
