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
}