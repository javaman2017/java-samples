package point;

public class Point implements Comparable<Point> {
	public static final Point ORIGIN = new Point();
	private double x, y;
	
	public double distance(Point that){
		double xdiff = x - that.x;
		double ydiff = y - that.y;
		return Math.sqrt(xdiff * xdiff + ydiff * ydiff);
	}
	
	public Point(){
	}
	
	public Point(double x, double y) {
        super();
        this.x = x;
        this.y = y;
    }

    public void move(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public void move(Point that){
		this.x = that.x;
		this.y = that.y;
	}
	
	// Called automatically if the instance is passed to println
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	

    @Override
    public int compareTo(Point p) {
        double pDist = p.distance(ORIGIN);
        double dist = this.distance(ORIGIN);
        if(dist > pDist)
            return 1;
        else if (dist == pDist)
            return 0;
        else 
            return -1;
    }
	
	public static void main(String[] args) {
	    Point p1 = new Point(1,1);
	    Point p2 = new Point();
	    
	    int comparison = p2.compareTo(p1);
	    
	    if(comparison == 1){
	        System.out.println("p2 is farther than p1 from the origin");
	    } else if(comparison == 0){
	        System.out.println("p2 and p1 are equal distance from the origin");
	    } else {
            System.out.println("p1 is farther than p2 from the origin");
	    }		
	}
}