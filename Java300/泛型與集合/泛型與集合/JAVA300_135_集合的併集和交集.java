package 泛型與集合;

import java.util.ArrayList;
import java.util.List;

public class JAVA300_135_集合的併集和交集 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		
		List<String> list2=new ArrayList<>();
		list2.add("aa");
		list2.add("dd");
		list2.add("ee");
		
		List<String> list3=new ArrayList<>();
		list3.add("aa");
		list3.add("bb");
		list3.add("cc");
		
		List<String> list4=new ArrayList<>();
		list4.add("aa");
		list4.add("dd");
		list4.add("ee");
		
		//.addALL() 將List2加入List中
		list.addAll(list2);
		System.out.println("list:"+list);
		
		//.removeAll() 將List3中與List4中重複的值刪除
		list3.removeAll(list4);
		System.out.println("list3:"+list3);
		
		//.retainAll() 只保留 (List中) 與List3重複的部分
		list.retainAll(list3);
		System.out.println("list:"+list);
		
		// .containsAll() 判斷 list 是否包含 list3全部的物件
		System.out.println(list.containsAll(list3));
		
	}
	

	
	
}
