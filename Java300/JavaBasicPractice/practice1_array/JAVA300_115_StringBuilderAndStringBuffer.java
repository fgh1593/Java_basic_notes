package practice1_array;

public class JAVA300_115_StringBuilderAndStringBuffer {
	public static void main(String[] args) {
		//String �����i�ܦr�ŧǦC
		//StringBuilder�BStringBuffer���i�ܦr�ŧǦC
		
		//StringBuilder �u�{���w���A�Ĳv���A����`��
		//StringBuffer �u�{�w���A�Ĳv�C
		//��̨ϥΤ�k�ۦ�
		StringBuilder sb= new StringBuilder("abcdefg");
		System.out.println(Integer.toHexString(sb.hashCode()));
		System.out.println(sb);
		
		sb.setCharAt(3, 'M');
		System.out.println(Integer.toHexString(sb.hashCode()));
		System.out.println(sb);
	}
}
