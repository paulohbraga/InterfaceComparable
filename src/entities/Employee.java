package entities;


public class Employee implements Comparable<Employee> {

	private String name;
	private String salary;
	
	
	public Employee(String name, String salary) {
		this.name = name;
		this.salary = salary;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSalary() {
		return salary;
	}


	public void setSalary(String salary) {
		this.salary = salary;
	}


	@Override
	public int compareTo(Employee next) {
		// TODO Auto-generated method stub
		return this.name.compareTo(next.getName());
	}

}
