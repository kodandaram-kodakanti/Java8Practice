package util.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

class Emp {

	private String name;
	private int age;
	private String dept;
	public String city;
	private String state;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((dept == null) ? 0 : dept.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (age != other.age)
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (dept == null) {
			if (other.dept != null)
				return false;
		} else if (!dept.equals(other.dept))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		return true;
	}

	public Emp(String name, int age, String dept, String city, String state) {
		super();
		this.name = name;
		this.age = age;
		this.dept = dept;
		this.city = city;
		this.state = state;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the dept
	 */
	public String getDept() {
		return dept;
	}

	/**
	 * @param dept the dept to set
	 */
	public void setDept(String dept) {
		this.dept = dept;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", age=" + age + ", dept=" + dept + ", city=" + city + ", state=" + state + "]";
	}

}

public class GroupByExample {

	public static void main(String[] args) {
		

		List<Emp> empList = Arrays.asList(new Emp("Ram K K", 28, "Information Technolgy", "Bangalore", "Karnataka"),
				new Emp("Akhil", 26, "Business Analyst", "Mysore", "Karnataka"),
				new Emp("KodandaRamu K", 29, "Technical Lead", "Hyderabad", "Telangana"),
				new Emp("Mahendra", 33, "Testing", "Mysore", "Karnataka"),
				new Emp("Shahrukh", 28, "Designing", "Chennai", "Tamilnadu"),
				new Emp("Akhil", 31, "Designing", "Bangalore", "Karnataka"),
				new Emp("Lahari", 32, "Business Analyst", "Vizag", "Andhra Pradesh"),
				new Emp("Sathya", 29, "Information Technolgy", "Bangalore", "Karnataka"),
				new Emp("Ram K K", 28, "Information Technolgy", "Bangalore", "Karnataka"),
				new Emp("Shahrukh", 28, "Designing", "Chennai", "Tamilnadu"),
				new Emp("KodandaRamu K", 30, "Module Lead", "Bangalore", "Karnataka"),
				new Emp("Tashu", 30, "IT Delevopment", "Amaravathi", "Andhra Pradesh"),
				new Emp("Ram K K", 29, "Information Technolgy", "Bangalore", "Karnataka"));

		/** GroupBy State **/
		Map<String, List<Emp>> groupingByState = empList.stream().collect(Collectors.groupingBy(Emp::getState));
		System.out.println(groupingByState);

		/** GroupingBy State with count of it **/
		Map<String, Long> stateswithCount = empList.stream()
				.collect(Collectors.groupingBy(Emp::getState, Collectors.counting()));
		System.out.println("stateswithCount: " + stateswithCount);
		/** GroupBy Age **/
		Map<Integer, Set<Emp>> groupingByAge = empList.stream()
				.collect(Collectors.groupingBy(Emp::getAge, Collectors.toSet()));
		System.out.println(groupingByAge);

		/** GroupingBy State & Age **/
		Map<String, Map<Integer, List<Emp>>> groupByStateAge = empList.stream()
				.collect(Collectors.groupingBy(Emp::getState, Collectors.groupingBy(Emp::getAge)));
		System.out.println("groupByStateAge: " + groupByStateAge);

		/** Find the repeated states with count **/
		Map<String, Long> repeatedStateCount = empList.stream()
				.collect(Collectors.groupingBy(Emp::getState, Collectors.counting())).entrySet().stream()
				.filter(entry -> entry.getValue() > 1).collect(Collectors.toMap(Entry::getKey, Entry::getValue));
		System.out.println("repeatedEmpCount: " + repeatedStateCount);

		/** Repeated Employees with Count **/
		List<Entry<Emp, Long>> repeatedEmps = empList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(entry -> entry.getValue() > 1).collect(Collectors.toList());

		System.out.println("repeatedEmps: " + repeatedEmps);

		Map<Integer, Long> agesCount = empList.stream()
				.collect(Collectors.groupingBy(Emp::getAge, Collectors.counting()));
		System.out.println("Ages Grouping Count: " + agesCount);

		/** Getting the Minimum AgedObject from Grouped States **/
		Map<String, Optional<Emp>> min = empList.stream()
				.collect(Collectors.groupingBy(Emp::getState, Collectors.minBy(Comparator.comparingInt(Emp::getAge))));
		System.out.println("Getting the Minimum AgedObject from Grouped States: " + min);

		/** Partition the EmpList by Age below & above to 30 */
		Map<Boolean, List<Emp>> partitionedList = empList.stream()
				.collect(Collectors.partitioningBy(emp -> emp.getAge() >= 30));
		System.out.println("Partition the EmpList by Age below & above to 30: " + partitionedList);

		/** No.of Emp Objects in Each Partition with condition of age >=30 **/
		Map<Boolean, Long> partitionCount = empList.stream()
				.collect(Collectors.partitioningBy(emp -> emp.getAge() >= 30, Collectors.counting()));
		System.out.println("No.of Emp Objects in Each Partition with condition of age >=30 : " + partitionCount);
		/** Update the city-name whose age is more than 30 **/
		System.out.println(empList.stream().filter(emp -> emp.getAge() > 30).map(
				emp -> new Emp(emp.getName(), emp.getAge(), emp.getDept(), "Updated City to Bangalore", emp.getState()))
				.collect(Collectors.toList()));

		Map<String, Double> averageAgeOfEachState = empList.stream()
				.collect(Collectors.groupingBy(Emp::getState, Collectors.averagingInt(Emp::getAge)));
		System.out.println("averageAgeOfEachState: " + averageAgeOfEachState);

		TreeMap<String, Double> sortedStateByAverageAge = empList.stream()
				.collect(Collectors.groupingBy(Emp::getState, TreeMap::new, Collectors.averagingInt(Emp::getAge)));

		System.out.println("sortedStateByAverageAge: " + sortedStateByAverageAge);

		double averageAge = empList.stream().collect(Collectors.averagingInt(Emp::getAge));

		System.out.println("Average Ages of Emplyees: " + averageAge);

		/** Age Statistics **/
		IntSummaryStatistics stats = empList.stream().collect(Collectors.summarizingInt(Emp::getAge));
		System.out.println("Age Statistics: " + stats);

		/** GroupBy Employee name with Highest Age **/
		Map<String, Emp> groupByEmpNameWithMaxAge = empList.stream()
				.collect(Collectors.groupingBy(Emp::getName, Collectors.maxBy(Comparator.comparing(Emp::getAge))))
				.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue().get()));

		System.out.println("groupByEmpNameWithMaxAge: " + groupByEmpNameWithMaxAge);
		System.out.println("Size: " + groupByEmpNameWithMaxAge.size());
		
	}

}