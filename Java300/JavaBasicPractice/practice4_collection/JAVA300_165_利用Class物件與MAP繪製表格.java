package practice4_collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class JAVA300_165_利用Class物件與MAP繪製表格 {
	public static void main(String[] args) {
		Employeeeeee A=new Employeeeeee(1001, "張三", 20000, "2018.05.05");
		Employeeeeee B=new Employeeeeee(1002, "李四", 30000, "2005.04.04");
		Employeeeeee C=new Employeeeeee(1003, "王五", 3000, "2020.05.04");
		
		Map<Integer, Employeeeeee> map=new HashMap<Integer, Employeeeeee>();
		map.put(A.ID, A);
		map.put(B.ID, B);
		map.put(C.ID, C);
	
		
		Set<Integer> s=map.keySet();
			for (Integer key : s) {
				System.out.println(key+"\t"+map.get(key).name+"\t"+map.get(key).salary+"\t"+map.get(key).entrytime);
			}
	}
	
}
class Employeeeeee{
	int ID;
	String name;
	int salary;
	String entrytime;
	public Employeeeeee(int iD, String name, int salary, String entrytime) {
		super();
		ID = iD;
		this.name = name;
		this.salary = salary;
		this.entrytime = entrytime;
	}			
}
