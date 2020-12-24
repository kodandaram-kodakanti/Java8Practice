package io.corejava.MultiThreading;

public class PrintEvenOddNumbersByTwoThreads {

	public static void main(String[] args) {
		ThreadEvenOdd oddThread = new ThreadEvenOdd(1);
		ThreadEvenOdd evenThread = new ThreadEvenOdd(0);

		// Thread t1 = new Thread(oddThread, "Odd");
		// Thread t2 = new Thread(evenThread, "Even");

		oddThread.setName("Odd");
		evenThread.setName("Even");

		oddThread.start();
		evenThread.start();

	}

}

class ThreadEvenOdd extends Thread {
	private int maxNum = 10;
	static volatile int initialValue = 1; // this must be static; because all the threads are looking for this value for
	// iteration or calculation for remainder
	static volatile Object lock = new Object();// this must be static as above
	int remainder;

	ThreadEvenOdd(int remainder) {
		this.remainder = remainder;
	}

	@Override
	public void run() {
		while (initialValue < maxNum) {
			synchronized (lock) {
				while (initialValue % 2 != remainder) { // wait for numbers other than remainder
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() + " " + initialValue);
				initialValue++;
				lock.notifyAll();
			}
		}
	}
}
