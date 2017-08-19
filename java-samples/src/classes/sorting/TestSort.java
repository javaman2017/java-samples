package classes.sorting;

public class TestSort {
    
    static Double[] testData = {
            0.3, 1.3e-2, 7.9, 3.17
    };
    
    static Integer[] intTestData = {
            2,1,15,3,5,8,7
    };

    public static void main(String[] args) {
        SortHarnessImpl<Double> bsort = new DoubleSortHarness();
        SortMetrics metrics = bsort.sort(testData);
        System.out.println("Metrics: " + metrics);
        for(int i = 0; i < testData.length; i++)
            System.out.println("\t" + testData[i]);
        
        SortHarnessImpl<Integer> isort = new IntegerSortHarness();
        SortMetrics intmetrics = isort.sort(intTestData);
        System.out.println("Intmetrics: " + intmetrics);
        for(int i = 0; i < intTestData.length; i++)
            System.out.println("\t" + intTestData[i]);
        
    }
}
