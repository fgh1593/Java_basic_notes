package array;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JAVA300_118_DateFormat {
	//�ɶ��P�r�ꪺ�����ഫ
	//DateFormate����H���A��{�����ά�SimpleDateFormate
	public static void main(String[] args) throws ParseException {
		//�N���w���ɶ���"���ӫ��w���榡"�ഫ���r��
		DateFormat df=new SimpleDateFormat("yyyy�~MM��dd�� hh:mm:ss"); //����榡�ƿ�X
		String str=df.format(new Date());
		System.out.println(str);
		
		//�N���w���r�Ŧ�"�����w�榡"�ഫ���ɶ���
		DateFormat df2=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date=df2.parse("1993-10-18 01:00:30");
		System.out.println(date);
		
		//���ը�L���r�Ů榡�C��p:�Ҧp�Q�� 'D'��o��H�O���~���ĴX�ѡC
		DateFormat df3=new SimpleDateFormat("D");
		String str2=df3.format(new Date());
		System.out.println(str2);
	}
}
