package io.corejava;

public class GarbageCollection {
	public static void main(String args[]) {
		/*
		 * Here we are intentionally assigning a null value to a reference so that the
		 * object becomes non reachable
		 */
		GarbageCollection obj = new GarbageCollection();
		obj = null;

		/*
		 * Here we are intentionally assigning reference a to the another reference b to
		 * make the object referenced by b unusable.
		 */
		GarbageCollection a = new GarbageCollection();
		GarbageCollection b = new GarbageCollection();
		b = a;
		System.gc();
	}

	protected void finalize() throws Throwable {
		System.out.println("Garbage collection is performed by JVM");
	}
}
