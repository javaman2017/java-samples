package fibonacci;

public class Fibonacci {
	static final int MAX_INDEX = 9;	// named constant

	/** Print out the first few Fibonacci numbers,
	 *  marking evens with a '*'  
	 */
	public static void main(String[] args) {
		int lo = 1;
		int hi = 1;
		
		String mark;	//local variable mark
		
		System.out.println("1: " + lo);
		for(int i = 2; i <= MAX_INDEX; i++){
			if(hi % 2 == 0)
				mark = " *";
			else
				mark = "";
			System.out.println(i + ": " + hi + mark);
			hi = lo + hi;	// new hi
			lo = hi - lo; 	/* new lo is (sum - old lo)
							   that is, the old hi */
		}

	}
}
