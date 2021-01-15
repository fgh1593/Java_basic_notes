package 泛型與集合;

import java.util.Map;
import java.util.TreeMap;

public class JAVA300_157_TreeMap應用 {
public static void main(String[] args) {
	Map<Integer, String> treemap1=new TreeMap<>();
	treemap1.put(20, "aa");
	treemap1.put(2, "bb");
	treemap1.put(11, "xx");
	
	Map<Emp, String> treemap2=new TreeMap<>();
	treemap2.put(new Emp(01,"A",30000), "老鳥");
	treemap2.put(new Emp(02, "B",300000),"高階主管");
	treemap2.put(new Emp(03,"C",30000), "新手");
	
	//.keySet可以創造一個鍵的集合
	//TreeMap特性，他的鍵會自動排序
	for(Integer key:treemap1.keySet()) {
		System.out.println(key+"---"+treemap1.get(key));
	};
	
	for (Emp K : treemap2.keySet()) {
		System.out.println(K+"---"+treemap2.get(K));
	}
	
}
}

//自訂一個可排序的類
class Emp implements Comparable<Emp>{
	int id;
	String name;
	double salary;
	public Emp(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	//返回 負數:小於  0:等於 正數:大於 
	public int compareTo(Emp o) {
		
		if(this.salary>o.salary) {
			return -1;
		}else if(this.salary<o.salary) {
			return 1;
		}else {
			if(this.id>o.id) {
				return 1;
			}else if(this.id<o.id) {
				return -1;
			}else {
				return 0;
			}
		}
	}
	
}
