package classes.body;

public class Body {
	private long idNum;
	private String name = "<unnamed>";
	private Body orbits = null;
	private Body[] orbiters = null;
	
	private static long nextID = 0;
	
	{
		idNum = nextID++;
	}
	
	public Body() {
    }
	
	public Body(String bodyName){
        this(bodyName,null);
    }
	
	public Body(String name, Body orbitsAround){
		this.name = name;
		orbits = orbitsAround;
	}
	
	public Body(Body other){
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
	
	public boolean orbitsAround(Body other){
		return (orbits == other);
	}
	
	public boolean orbitsAround(long id){
		return (orbits != null && orbits.idNum == id);
	}

	public void setOrbiters(Body... orbiters){
		System.out.println("Orbiters length: " + orbiters.length);
		this.orbiters = orbiters;
	}
	
	private long getIdNum() {
		return idNum;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Body getOrbits() {
		return orbits;
	}

	public void setOrbits(Body orbits) {
		this.orbits = orbits;
	}
	
	public void capture(Body victim){
		victim.orbits = this;
	}

	public static void main(String[] args){
		Body earth = new Body("Earth");
		Body satellite = new Body("Satellite");
		System.out.println("Does satellite orbit around the earth?: " + satellite.orbitsAround(earth));
		earth.capture(satellite);
		System.out.println("Does satellite orbit around the earth?: " + satellite.orbitsAround(earth));
	}
}
