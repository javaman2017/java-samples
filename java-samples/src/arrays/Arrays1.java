package arrays;

public class Arrays1 {
	static double average(int[] values){
		if(values == null)
			throw new IllegalArgumentException();
		else
			if(values .length == 0)
				throw new IllegalArgumentException();
			else {
				double sum = 0.0;  // we must initalise local variables before use
				for (int i = 0; i < values.length; i++){
					sum += values[i];
				}
				return sum / values.length;
				
			}
		
	}

	public static void main(String[] args) {
		final int SIZE = 10;
		int[] values = new int[SIZE];
		for(int i = 0; i < values.length; i++){
			values[i] = i + 1;
		}
		
		System.out.println(Arrays1.average(values));
		
		
	}

}
