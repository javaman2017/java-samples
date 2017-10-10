package classes.literals;

public class ClassLiterals {
    static short s;
    static int i;
    static long l;
    static float f;
    static double d;

    public static void main(String[] args) {
        //Shorts
        short S = 1;
        s = S;           //can assign shorts to shorts
        s = 1;           //can assign ints to shorts that are in range
        //s = 100000;    //can't assign ints to shorts that are out of range
        //s = 1L;        //can't convert a long to a short
        //s = 2.1f;      //can't convert a float to a short
        //s = 2.1d;      //can't convert a double to a short
        
        //ints
        int I = 1;
        i = I;             //can assign ints to ints
        //i = 1L;          //can't assign longs to ints
        //i = 1.1f;        //can't assign a float to an int
        //i = 1.1d;        //can't assign a double to an int
        
        //Float
        float F = 1.1f;
        f = F;             //can assign floats to floats
        f = 1000000;       //can assign ints to floats
        f = 1000000L;      //can assign longs to floats
        //f = 1.0d; 
    }

}
