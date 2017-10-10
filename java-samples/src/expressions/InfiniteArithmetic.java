package expressions;

public class InfiniteArithmetic {

    public static void main(String[] args) {
        System.out.println("+, /, *, - with positive infinity");
        System.out.println(Float.POSITIVE_INFINITY + Float.POSITIVE_INFINITY);
        System.out.println(Float.POSITIVE_INFINITY / Float.POSITIVE_INFINITY);
        System.out.println(Float.POSITIVE_INFINITY * Float.POSITIVE_INFINITY);
        System.out.println(Float.POSITIVE_INFINITY - Float.POSITIVE_INFINITY);
        System.out.println();
        
        System.out.println("+, /, *, - with negative infinity");
        System.out.println(Float.NEGATIVE_INFINITY + Float.NEGATIVE_INFINITY);
        System.out.println(Float.NEGATIVE_INFINITY / Float.NEGATIVE_INFINITY);
        System.out.println(Float.NEGATIVE_INFINITY * Float.NEGATIVE_INFINITY);
        System.out.println(Float.NEGATIVE_INFINITY - Float.NEGATIVE_INFINITY);
        System.out.println();

        System.out.println("+, /, *, - with positive infinity mixed with negative infinity");
        System.out.println(Float.POSITIVE_INFINITY + Float.NEGATIVE_INFINITY);
        System.out.println(Float.POSITIVE_INFINITY / Float.NEGATIVE_INFINITY);
        System.out.println(Float.NEGATIVE_INFINITY / Float.POSITIVE_INFINITY);
        System.out.println(Float.POSITIVE_INFINITY * Float.NEGATIVE_INFINITY);
        System.out.println(Float.POSITIVE_INFINITY - Float.NEGATIVE_INFINITY);
        System.out.println(Float.NEGATIVE_INFINITY - Float.POSITIVE_INFINITY);
    }

}
