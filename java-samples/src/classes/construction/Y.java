package classes.construction;

public class Y extends X {
	protected int yMask = 0xff00;

	public Y() {
		System.out.printf("%#x\t%#x\t%#x\n",xMask,yMask,fullMask);
		fullMask |= yMask;
		System.out.printf("%#x\t%#x\t%#x\n",xMask,yMask,fullMask);
	}
	
	public static void main(String[] args){
		Y y = new Y();
	}
}
