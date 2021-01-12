package io.corejava;

/***
 * A thread is in WAITING state when it's waiting for some other thread to
 * perform a particular action
 */

class ThreadJoinMethodTest implements Runnable {
	public static Thread t1;

	public void run() {

		Thread t2 = new Thread(new DemoThreadWS());
		t2.setName("Thread-2");
		t2.start();
		System.out.println("Thread started is : " + Thread.currentThread().getName());
		try {
			System.out.println("Thread-2 state before join(): " + t2.getState());
			t2.join();
			System.out.println("Thread-2 state after join(): " + t2.getState());
			System.out.println("Thread-1 state: " + t1.getState());

		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			System.out.println("Thread interrupted");
		}
	}

	public static void main(String[] args) {
		t1 = new Thread(new ThreadJoinMethodTest());
		t1.setName("Thread-1");
		t1.start();
	}

}

class DemoThreadWS implements Runnable {

	public void run() {
		try {
			System.out.println("Thread started is : " + Thread.currentThread().getName());
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			System.out.println("Thread interrupted");
		}

		System.out.println("Thread-1 state when Thread-2 under process: " + ThreadJoinMethodTest.t1.getState());
	}

}
