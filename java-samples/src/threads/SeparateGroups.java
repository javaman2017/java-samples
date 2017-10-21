package threads;

public class SeparateGroups {
	private double aVal = 0.0;
	private double bVal = 1.1;
	protected final Object lockA = new Object();
	protected final Object lockB = new Object();
	
	public double getA() {
		synchronized (lockA) {
			return aVal;
		}
	}
	
	public void setA(double val) {
		synchronized (lockA) {
			aVal = val;
		}
	}
	
	public double getB() {
		synchronized (lockB) {
			return bVal;
		}
	}
	
	public void setB(double val) {
		synchronized (lockB) {
			bVal = val;
		}
	}
	
	public void reset() {
		synchronized (lockA) {
			synchronized (lockB) {
				aVal = bVal = 0.0;
			}
		}
	}	
}
