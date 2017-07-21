package point;

public class Point {
	public static Point origin = new Point();
	public double x, y;
	
	public double distance(Point that){
		double xdiff = x - that.x;
		double ydiff = y - that.y;
		return Math.sqrt(xdiff * xdiff + ydiff * ydiff);
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
	
	public static void main(String[] args) {
		Point lowerLeft = Point.origin;
		Point upperRight = new Point();
		Point middlePoint = new Point();
		
		upperRight.x = 1280.0;
		upperRight.y = 1024.0;
		
		middlePoint.x = 640.0;
		middlePoint.y = 512.0;
		
		System.out.println(upperRight);
		System.out.println(middlePoint);
		
		System.out.println("Distance between " + upperRight + " and " + middlePoint + " equals " + 
		upperRight.distance(middlePoint));
		
		System.out.println("Moving point " + lowerLeft + " to coordinates (1.0, 1.0)");
		lowerLeft.move(1.0,1.0);
		System.out.println(lowerLeft);
		
		System.out.println("Moving lowerLeft now to upperRight point");
		lowerLeft.move(upperRight);
		System.out.println(lowerLeft);
		
	}
}