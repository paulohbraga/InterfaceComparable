package aplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

public class Program {
	
	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();
		String path = "src/file.txt";
		
		try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
			String Employee = reader.readLine();
			while(Employee != null) {
				String[] fields = Employee.split(",");
				employees.add(new Employee(fields[0], fields[1]));
				Employee = reader.readLine();
			}
		}catch (Exception e) {
			System.out.println("Error: " + e);
		}
		Collections.sort(employees);
		for(Employee s: employees) {
			System.out.println(s.getName() + ", " + s.getSalary());
		}
	}

}
