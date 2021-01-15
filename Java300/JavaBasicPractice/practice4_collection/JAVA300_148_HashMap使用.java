package practice4_collection;

import java.util.HashMap;
import java.util.Map;

/*
 * Map為 鍵-值構成，鍵不可重複
 * HashMap 線程不安全，效率高
 * HashTable 線程安全，效率低
 */
public class JAVA300_148_HashMap使用 {
public static void main(String[] args) {
	//<鍵,值>
	Map<Integer,String> m1 =new HashMap<>();
	
	//.put 加入鍵與值進入集合
	m1.put(1, "one");
	m1.put(2,"two");
	m1.put(3, "three");
	
	//.get 取出相應的鍵的值
	System.out.println(m1.get(1));
	
	//.size() 集合內有幾對鍵值對
	System.out.println(m1.size());
	
	//.isEmpty() 集合是否為空
	System.out.println(m1.isEmpty());
	
	//.comtainsKey 集合是否包含 指定的鍵
	System.out.println(m1.containsKey(3));
	
	//.comtainsValue 集合是否包含 指定的值
	System.out.println(m1.containsValue("Three"));
	
	Map<Integer,String> m2=new HashMap<>();
	m2.put(4, "四");
	m2.put(5, "五");
	//將m2加入m1
	m1.putAll(m2);

	System.out.println(m1);
	
	//map中鍵不能重複，若重複(由Equals判斷)，則新的覆蓋舊的
	
	m1.put(3, "三");
	System.out.println(m1);
}
}
