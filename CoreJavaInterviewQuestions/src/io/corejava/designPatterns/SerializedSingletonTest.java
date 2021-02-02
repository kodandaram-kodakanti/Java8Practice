package io.corejava.designPatterns;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializedSingletonTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		SerializedSingleton instanceOne = SerializedSingleton.getInstance();

		ObjectOutput out = new ObjectOutputStream(
				new FileOutputStream("C:\\Users\\test\\Desktop\\CAPCO & MPhasis\\serializedObject.ser"));

		out.writeObject(instanceOne);
		out.close();

		ObjectInput input = new ObjectInputStream(
				new FileInputStream("C:\\Users\\test\\Desktop\\CAPCO & MPhasis\\serializedObject.ser"));
		SerializedSingleton instanceTwo = (SerializedSingleton) input.readObject();
		input.close();
		System.out.println("Hashcode of InstanceOne: " + instanceOne.hashCode());
		System.out.println("Hashcode of InstanceTwo: " + instanceTwo.hashCode());

	}
}