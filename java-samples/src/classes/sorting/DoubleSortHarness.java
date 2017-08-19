package classes.sorting;

public class DoubleSortHarness extends SortHarnessImpl<Double> {

    @Override
    public void doSort() {
        for(int i = 0; i < getDataLength(); i++){
            for(int j = 0; j < getDataLength(); j++){
                if (compare(i,j) > 0)
                    swap(i,j);
            }
        }
    }
}
