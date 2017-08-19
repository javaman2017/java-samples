package classes.sorting;

interface SortHarness<T extends Comparable<T>> {
    /* Invoked to do the full sort */
    SortMetrics sort(T[] data);
    
    SortMetrics getMetrics();
    
    /** For extended classes to know the number of elements */
    int getDataLength();
    
    /** For extended classes to probe elements */
    T probe(int i);
    
    /** For extended classes to compare elements */
    int compare(int i, int j);
    
    /** For extended classes swap elements */
    void swap(int i, int j);
    
    /** Extended classes implement this -- used by sort */
    void doSort();
}