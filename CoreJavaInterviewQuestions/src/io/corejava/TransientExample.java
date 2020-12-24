package io.corejava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TransientExample {

	public static void main(String[] args) {

		TestBean bean = new TestBean("Ram", 28, "Male");

		// writing object into file
		try {
			FileOutputStream f = new FileOutputStream(new File("C:\\Users\\test\\Desktop\\HCL\\TestBean.txt"));
			ObjectOutputStream out = new ObjectOutputStream(f); // Writing the object to file.
			out.writeObject(bean);
			out.flush();
			out.close();
			f.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// reading the serialized Object from File

		ObjectInputStream in;
		try {
			in = new ObjectInputStream(new FileInputStream("C:\\Users\\test\\Desktop\\HCL\\TestBean.txt"));
			TestBean s = (TestBean) in.readObject();
			System.out.println(s.toString());
			in.close();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

class TestBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String name;
	transient int age; /// Now it will not be serialized
	String gender;

	public TestBean(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "TestBean [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

}
