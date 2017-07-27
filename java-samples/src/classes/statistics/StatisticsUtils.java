package classes.statistics;

import java.util.Arrays;

public class StatisticsUtils {
	public static ElementaryStatistics generateElementaryStatistics(double[] data){
		ElementaryStatistics elementaryStatistics = new ElementaryStatistics();
		
		//Calculate arithmeticAverage
		int count = data.length;
		double sum = 0.0;
		for(int i = 0; i < count; i++)
			sum += data[i];
	    elementaryStatistics.arithmeticAverage = (sum / count);
	    
	    //Calculate geometricAverage
	    double product = 1.0;
	    for(int i = 0; i < count; i++)
	    	product *= data[i];
	    elementaryStatistics.geometricAverages = Math.pow(product,1/((double)count));
	    
	    //Find max/min values
	    double max = Double.MIN_VALUE;
	    double min = Double.MAX_VALUE;
	    for(int i = 0; i < count; i++){
	    	if (data[i] > max)
	    		max = data[i];
	    	if (data[i] < min)
	    		min = data[i];
	    }
	    elementaryStatistics.maxValue = max;
	    elementaryStatistics.minValue = min;
	    
	    return elementaryStatistics;
	}
	
	public static void main(String[] args){
		double[] data = {1.3, 3.2, 3.5, 9.0, 4.2};
		ElementaryStatistics elementaryStatistics = StatisticsUtils.generateElementaryStatistics(data);
		System.out.println("Elementary statistics for data set: " + Arrays.toString(data) + " are: ");
		System.out.println(elementaryStatistics);
	}

}
