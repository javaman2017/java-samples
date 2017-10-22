package classes.body;

public class ThreadSafeBody {
	private long idNum;
	private String name = "<unnamed>";
	private ThreadSafeBody orbits = null;
	private ThreadSafeBody[] orbiters = null;

	private static long nextID = 0;

	public ThreadSafeBody() {
		synchronized (ThreadSafeBody.class) {
			idNum = nextID++;
		}
    }

	public ThreadSafeBody(String bodyName){
        this(bodyName,null);
    }

	public ThreadSafeBody(String name, ThreadSafeBody orbitsAround){
		this.name = name;
		orbits = orbitsAround;
	}

	public ThreadSafeBody(ThreadSafeBody other){
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
	
	public boolean orbitsAround(ThreadSafeBody other){
		return (orbits == other);
	}
	
	public boolean orbitsAround(long id){
		return (orbits != null && orbits.idNum == id);
	}

	public void setOrbiters(ThreadSafeBody... orbiters){
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

	public ThreadSafeBody getOrbits() {
		return orbits;
	}

	public void setOrbits(ThreadSafeBody orbits) {
		this.orbits = orbits;
	}
	
	public void capture(ThreadSafeBody victim){
		victim.orbits = this;
	}

	public static void main(String[] args){
		ThreadSafeBody earth = new ThreadSafeBody("Earth");
		ThreadSafeBody satellite = new ThreadSafeBody("Satellite");
		System.out.println("Does satellite orbit around the earth?: " + satellite.orbitsAround(earth));
		earth.capture(satellite);
		System.out.println("Does satellite orbit around the earth?: " + satellite.orbitsAround(earth));
	}
}
