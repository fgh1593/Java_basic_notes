package practice4_collection;

import java.util.HashSet;
import java.util.Set;

/**
 * HashSet�S��
 * �ƾڤ��i���ơA�B�S�����ǡA�u��ϥιM���d��
 *��k�PCollection�ۦP�A�S���s����k
 *���ƪ��ƵL�k�[�J
 */
public class JAVA300_158_HashSet {
	public static void main(String[] args) {
		Set<String> set=new HashSet<>();
		set.add("A");
		set.add("A");
		System.out.println(set);
	}
}
