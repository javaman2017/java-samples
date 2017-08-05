package classes.construction;

public class X {
	protected int xMask = 0x00ff;
	protected int fullMask;

	public X() {
		System.out.println("xMask\tyMask\tfullMask");
		System.out.printf("%#x\t%x\t%x\n",xMask,0,fullMask);
		fullMask = xMask;
		System.out.printf("%#x\t%x\t%#x\n",xMask,0,fullMask);
	}
	
	public int mask(int orig){
		return (orig & fullMask);
	}
}