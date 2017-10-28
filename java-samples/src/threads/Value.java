package threads;

import java.util.concurrent.CountDownLatch;

public class Value {
    private static int value;

    public static int getValue() {
        return value;
    }
    public static void setValue(int value) { Value.value = value;}

    public static synchronized void add(int increment){
        value += increment;
    }


    public static void main(String[] args) throws InterruptedException {
        for(int run = 0; run < 10; run++) {
            CountDownLatch latch = new CountDownLatch(3);

            int increment = 1;
            Value value = new Value();
            Thread threadA = new Thread(new Runnable() {
                @Override
                public void run() {
                        for (int i = 0; i < 1000; i++)
                            value.add(increment);

                        latch.countDown();
                }
            }, "threadA");

            Thread threadB = new Thread(new Runnable() {
                @Override
                public void run() {
                        for (int i = 0; i < 1000; i++)
                            value.add(increment);

                        latch.countDown();
                }
            }, "threadB");

            Thread threadC = new Thread(new Runnable() {
                @Override
                public void run() {
                        for (int i = 0; i < 1000; i++)
                            value.add(increment);

                        latch.countDown();
                }
            }, "threadC");

            threadA.start();
            threadB.start();
            threadC.start();

            latch.await();
            System.out.println("Run " + run + " with final value = " + value.getValue());
            value.setValue(0);
        }

    }
}
