package practice4_collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class JAVA300_161_iterator���N�� {
public static void main(String[] args) {
	JAVA300_161_iterator���N�� A=new JAVA300_161_iterator���N��();
	A.iteratorList();
	A.iteratorSet();
	A.iteratorMap();
	A.iteratorMap2();
}
//�M��List
public static void iteratorList() {
	List<String> list= new LinkedList<String>();
	list.add("A");
	list.add("B");
	list.add("C");
	list.add("D");
	//.hasNext() �O�_���U�@�ӭ�
	for(Iterator<String> iter=list.iterator();iter.hasNext();) {
		//.next ��o��e�ƭȡA�ñN���Ы��V�U�@�ӭ�
		String temp=iter.next();
		System.out.println(temp);
	}
}
//�M��Set
public static void iteratorSet() {
	Set<String> list= new HashSet<String>();
	list.add("A");
	list.add("B");
	list.add("C");
	list.add("D");
	//.hasNext() �O�_���U�@�ӭ�
	for(Iterator<String> iter=list.iterator();iter.hasNext();) {
		//.next ��o��e�ƭȡA�ñN���Ы��V�U�@�ӭ�
		String temp=iter.next();
		System.out.println(temp);
	}
}
//�M��Map
public static void iteratorMap() {
	Map<Integer, String> map=new HashMap<Integer, String>();
	map.put(1, "A");
	map.put(2, "B");
	map.put(3, "C");
	
	//Entry ����ȹ諸���X�A�q�`�Ψӭ��N
	//Map�L�k���N�A�����̾aSet
	// .entrySet() �NMap�ন�@����ȹ諸Set���X
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
