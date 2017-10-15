package threads.printserver;

import java.util.PriorityQueue;
import java.util.Queue;

public class PrintQueue {
	
	private Queue<PrintJob> requests = new PriorityQueue<>();
	
	public void add(PrintJob job) {
		requests.add(job);
	}
	
	public PrintJob remove() {
		return requests.remove();
	}
	
	public boolean isEmpty() {
		return requests.isEmpty();
	}

}
