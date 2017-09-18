package operators;

public class BCD {
    
    static int getBCDLowDigit(byte val){
        return (val & 0x0f);
    }
    
    static int getBCDHighDigit(byte val){
        return val >>> 4;
    }

    public static void main(String[] args) {
       byte i1 = 0x19;
       System.out.println(BCD.getBCDHighDigit(i1));
       System.out.println(BCD.getBCDLowDigit(i1));


    }

}
