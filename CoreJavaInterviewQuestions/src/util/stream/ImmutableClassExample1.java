package util.stream;

import java.util.HashMap;
import java.util.Map;

final class Student1 {
	private final String name;
	private final int regNo;
	private final Map<String, String> metaData;

	public Student1(String name, int regNo, Map<String, String> metaData) {
		super();
		this.name = name;
		this.regNo = regNo;
		// this.metaData = metaData;

		Map<String, String> tempMap = new HashMap<String, String>();
		for (Map.Entry<String, String> entry : metaData.entrySet()) {
			tempMap.put(entry.getKey(), entry.getValue());
		}
		this.metaData = tempMap;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the regNo
	 */
	public int getRegNo() {
		return regNo;
	}

	/**
	 * @return the metaData
	 */
	public Map<String, String> getMetaData() {
		Map<String, String> tempMap = new HashMap<String, String>();
		for (Map.Entry<String, String> entry : metaData.entrySet()) {
			tempMap.put(entry.getKey(), entry.getValue());
		}
		return tempMap;
	}
}

public class ImmutableClassExample1 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("1", "first");
		map.put("2", "second");
		Student1 s = new Student1("ABC", 101, map);
		System.out.println(s.getName());
		System.out.println(s.getRegNo());
		System.out.println(s.getMetaData());

		// Uncommenting below line causes error
		// s.regNo = 102;

		map.put("3", "third");
		System.out.println(s.getMetaData()); // Remains unchanged due to deep copy
		s.getMetaData().put("4", "fourth");
		System.out.println(s.getMetaData()); // Remains unchanged due to deep copy
	}

}