package practice4_collection;

import java.util.Set;
import java.util.TreeSet;

/**
 * TreeSet特性
 * 數據不可重複，有順序
 *重複的數無法加入
 */
public class JAVA300_160_TreeSet {
	public static void main(String[] args) {
		Set<Integer> tset=new TreeSet<>();
		tset.add(1);
		tset.add(2);
		tset.add(50);
		for (Integer integer : tset) {
			System.out.println(integer);
		}
		
	}
}
