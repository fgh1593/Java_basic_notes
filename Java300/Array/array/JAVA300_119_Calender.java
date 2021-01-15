package array;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class JAVA300_119_Calender {
	//Calendar����H���A��{����GregorianCalendar();
	public static void main(String[] args) {
		//��o���
		Calendar c =new GregorianCalendar(2050,10,18,22,05,01);//�]�w���
		System.out.println(c.get(Calendar.YEAR));//��o�~��
		System.out.println(c.get(Calendar.MONTH));//��o���,0-11  0�O1��
		System.out.println(c.get(Calendar.DAY_OF_WEEK));//�P���X  1�O�P���ѡB2�O�P���@
		System.out.println(c.get(Calendar.DATE));//�X���A�]�i�H��DAY_OF_Month
		
		//�]�m���
		Calendar c2=new GregorianCalendar();//�غc������J�Y���{�b�ɶ�
		c2.set(Calendar.YEAR, 2070);//�ק�~��
		c2.add(Calendar.DATE, 100);//�������100��
		getCalendar(c2);
		//Calendar���নDATE��
		Date d=c2.getTime();
		
		//Date���নCalendar��
		Calendar c3=new GregorianCalendar();
		c3.setTime(new Date());
		getCalendar(c3);
		
		
	}
	
	//�Ыؤ@�Ӥ�k��ܧڭ̷Q�n������榡
	public static void getCalendar(Calendar c) {
		int year=c.get(Calendar.YEAR);
		int month=c.get(Calendar.MONTH)+1;
		int day=c.get(Calendar.DATE);
		int day_weak=c.get(Calendar.DAY_OF_WEEK)-1;
		String s= day_weak==0 ? "��" : ""+day_weak;
		int hour=c.get(Calendar.HOUR);
		int min=c.get(Calendar.MINUTE);
		int sec=c.get(Calendar.SECOND);
		System.out.println(year+"�~"+month+"��"+day+"��"+" �P��"+s+"  "+hour+"��"+min+"��"+sec+"��");
	}
}
