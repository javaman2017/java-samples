package threads;

public class ObjectSynchronization implements Runnable {
	
	private synchronized void f(int i) {
		System.out.println(Thread.currentThread().getName() + " accessing f() " + " for the " + i + "th time");
	}

	@Override
	public void run() {
		for(int i= 0; i < 10; i++)
			f(i);

	}

	public static void main(String[] args) {
		Runnable task1 = new ObjectSynchronization();
		new Thread(task1,"t1").start();
		new Thread(task1,"t2").start();
		new Thread(task1,"t3").start();
		new Thread(task1,"t4").start();
	}

}
