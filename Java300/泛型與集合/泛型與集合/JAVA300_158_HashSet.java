package 泛型與集合;

import java.util.HashSet;
import java.util.Set;

/**
 * HashSet特性
 * 數據不可重複，且沒有順序，只能使用遍歷查找
 *方法與Collection相同，沒有新的方法
 *重複的數無法加入
 */
public class JAVA300_158_HashSet {
	public static void main(String[] args) {
		Set<String> set=new HashSet<>();
		set.add("A");
		set.add("A");
		System.out.println(set);
	}
}
