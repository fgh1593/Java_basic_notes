package practice2_Date;

import java.util.Date;

public class JAVA300_117_Date�ɶ��� {
public static void main(String[] args) {
	Date d=new Date();//�غc������J�ȡA�ά���e�ɶ�
	System.out.println(d);
	
	Date d2=new Date(2000);//��1970�~1��1�� ��2000�@��A�|�]�ɰϼv�T
	System.out.println(d2);
	
	System.out.println(d.getTime());//��o�q1970�ܦ����@��ƭ�
	
	System.out.println(d.after(d2));//�P�_d�O�_�bd2����
}
}
