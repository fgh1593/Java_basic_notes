package array;

public class JAVA300_116_StringBuilderAndStringBuffer02 {
	public static void main(String[] args) {
		//String �����i�ܦr�ŧǦC
		//StringBuilder�BStringBuffer���i�ܦr�ŧǦC
		
		//StringBuilder �u�{���w���A�Ĳv���A����`��
		//StringBuffer �u�{�w���A�Ĳv�C
		//��̨ϥΤ�k�ۦ�
		StringBuilder sb= new StringBuilder();
		for(int i=0;i<26;i++) {
			char temp='a';
			temp+=i;
			//.append�i�H�N�y�l���W�h
			sb.append(temp);
		}
		System.out.println(sb);
		sb.reverse(); //����r��
		System.out.println(sb);
		sb.setCharAt(4,'!');//���N�r��
		System.out.println(sb);
		sb.insert(0, '~');//���J�r��
		System.out.println(sb);
		sb.insert(4, '@').append("haha").insert(10, 'A');//�妡�եΡC�֤ߴN�O�Ӥ�k�եΤFreturn this,��ۤv��^�C
		System.out.println(sb);
		sb.delete(0, 5);//�R�����w�϶������e
		System.out.println(sb);
	}
}
