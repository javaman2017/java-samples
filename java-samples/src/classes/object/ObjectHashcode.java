package classes.object;

public class ObjectHashcode {

    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = new Object();
        
        System.out.println("o1 has hashcode: " + o1.hashCode());
        System.out.println("o2 has hashcode: " + o2.hashCode());
        System.out.println("o3 has hashcode: " + o3.hashCode());
    }
}
