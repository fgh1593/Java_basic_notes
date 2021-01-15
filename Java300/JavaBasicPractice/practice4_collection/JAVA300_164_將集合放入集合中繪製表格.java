package practice4_collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class JAVA300_164_將集合放入集合中繪製表格 {
	public static void main(String[] args) {
		Employeeee A=new Employeeee(1001, "張三", 20000, "2018.05.05");
		Employeeee B=new Employeeee(1002, "李四", 30000, "2005.04.04");
		Employeeee C=new Employeeee(1003, "王五", 3000, "2020.05.04");
		
		Map<Integer, Employeeee> map=new HashMap<Integer, Employeeee>();
		map.put(A.ID, A);
		Map<Integer, Employeeee> map2=new HashMap<Integer, Employeeee>();
		map2.put(B.ID, B);
		Map<Integer, Employeeee> map3=new HashMap<Integer, Employeeee>();
		map3.put(C.ID, C);
		
		List<Map<Integer, Employeeee>> list=new ArrayList<Map<Integer,Employeeee>>();
		list.add(map);
		list.add(map2);
		list.add(map3);
		
		for (Map<Integer, Employeeee> map4 : list) {
			Set<Integer> s=map4.keySet();
			for (Integer key : s) {
				System.out.println(key+"\t"+map4.get(key).name+"\t"+map4.get(key).salary+"\t"+map4.get(key).entrytime);
			}
		}
	}
	
}
class Employeeee{
	int ID;
	String name;
	int salary;
	String entrytime;
	public Employeeee(int iD, String name, int salary, String entrytime) {
		super();
		ID = iD;
		this.name = name;
		this.salary = salary;
		this.entrytime = entrytime;
	}			
}
