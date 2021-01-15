package 泛型與集合;

import java.util.HashMap;
import java.util.Map;

public class JAVA300_149_HashMap使用2 {
	public static void main(String[] args) {
		Employee e1=new Employee(01, "A", 50000);
		Employee e2=new Employee(02, "B", 70000);
		Employee e3=new Employee(03, "C", 100000);
		
		Map<Integer,Employee> map=new HashMap<>();
		
		map.put(01, e1);
		map.put(02, e2);
		map.put(03, e3);
		
		Employee emp=map.get(01);
		System.out.println(emp.getEname());
	}
}



class Employee{
	private int id;
	private String ename;
	private double salary;
	
	public Employee(int id, String ename, double salary) {
		super();
		this.id = id;
		this.ename = ename;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}