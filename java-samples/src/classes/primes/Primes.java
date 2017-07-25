package classes.primes;

public class Primes {
	static int[] knownPrimes = new int[4];
	
	static {
		knownPrimes[0] = 2;
		for(int i = 0; i < knownPrimes.length; i++)
			knownPrimes[i] = nextPrime();
	}
	private static int nextPrime(){
		return 0; // return dummy value
	}
}
