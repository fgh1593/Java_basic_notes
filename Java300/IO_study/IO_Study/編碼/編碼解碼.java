package IO_Study.�s�X;

import java.io.UnsupportedEncodingException;

public class �s�X�ѽX {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String str="�ڷR�A";
		//getBytes �i��r��i��s�X�A�ন�줸
		//�w�]�ഫ�s�X��Package�w�]�s�X�A���ɬ�MS950
		byte[] data=str.getBytes(); 
		System.out.println(data.length);//��o�줸���סA���׬�6
		
		//�ϥ�UTF-8�i��s�X
		byte[] data2=str.getBytes("UTF-8");
		System.out.println(data2.length);//�줸���׬�9
		
		//��data�i��ѽX   String(�줸��,��ɶ}�l��,�줸�ռƶq,�s�X���A)
		String msg=new String(data2,0,data2.length,"UTF-8");
		System.out.println(msg);
		
		//�ýX
		//���p1:�줸�Ƥ���
		String msg2=new String(data2,0,data2.length-2,"UTF-8");
		System.out.println(msg2);
		
		//���p2:�s�X�r�ſ��~
		String msg3=new String(data2,0,data2.length,"gbk");
		System.out.println(msg3);
	}
}
