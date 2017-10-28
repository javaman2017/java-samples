package threads.printserver;

public class PrintServer implements Runnable {
	
	private long printServerThreadId;
	private final PrintQueue requests = new PrintQueue();
	
	public PrintServer() {
		Thread thread = new Thread(this);
		printServerThreadId = new Thread(this).getId();
		thread.start();
	}
	
	public void print(PrintJob job) {
		requests.add(job);
	}

	@Override
	public void run() {
		if (printServerThreadId != Thread.currentThread().getId())
			return; // only allow this thread id to execute run
		
		for(;;)
			realPrint(requests.remove());
	}

	private void realPrint(PrintJob job) {
		System.out.println("Printing: " + job);	
	}

	public static void main(String[] args) {
		PrintServer printServer = new PrintServer();
		printServer.run();
		

	}
}
