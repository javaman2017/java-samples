package threads.printserver;

public class PrintServer implements Runnable {
	
	private final static String THREAD_NAME = "PrintServerThread";
	private final PrintQueue requests = new PrintQueue();
	
	public PrintServer() {
		new Thread(this,THREAD_NAME).start();
	}
	
	public void print(PrintJob job) {
		requests.add(job);
	}

	@Override
	public void run() {
		if (!THREAD_NAME.equals(Thread.currentThread().getName()))
			return; // only PrintServer thread can run print jobs
		
		for(;;)
			realPrint(requests.remove());
	}

	private void realPrint(PrintJob job) {
		System.out.println("Printing: " + job);	
	}

	public static void main(String[] args) {
		PrintServer printServer = new PrintServer();
		
		

	}

}
