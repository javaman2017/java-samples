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
                    ", numberOfTrailingZeros: " + Integer.numberOfTrailingZeros(i) + 
                    ", reverse: " + Integer.reverse(i) +
                    ", rotateLeft: " + Integer.rotateLeft(i,1) + 
                    ", rotateRight: " + Integer.rotateRight(i, 1) + 
                    ", signum: " + Integer.signum(i)
                    );
        System.out.println();
        System.out.println();
        
        Integer i = 3;
        System.out.println("i as int: " + i);
        System.out.println("i as short: " + i.shortValue());
        System.out.println("i as long:  " + i.longValue());
        System.out.println("i as float: " + i.floatValue());
        System.out.println("i as double: " + i.doubleValue());   
        
        
        i = null;
        System.out.println(i + 1);
    }
}
