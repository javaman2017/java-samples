package threads;

public class StaticSynchronization implements Runnable{
	
	private int i = 10;
	
	@Override
	public void run() {
		this.getI();
		this.setId(10);
	}
	
	public synchronized int getI() {
		System.out.println(Thread.currentThread().getName() + " getting i: " + i);
		return i;
	}
	
	public synchronized void setId(int i) {
		System.out.println(Thread.currentThread().getName() + " setting i to new value: " + i);
		this.i = i;
	}

	public static void main(String[] args) {
		Runnable task1 = new StaticSynchronization();
		new Thread(task1,"t1").start();
		
		Runnable task2 = new StaticSynchronization();
		new Thread(task2,"t2").start();
	}
}
