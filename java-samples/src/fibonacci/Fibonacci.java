package fibonacci;

public class Fibonacci {
	static final int MAX_INDEX = 9;	// named constant

	/** 
	 * Calculate MAX_INDEX Fibonacci numbers,
	 * store them in an array and print them out 
	 * at the end
	 */
	public static void main(String[] args) {
		int[] fibonacciNumbers= new int[MAX_INDEX + 1];
		int lo = 1;
		int hi = 1;
		
		fibonacciNumbers[0] = lo;
		for(int i = 2; i <= MAX_INDEX; i++){
			fibonacciNumbers[i] = hi;
			hi = lo + hi;	// new hi
			lo = hi - lo; 	/* new lo is (sum - old lo)
							   that is, the old hi */
		}
		
		for(int i = 0; i < fibonacciNumbers.length; i++){
			System.out.println(fibonacciNumbers[i]);
		}

	}
}
