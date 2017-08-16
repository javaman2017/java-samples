package classes.benchmarks;

public class OneParameterBenchmark extends BenchMark {
    
    private int parameter;
    
    public OneParameterBenchmark(int parameter) {
        super();
        this.parameter = parameter;
    }

    @Override
    void benchmark() {
        otherMethod(parameter);
    }
    
    void otherMethod(int parameter){
        for(int i = 0; i < parameter; i++);
    }

    public static void main(String[] args) {
        int count = Integer.parseInt(args[0]);
        int parameter = Integer.parseInt(args[1]);
        OneParameterBenchmark oneParameterBenchmark = new OneParameterBenchmark(parameter);
        long time = oneParameterBenchmark.repeat(count);
        System.out.println(count + " methods in " + time + " nanoseconds ");

    }

}
