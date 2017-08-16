package classes.benchmarks;

public class MethodBenchmark extends BenchMark {

    @Override
    void benchmark() {
        // TODO Auto-generated method stub

    }

    public static void main(String[] args) {
        int count = Integer.parseInt(args[0]);
        long time = new MethodBenchmark().repeat(count);
        System.out.println(count + " methods in " + time + " nanoseconds ");
    }

}
