package classes.construction;

public class X {
	protected int xMask = 0x00ff;
	protected int fullMask;

	public X() {
		super();
		fullMask = xMask;
	}
	
	public int mask(int orig){
		return (orig & fullMask);
	}
}