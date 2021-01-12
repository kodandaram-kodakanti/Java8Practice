package io.corejava.streamAPI;

@FunctionalInterface
public interface Test<String, Integer, Float> {
	public abstract Float m1(String a, Integer b);
}