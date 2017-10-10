package expressions;

public class ImplictConversions {

    public static void main(String[] args) {
        long orig = 123456789123456789L;
        float f = orig;
        long l = (long)f;
        
        System.out.println("orig: " + orig);
        System.out.println("f:    " + f);
        System.out.println("l:    " + l);
    }

}
