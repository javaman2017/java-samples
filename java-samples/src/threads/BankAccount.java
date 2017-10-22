package threads;

public class BankAccount {
	
	private double balance;
	
	public BankAccount(double balance) {
		this.balance = balance;
	}
	
	public synchronized boolean makeWithdrawl(double amount) {
		boolean success = false;
		System.out.println(Thread.currentThread().getName() + " is making a withdrawl of " + amount);
		System.out.println(Thread.currentThread().getName() + " getting balance " + balance);
		if (balance - amount >= 0) {
			balance -= amount;
			System.out.println("Balance is now: " + balance);
			success = true;
		}
		
		return success;
	}

	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount(100);
		
		new Thread(new Runnable() {
			public void run() {
				if(bankAccount.makeWithdrawl(60.0))
					System.out.println(Thread.currentThread().getName() + " completed withdrawl");
				else 
					System.out.println("Insuffufficent funds for " + Thread.currentThread().getName() + " to complete withdrawl");
			}
		},"t1").start();
		
		new Thread(new Runnable() {
			public void run() {
				if(bankAccount.makeWithdrawl(50.0))
					System.out.println(Thread.currentThread().getName() + " completed withdrawl");
				else 
					System.out.println("Insuffufficent funds for " + Thread.currentThread().getName() + " to complete withdrawl");
			}
		},"t2").start();


	}

}
