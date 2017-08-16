package classes.object;

public class ObjectEquality {

    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        System.out.println("o1 equals o1: " + o1.equals(o1));
        System.out.println("o1 equals o2: " + o1.equals(o2));
        System.out.println("o1 and o2 refer to the same object: " + (o1 == o2));
    }
}