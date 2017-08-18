package interfaces;

public class InterfaceFieldHiding implements Y {

    public static void main(String[] args) {
        Y y = new InterfaceFieldHiding();
        System.out.println("val in interface y: "+ y.val);
        System.out.println("val in interface x: "+ ((X)y).val);


    }

}
