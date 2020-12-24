package io.corejava;

class Native {
	static {
		System.loadLibrary("Native library path");
	}

	public native void m();
	public native String getLine(String s);

}

class Test {
	public static void main(String[] args) {
		Native n = new Native();
		
		n.getLine("Hello");
		n.m();
	}
}
