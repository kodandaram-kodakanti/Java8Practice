package io.corejava;

public class SynchronizedMethod {

	private volatile int balance = 0;

	public void calculateStatistics() {

		Thread t1 = new Thread(new Runnable() {

			public void run() {
				for (int i = 0; i < 100000; i++) {
					add();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {

			public void run() {
				for (int i = 0; i < 100000; i++) {
					substract();
				}
			}
		});

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Balance is: " + balance);
	}

	public synchronized void add() {
		balance++;
	}

	public synchronized void substract() {
		balance--;
	}

	public static void main(String[] args) {
		SynchronizedMethod sMethodTest = new SynchronizedMethod();
		sMethodTest.calculateStatistics();

	}

}
