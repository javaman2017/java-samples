package classes.strings;

public class RegionMatches {

    public static void main(String[] args) {
        String str = "Look, look!";
        boolean b1, b2, b3;
        
        b1 = str.regionMatches(6,"Look",0,4);
        b2 = str.regionMatches(true, 6, "Look", 0,4);
        b3 = str.regionMatches(true, 6, "Look", 0, 5);
        
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);
    }

}
