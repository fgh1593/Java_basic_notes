package �x���P���X;

import java.util.ArrayList;
import java.util.List;

public class JAVA300_135_���X���ֶ��M�涰 {
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
		
		//.addALL() �NList2�[�JList��
		list.addAll(list2);
		System.out.println("list:"+list);
		
		//.removeAll() �NList3���PList4�����ƪ��ȧR��
		list3.removeAll(list4);
		System.out.println("list3:"+list3);
		
		//.retainAll() �u�O�d (List��) �PList3���ƪ�����
		list.retainAll(list3);
		System.out.println("list:"+list);
		
		// .containsAll() �P�_ list �O�_�]�t list3����������
		System.out.println(list.containsAll(list3));
		
	}
	

	
	
}
