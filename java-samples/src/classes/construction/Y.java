package classes.construction;

public class Y extends X {
	protected int yMask = 0xff00;

	public Y() {
		fullMask |= yMask;
	}
	
	public static void main(String[] args){
		Y y = new Y();
	}
}
