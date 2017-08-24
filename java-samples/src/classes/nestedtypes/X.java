package classes.nestedtypes;

public class X {
    String name = "X";
    public class Y {
       String name = "Y";
       public class Z {
           String name = "Z";
           public void displayXName(){
               System.out.println(X.this.name);
           }
           
       }
       
       public Z getZ(){
           return new Z();
       }
    }
    
    public Y getY(){
       return new Y();
    }

    public static void main(String[] args) {
        X x = new X();
        x.getY().getZ().displayXName();
    }

}
