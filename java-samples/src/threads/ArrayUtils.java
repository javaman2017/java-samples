package threads;

import java.util.Arrays;

public class ArrayUtils {
    public static void abs(int[] values){
        synchronized (values){
            for(int i = 0; i < values.length; i++){
                if (values[i] < 0)
                    values[i] = -values[i];
            }
        }
    }

    public static void main(String[] args){
        int[] values = {-1, 1, 2, 3, 4, -5};
        System.out.println("Original values: " + Arrays.toString(values));
        abs(values);
        System.out.println("Abs values: " + Arrays.toString(values));

    }
}