package classes.statistics;

public class ElementaryStatistics {
	public double arithmeticAverage;
	public double geometricAverages;
	public double maxValue;
	public double minValue;
	
	@Override
	public String toString() {
		return "[arithmeticAverage=" + arithmeticAverage + ", geometricAverages="
				+ geometricAverages + ", maxValue=" + maxValue + ", minValue=" + minValue + "]";
	}
}
