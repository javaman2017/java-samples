package expressions;

public class FloatingPointArithmetic {

    public static void main(String[] args) {        
        
        float posZero = +0.0f;
        float negZero = -0.0f;
        
        if(posZero == negZero)
            System.out.println("PosZero and NegZero are equal");
        
        System.out.println(1f/0.0f);
        System.out.println(1f/-0.0f);

    }

}
