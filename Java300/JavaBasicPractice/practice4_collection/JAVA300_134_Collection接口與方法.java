package practice4_collection;

import java.util.ArrayList;
import java.util.Collection;

public class JAVA300_134_Collection接口與方法 {
	public static void main(String[] args) {
		Collection<String> c=new ArrayList<String>();
		
		// .size() 判斷集合大小
		System.out.println(c.size());
		// .isEmpty() 判斷集合是否為空
		System.out.println(c.isEmpty());
		
		//.add() 增加物件至集合內
		c.add("花");
		c.add("草");
		
		//.contains() 集合是否包含物件
		c.contains("花");
		
		//.toArray() 將集合轉換為Object陣列
		Object[] o=c.toArray();
		System.out.println(o);
		
		// .remove() 將物件從集合中移除
		c.remove("草");
		//.clear() 清空集合
		c.clear();
		
		System.out.println(c.size());
	}

}
