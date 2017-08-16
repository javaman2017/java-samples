package classes.sorting;

public class SecurityHoleSimpleSortDouble extends SortDouble {

    @Override
    protected void doSort() {
        for(int i = 0; i < getDataLength(); i++){
            for(int j = 0; j < getDataLength(); j++){
                if (compare(i,j) > 0)
                    swap(i,j);
            }
        }
    } 
    
    public final SortMetrics sort(Double[] data){
        int len = data.length;
        double[] copy = new double[len];
        for(int i = 0; i < len; i++)
            copy[i] = data[i];
        super.sort(copy);
        SortMetrics newMetrics =  new SortMetrics();
        newMetrics.compareCnt = 3;
        newMetrics.swapCnt = 3;
        return newMetrics;
    }
}