package classes.object;

public class TypeHashcode {

    public static void main(String[] args) {
        Property p1 = new Property(1);
        Property p2 = new Property(1);
        Property p3 = new Property(2);

        System.out.println("hp1 has overridden hashcode: " + p1.hashCode());
        System.out.println("hp2 has overridden hashcode: " + p2.hashCode());
        System.out.println("hp3 has overridden hashcode: " + p3.hashCode());
        
        String s1 = "abc";
        System.out.println("s1 hashcode: " + s1.hashCode());
        
        String s2 = new String("abc");
        System.out.println("s2 hashcode: " + s2.hashCode());
        
        String s3 = "ABC";
        System.out.println("s3 hashcode: " + s3.hashCode());
        System.out.println("IndentityHashcode for s3:" + System.identityHashCode(s3));
    }
}