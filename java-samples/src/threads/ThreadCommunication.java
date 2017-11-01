package threads;

public class ThreadCommunication {

    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        PrintMessageNotifier printMessageNotifier = new PrintMessageNotifier();
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                for(;;){
                    long secondsElapsed = (System.currentTimeMillis() - startTime)/1000;
                    System.out.println("secondsElapsed = " + secondsElapsed + "s");
                    System.out.println("Notifying threadB");
                    printMessageNotifier.setPrintMessage(true);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        },"threadA");

        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                for (;;) {
                    try {
                        if(printMessageNotifier.getPrintMessage()) {
                            System.out.println("Received notification from threadA");
                            printMessageNotifier.setPrintMessage(false);
                            long secondsElapsed = (System.currentTimeMillis() - startTime)/1000;
                            if(secondsElapsed > 0 && secondsElapsed % 15 == 0)
                                System.out.println("msg = 15 more seconds have elapsed");
                        }

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        },"threadB");

        threadA.start();
        threadB.start();
    }
}

class PrintMessageNotifier {
    private boolean printMessage;


    public synchronized boolean getPrintMessage() throws InterruptedException {
        while(!printMessage)
            wait();

        return printMessage;
    }

    public synchronized void setPrintMessage(boolean printMessage) {
        this.printMessage = printMessage;
        if(printMessage) {
            notify();
        }
    }
}