package operators;

public class BitwiseOperators {

    public static void main(String[] args) {
       int i1 = 0b1001110011;
       
       System.out.println("<< operator: ");
       System.out.println("Original        : "+ Integer.toString(i1,2));
       System.out.println("Left-shift by 1 : " + Integer.toString(i1 << 1,2));
       System.out.println("Left-shift by 2 : " + Integer.toString(i1 << 2,2));
       System.out.println();
       
       System.out.println(">> operator: ");
       System.out.println("Original        : "+ Integer.toString(i1,2));
       System.out.println("Right-shift by 1: " + Integer.toString(i1 >> 1,2));
       System.out.println("Right-shift by 2: " + Integer.toString(i1 >> 2,2));
       System.out.println("Right-shift by 3: " + Integer.toString(i1 >> 3,2));
       System.out.println("Right-shift by 4: " + Integer.toString(i1 >> 4,2));
       System.out.println("Right-shift by 5: " + Integer.toString(i1 >> 5,2));
       System.out.println();
       
       System.out.println(">>> operator: ");
       System.out.println("Original        : "+ Integer.toString(i1,2));
       System.out.println("Right-shift by 1: " + Integer.toString(i1 >>> 1,2));
       System.out.println("Right-shift by 2: " + Integer.toString(i1 >>> 2,2));
       System.out.println("Right-shift by 3: " + Integer.toString(i1 >>> 3,2));
       System.out.println("Right-shift by 4: " + Integer.toString(i1 >>> 4,2));
       System.out.println("Right-shift by 5: " + Integer.toString(i1 >>> 5,2));
       System.out.println();
       
       System.out.println("shift count 35 with <<: ");
       System.out.println("Original          : "+ Integer.toString(i1,2));
       System.out.println("Left-shift by 35  : " + Integer.toString(i1 << 35,2));
       System.out.println("Left-shift by 3   : " + Integer.toString(i1 << 3,2));
       System.out.println("Left-shift by -29 : " + Integer.toString(i1 << -29,2));
       System.out.println();


    }

}
