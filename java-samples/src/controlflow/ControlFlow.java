package controlflow;

public class ControlFlow {
    
    static double sum(double[] values){
        double sum = 0.0;
        int index = 0;
        if (values.length > 0){
            while(index < values.length){
                if (values[index] > 0)
                    sum += values[index];
                ++index;
            }
        } else {
            sum = values[0];
        }
        return sum;
    }
    
    static int tenPower(int value){
        int exp, v;
        for(exp = 0, v = value - 1; v > 0; exp++, v /= 10)
            continue;
        return exp;
    }

    public static void main(String[] args) {
        System.out.println("sum of {1.0,2.0,3.0} is : " + ControlFlow.sum(new double[]{1.0,2.0,3.0}));
        System.out.println("sum of {1.0,2.0,3.0,0.0} is : " + ControlFlow.sum(new double[]{1.0,2.0,3.0,0.0}));

        System.out.println("tenPower for 999: " + ControlFlow.tenPower(999));
    }

}
