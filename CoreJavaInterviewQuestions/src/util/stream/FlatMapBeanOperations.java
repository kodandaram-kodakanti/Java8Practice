package util.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student {
	int sId;
	String sName;
	char grade;

	public Student(int sId, String sName, char grade) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.grade = grade;
	}

	
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", grade=" + grade + "]";
	}
	
	

}

public class FlatMapBeanOperations {

	public static void main(String[] args) {
		
		List<Student> list1 = Arrays.asList(
									new Student(523, "Ram K K", 'A'),
									new Student(524, "Praveen", 'C'),
									new Student(520, "Krishna", 'D'),
									new Student(522, "Harish", 'B')
									);
		List<Student> list2 = Arrays.asList(
				new Student(423, "Suresh", 'A'),
				new Student(424, "Karthik", 'C'),
				new Student(420, "Neelima", 'D')
				);
		List<Student> list3 = Arrays.asList(
				new Student(323, "Rashmi", 'A'),
				new Student(324, "Kaustuba", 'C'),
				new Student(320, "Prashant", 'D'),
				new Student(322, "Nimith", 'B')
				);
		
		List<List<Student>> studentList = Arrays.asList(list1, list2, list3);
		
		/**Print StudentNames*/
		//Before Java8
		for (List<Student> students : studentList) {
			for (Student student : students) {
				System.out.println(student.sName);
			}
		}
		
		/**In Java8 **/
		/** Merging all the list into single list using flatMap()**/
		List<Student> students = studentList.stream().flatMap(studList -> studList.stream()).collect(Collectors.toList());
		System.out.println(students);
		System.out.println("Total List Size: " + students.size());
		
		/** Collect only names from all the lists using flatMap()*/
		List<String> names = studentList.stream().flatMap(studList -> studList.stream()).map(student -> student.sName).collect(Collectors.toList());
		System.out.println(names);
		System.out.println("Total Names Size: " + names.size());
	}

}
