package operators;

public class BitCount {
    
    static int getBitLowDigit(int val){
        return (val & 1);
    }
    
    static int bitCount(int val){
        int result = 0;
        int temp = val;
        while(temp > 0){
            int lowBit = BitCount.getBitLowDigit(temp);
            if(lowBit == 1){
                result++;
            }
            
            //cut off the lowest order digit so while can terminate
            temp >>= 1; 
        }
        return result;
    }

    public static void main(String[] args) {
        int i1 = 0b100101011111001;
        System.out.println(BitCount.bitCount(i1));

    }
}
