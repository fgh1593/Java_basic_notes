package �x���P���X;
// ArrayList �M LinkedList�H��Vector �ާ@��k�ۦP
//ArrayList�ϥΰ}�C�x�s�A Ū���� �W�R���C�C�u�{���w��
//LinkedList�ϥθ`�I����x�s�A Ū���C �W�R�֡C�u�{���w��
//Vector���c�PArrayList�A���۱asynchronize�P�B�A�Ĳv���t�A���u�{�w���C
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JAVA300_136_ArrayList_���ީM���Ǭ�����k {
	public static void main(String[] args) {
		List<String> L=new ArrayList<String>();
		L.add("A");
		L.add("B");
		L.add("C");
		L.add("D");
		L.add("E");
		
		System.out.println(L);
		
		//�b���w��m���J����
		L.add(2,"�w�w");
		System.out.println(L);
		//�R�����w��m����
		L.remove(2);
		System.out.println(L);
		//�b���w��m�ק磌��ƭ�
		L.set(2, "HA");
		System.out.println(L);
		//���o���w��m����
		System.out.println(L.get(2));
		
		L.add("A");
		
		//�������Ĥ@���X�{����m�A�Y���s�b��^-1
		System.out.println(L.indexOf("A"));
		//�������̫�@���X�{����m�A�Y���s�b��^-1
		System.out.println(L.lastIndexOf("A"));
		
		LinkedList<Integer> L2=new LinkedList<Integer>();
		L2.add(1);
		L2.add(2);
		
	}
}
