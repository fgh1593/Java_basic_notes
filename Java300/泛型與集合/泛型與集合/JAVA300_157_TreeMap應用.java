package �x���P���X;

import java.util.Map;
import java.util.TreeMap;

public class JAVA300_157_TreeMap���� {
public static void main(String[] args) {
	Map<Integer, String> treemap1=new TreeMap<>();
	treemap1.put(20, "aa");
	treemap1.put(2, "bb");
	treemap1.put(11, "xx");
	
	Map<Emp, String> treemap2=new TreeMap<>();
	treemap2.put(new Emp(01,"A",30000), "�ѳ�");
	treemap2.put(new Emp(02, "B",300000),"�����D��");
	treemap2.put(new Emp(03,"C",30000), "�s��");
	
	//.keySet�i�H�гy�@���䪺���X
	//TreeMap�S�ʡA�L����|�۰ʱƧ�
	for(Integer key:treemap1.keySet()) {
		System.out.println(key+"---"+treemap1.get(key));
	};
	
	for (Emp K : treemap2.keySet()) {
		System.out.println(K+"---"+treemap2.get(K));
	}
	
}
}

//�ۭq�@�ӥi�ƧǪ���
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
	//��^ �t��:�p��  0:���� ����:�j�� 
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
