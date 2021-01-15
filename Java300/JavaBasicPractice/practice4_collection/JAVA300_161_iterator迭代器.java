package practice4_collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class JAVA300_161_iterator迭代器 {
public static void main(String[] args) {
	JAVA300_161_iterator迭代器 A=new JAVA300_161_iterator迭代器();
	A.iteratorList();
	A.iteratorSet();
	A.iteratorMap();
	A.iteratorMap2();
}
//遍歷List
public static void iteratorList() {
	List<String> list= new LinkedList<String>();
	list.add("A");
	list.add("B");
	list.add("C");
	list.add("D");
	//.hasNext() 是否有下一個值
	for(Iterator<String> iter=list.iterator();iter.hasNext();) {
		//.next 獲得當前數值，並將指標指向下一個值
		String temp=iter.next();
		System.out.println(temp);
	}
}
//遍歷Set
public static void iteratorSet() {
	Set<String> list= new HashSet<String>();
	list.add("A");
	list.add("B");
	list.add("C");
	list.add("D");
	//.hasNext() 是否有下一個值
	for(Iterator<String> iter=list.iterator();iter.hasNext();) {
		//.next 獲得當前數值，並將指標指向下一個值
		String temp=iter.next();
		System.out.println(temp);
	}
}
//遍歷Map
public static void iteratorMap() {
	Map<Integer, String> map=new HashMap<Integer, String>();
	map.put(1, "A");
	map.put(2, "B");
	map.put(3, "C");
	
	//Entry 為鍵值對的集合，通常用來迭代
	//Map無法迭代，必須依靠Set
	// .entrySet() 將Map轉成一個鍵值對的Set集合
	Set<Entry<Integer,String>> s=map.entrySet();
	for(Iterator<Entry<Integer,String>> it=s.iterator();it.hasNext();) {
		Entry<Integer,String> temp=it.next();
		System.out.println("key:"+temp.getKey()+"  value:"+temp.getValue());
		
	}
	
}

public static void iteratorMap2() {
	Map<Integer, String> map=new HashMap<Integer, String>();
	map.put(1, "A");
	map.put(2, "B");
	map.put(3, "C");
	
	
	Set<Integer> s=map.keySet();
	for(Iterator<Integer> it=s.iterator();it.hasNext();) {
		Integer temp=it.next();
		System.out.println("key:"+temp+"  value:"+map.get(temp));
		
	}
	
}
}
