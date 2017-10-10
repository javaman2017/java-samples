package expressions;

public class ExplicitConversions {
    
    public static void main(String[] args) {
        double d1 = 1.123456789123456789123456789123456789123456789;
        System.out.println("d1: " + d1);
        float f1 = (float)d1;
        System.out.println("f1: " + f1);

        double d3 = 1E99;
        System.out.println("d3: " + d3);
        float f3 = (float)d3;
        System.out.println("f3: " + f3);
        
        
        long l = 111111111L;
        System.out.println("l in binary: " + Long.toString(l, 2));
        int i = (int)l;
        System.out.println("i in binary: " + Integer.toString(i,2));
        
        char c = 'a';
        int ic = c;
        System.out.println("ic in binary: " + Integer.toString(ic, 2));
        
    }
}
