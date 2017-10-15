package threads;

public class PingPong implements Runnable {
    private String word;    // what word to print
    private int    delay;   // how long to pause
    
    public PingPong(String whatToSay, int delayTime) {
        word = whatToSay;
        delay = delayTime;
    }
    
    public void run() {
        try {
            for(;;) {
                System.out.print(word + " ");
                Thread.sleep(delay); // wait until the next time
            }
        } catch (InterruptedException e) {
            return ;            // end this thread
        }
    }

    public static void main(String[] args) {
        Runnable ping = new PingPong("ping", 33);
        Runnable pong = new PingPong("PONG", 100);
        
        new Thread(ping).start();
        new Thread(pong).start();
    }
}