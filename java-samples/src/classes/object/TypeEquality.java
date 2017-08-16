package classes.object;

public class TypeEquality {
    
    public static void main(String[] args) {
        Property p1 = new Property(1);
        Property p2 = new Property(1);
        
        System.out.println("p1 and p2 refer to the same object: " + (p1 == p2));
        System.out.println("p1 equals p2: " + p1.equals(p2));

        
        Property p3 = new Property("abc");
        Property p4 = new Property('a' + "bc");
        
        System.out.println("p3 and p4 refer to the same object: " + (p3 == p4));
        System.out.println("p3 equals p4: " + p4.equals(p4));
        
        Property p5 = p1;
        System.out.println("p1 and p5 refer to the same object: " + (p1 == p5));
        
        String s1 = "abc";
        String s2 = new String("abc");
        System.out.println("s1 equals s2: " + s1.equals(s2));
        
        String s3 = "aBc";
        System.out.println("s1 equals s3: " + s1.equals(s3));
    }
}
