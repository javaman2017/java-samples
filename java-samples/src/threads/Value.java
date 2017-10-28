package threads;

public class Value {
    private int value;

    public int getValue() {
        return value;
    }

    public void add(int increment){
        value += increment;
        System.out.println(Thread.currentThread().getName() + " updated value to new value = " + value);
    }


    public static void main(String[] args) throws InterruptedException {
        int increment = 1;
        Value value = new Value();
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                    for (int i = 0; i < 10; i++)
                        value.add(increment);
            }
        },"threadA");

        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                    for (int i = 0; i < 100; i++)
                        value.add(increment);
            }
        },"threadB");

        Thread threadC = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++)
                    value.add(increment);
            }
        },"threadC");

        threadA.start();
        threadB.start();
        threadC.start();

        // join main onto the end of threadC so that we only evaluate the assert when all threads are done
        // this is one way
        threadC.join();
        assert value.getValue() == 120 : "value should be 120. Actual value is = " + value.getValue();

    }
}
