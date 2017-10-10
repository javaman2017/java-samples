package arrays;

public class Arrays2 {
	static double average(int[] values){
		// conditional OR || evaluates second argument only if first is false
		if(values == null || values.length == 0)
			throw new IllegalArgumentException();
		else {
			double sum = 0.0;  // we must initalise local variables before use
			for(int i : values)
			    sum += i;
			return sum / values.length;
			
		}
		
	}

	public static void main(String[] args) {
		int[] values = {1, 2, 3, 4, 5};		
		System.out.println(Arrays2.average(values));
	}

}
