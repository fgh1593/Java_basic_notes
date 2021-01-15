package practice4_collection;

import java.util.HashMap;
import java.util.Map;

/*
 * Map�� ��-�Ⱥc���A�䤣�i����
 * HashMap �u�{���w���A�Ĳv��
 * HashTable �u�{�w���A�Ĳv�C
 */
public class JAVA300_148_HashMap�ϥ� {
public static void main(String[] args) {
	//<��,��>
	Map<Integer,String> m1 =new HashMap<>();
	
	//.put �[�J��P�ȶi�J���X
	m1.put(1, "one");
	m1.put(2,"two");
	m1.put(3, "three");
	
	//.get ���X�������䪺��
	System.out.println(m1.get(1));
	
	//.size() ���X�����X����ȹ�
	System.out.println(m1.size());
	
	//.isEmpty() ���X�O�_����
	System.out.println(m1.isEmpty());
	
	//.comtainsKey ���X�O�_�]�t ���w����
	System.out.println(m1.containsKey(3));
	
	//.comtainsValue ���X�O�_�]�t ���w����
	System.out.println(m1.containsValue("Three"));
	
	Map<Integer,String> m2=new HashMap<>();
	m2.put(4, "�|");
	m2.put(5, "��");
	//�Nm2�[�Jm1
	m1.putAll(m2);

	System.out.println(m1);
	
	//map���䤣�୫�ơA�Y����(��Equals�P�_)�A�h�s���л\�ª�
	
	m1.put(3, "�T");
	System.out.println(m1);
}
}
