package threads.printserver;

public class PrintServer implements Runnable {
	
	private final PrintQueue requests = new PrintQueue();
	
	public PrintServer() {
		new Thread(this).start();
	}
	
	public void print(PrintJob job) {
		requests.add(job);
	}

	@Override
	public void run() {
		for(;;)
			realPrint(requests.remove());
	}

	private void realPrint(PrintJob job) {
		System.out.println("Printing: " + job);	
	}

	public static void main(String[] args) {
		PrintServer printServer = new PrintServer();
		
		printServer.print(new PrintJob("doc",1));

	}

}
