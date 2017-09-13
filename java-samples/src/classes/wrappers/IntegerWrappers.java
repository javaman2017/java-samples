package classes.wrappers;

public class IntegerWrappers {

    public static void main(String[] args) {
        
        //toString(val,radix)
        for(int i = 2; i <= 36; i++)
            System.out.println("Radix: " + i + ", value: " + Integer.valueOf("100", i));
        System.out.println();
        System.out.println();
        
        //toBinaryString
        for(int i = -10; i < 10; i++)
            System.out.println(Integer.toBinaryString(i));
        System.out.println();
        System.out.println();

        //toOctalString
        for(int i = -10; i < 10; i++)
            System.out.println("0" + Integer.toOctalString(i));
        System.out.println();
        System.out.println();
        
        //toHexString
        for(int i = -10; i < 10; i++)
            System.out.println("Ox" + Integer.toHexString(i));
        System.out.println();
        System.out.println();
        
        for(int i = -10; i < 10; i++)
            System.out.println("i: " + i + 
                    ", binary rep: " + Integer.toBinaryString(i) + ", bit count: " + Integer.bitCount(i) +
                    ", HighestOneBit: " + Integer.highestOneBit(i) + 
                    ", LowestOneBit: " + Integer.lowestOneBit(i) + 
                    ", numberOfLeadingZeros: " + Integer.numberOfLeadingZeros(i) + 
                    ", numberOfTrailingZeros: " + Integer.numberOfTrailingZeros(i)
                    );
        System.out.println();
        System.out.println();
        
       
        
    }
        
        
       
                

    

}
