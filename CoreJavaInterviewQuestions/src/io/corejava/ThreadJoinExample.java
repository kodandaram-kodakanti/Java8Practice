package io.corejava;

public class ThreadJoinExample {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {

				for (int i = 0; i < 5; i++) {
					System.out.println("Thrread-1");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {

				for (int i = 0; i < 5; i++) {
					System.out.println("Thrread-2");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

		});

		System.out.println("Start: Main Thread.");
		t1.start();

		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		t2.start();
		
		t1.join();// Waits for this thread to die.
		t2.join();// Waits for this thread to die.

		System.out.println("End: Main Thread."); // This line executes at last if we use join() on t1 & ts. OTherwise,
												// it executes on parallel to threads, once.

		System.out.println("t1.isAlive(): " + t1.isAlive());
		System.out.println("t2.isAlive(): " + t2.isAlive());
	}

}
