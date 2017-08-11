package classes.conversion;

public class WrapperConversions {
    
    public static void main(String[] args){
        int i1 = 1;
        Integer integer1 = i1;
        
        Integer integer2 = Integer.valueOf(100);
        int i2 = integer2;
        
        boolean b = true;
        Boolean bool = b;
        
        long l = 10L;
        Long longInt = l;
        
        System.out.println("Primitive integers:");
        
        int[] ia = {1,2,4,3,4,5};
        
        for(int i : ia)
            System.out.println("i=" + i);
        
        
        System.out.println("Wrapped integers:");
        
        Integer[] integerArray = {1, 2, 3, 4, 5};
        for(Integer integer : integerArray)
            System.out.println("integer=" + integer);
        
        for(Integer integer : integerArray)
            System.out.println("Type of integer=" + integer.getClass().getSimpleName());
        
        Object o = 1 + 2 * 3;
        System.out.println("o=" + o);
        
    }

}
