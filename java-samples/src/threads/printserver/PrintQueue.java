package threads.printserver;

import classes.queue.SingleLinkQueue;

public class PrintQueue {
	
	private SingleLinkQueue<PrintJob> queue = new SingleLinkQueue<>();
	
	public synchronized void add(PrintJob job) {
		queue.add(job);
		notifyAll();    // Tell waiters print job added
	}
	
	public synchronized PrintJob remove() throws InterruptedException {

		while (queue.isEmpty())
			wait();	// Wait for a print job

		return queue.remove();
	}
}
