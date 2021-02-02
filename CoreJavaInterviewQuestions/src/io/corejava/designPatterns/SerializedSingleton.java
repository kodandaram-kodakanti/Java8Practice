package io.corejava.designPatterns;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7916567964455987350L;

	private SerializedSingleton() {
	}

	private static class SingletonHelper {
		private static final SerializedSingleton INSTANCE = new SerializedSingleton();
	}

	public static SerializedSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}

	/***
	 * The problem with serialized singleton class is that whenever we deserialize
	 * it, it will create a new instance of the class. So, we need to provide the
	 * implementation of readResolve() method.
	 * 
	 */
	protected Object readResolve() {
		return getInstance();
	}
}