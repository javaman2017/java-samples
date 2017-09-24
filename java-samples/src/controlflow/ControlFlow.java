package controlflow;

public class ControlFlow {
    
    static double sum(double[] values){
        double sum = 0.0;
        
        if (values.length > 0){
            for(int i = 0; i < values.length; i++)
                if (values[i] > 0)
                    sum += values[i];
        } else {
            sum = values[0];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("sum of {1.0,2.0,3.0} is : " + ControlFlow.sum(new double[]{1.0,2.0,3.0}));
        System.out.println("sum of {1.0,2.0,3.0,0.0} is : " + ControlFlow.sum(new double[]{1.0,2.0,3.0,0.0}));

    }

}
