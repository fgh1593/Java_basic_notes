package practice4_collection;

import java.util.ArrayList;
import java.util.Collection;

public class JAVA300_134_Collection���f�P��k {
	public static void main(String[] args) {
		Collection<String> c=new ArrayList<String>();
		
		// .size() �P�_���X�j�p
		System.out.println(c.size());
		// .isEmpty() �P�_���X�O�_����
		System.out.println(c.isEmpty());
		
		//.add() �W�[����ܶ��X��
		c.add("��");
		c.add("��");
		
		//.contains() ���X�O�_�]�t����
		c.contains("��");
		
		//.toArray() �N���X�ഫ��Object�}�C
		Object[] o=c.toArray();
		System.out.println(o);
		
		// .remove() �N����q���X������
		c.remove("��");
		//.clear() �M�Ŷ��X
		c.clear();
		
		System.out.println(c.size());
	}

}
