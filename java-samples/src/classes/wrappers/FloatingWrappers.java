package classes.wrappers;

public class FloatingWrappers {

    public static void main(String[] args) {
        Float[] floats = {
                1.0F,
                1.1F,
                Float.valueOf("NaN"),
                Float.valueOf(1.2F),
                Float.valueOf("Infinity"),
                Float.valueOf("-Infinity"),
                Float.valueOf(0xfffffff6),
                Float.parseFloat(" 101     "),
                };
        for(float f : floats)
            System.out.println("Float: " + f + 
                               ", bit pattern: " + Float.floatToIntBits(f));   
        System.out.println();
        System.out.println();
        
        
        int[] floatBitsPatterns = {
                1,
                11,
                111,
                1011000111,
        };
        
        for(int floatBits : floatBitsPatterns)
            System.out.println("Float bits: " + floatBits + 
                               ", float from bits: " + Float.intBitsToFloat(floatBits));
        System.out.println();
        System.out.println(); 
    }
}
