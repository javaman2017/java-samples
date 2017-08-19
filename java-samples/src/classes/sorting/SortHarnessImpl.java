package classes.sorting;

public abstract class SortHarnessImpl<T extends Comparable<T>> implements SortHarness<T>{
    private T[] values;
    private final SortMetrics curMetrics = new SortMetrics();
    
    public final SortMetrics sort(T[] data){
        values = data;
        curMetrics.init();
        doSort();
        return getMetrics();
    }
    
    public final SortMetrics getMetrics(){
        return curMetrics.clone();
    }
    
    public final int getDataLength(){
        return values.length;
    }
    
    public final T probe(int i){
        curMetrics.probeCnt++;
        return values[i];
    }
    
    public final int compare(int i, int j){
        curMetrics.compareCnt++;
        T e1 = values[i];
        T e2 = values[j];
        if (e1.equals(e2))
            return 0;
        else 
            return (e1.compareTo(e2) < 0 ? -1 : 1);
    }
    
    public final void swap(int i, int j){
        curMetrics.swapCnt++;
        T tmp = values[i];
        values[i] = values[j];
        values[j] = tmp;
    }
}