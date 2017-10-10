package exceptions;

public class Assertion {
    
    public static int f(){
       
            throw new AssertionError("1 != 1 is false");
        
    }

    public static void main(String[] args) {
        int i1 = 1;
        int i2 = 2;
        
        assert i1 == i2 : "i1 does not equal i2";
        
        Assertion.f();

    }

}
