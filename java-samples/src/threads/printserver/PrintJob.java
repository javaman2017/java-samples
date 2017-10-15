package threads.printserver;

public class PrintJob {
	private String name;
	private int priority;
	
	public PrintJob(String name, int priority) {
		super();
		this.name = name;
		this.priority = priority;
	}

	public String getName() {
		return name;
	}

	public int getPriority() {
		return priority;
	}

	@Override
	public String toString() {
		return "PrintJob [name=" + name + ", priority=" + priority + "]";
	}
}
