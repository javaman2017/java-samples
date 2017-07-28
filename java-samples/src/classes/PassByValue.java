package classes;

public class PassByValue {

	public static void main(String[] args) {
		double one = 1.0;
		
		System.out.println("before one: one = " + one);
		halveIt(one);
		System.out.println("after one: one = " + one);
	}
	
	public static void halveIt(double arg){
		arg /= 2.0; //divde by two
		System.out.println("halved: arg = " + arg);
	}

}
