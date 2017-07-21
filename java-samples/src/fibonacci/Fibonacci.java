package fibonacci;

public class Fibonacci {
	static final int MAX_INDEX = 9;	// named constant

	/** 
	 * Calculate MAX_INDEX Fibonacci numbers,
	 * store them in an array and print them out 
	 * at the end marking even numbers with a * 
	 */
	public static void main(String[] args) {
		FibonacciNumber[] fibonacciNumbers= new FibonacciNumber[MAX_INDEX + 1];
		int lo = 1;
		int hi = 1;
		
		FibonacciNumber fibonacciNumber = new FibonacciNumber();
		fibonacciNumber.value = lo;
		fibonacciNumber.isEven = (lo % 2 == 0);
		
		fibonacciNumbers[0] = fibonacciNumber;
		for(int i = 1; i <= MAX_INDEX; i++){
			fibonacciNumber = new FibonacciNumber();
			fibonacciNumber.value = hi;
			fibonacciNumber.isEven = (hi % 2 == 0);
			fibonacciNumbers[i] = fibonacciNumber;
			
			hi = lo + hi;	// new hi
			lo = hi - lo; 	/* new lo is (sum - old lo)
							   that is, the old hi */
		}
		
		for(int i = 0; i < fibonacciNumbers.length; i++){
			String mark;
			if(fibonacciNumbers[i].isEven)
				mark = " *";
			else
				mark = "";
			System.out.println(i + ": " + fibonacciNumbers[i].value + mark);
		}

	}
}
