package array;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class JAVA300_120_�i���Ƥ�� {
	public static void main(String[] args) throws ParseException {
		DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("�п�J���(�榡�� yyyy-mm-dd)");
		Scanner sc=new Scanner(System.in);
		String src=sc.next();
		Date d= df.parse(src);
		Calendar c=new GregorianCalendar();
		c.setTime(d);
		Calendar c2=new GregorianCalendar();
		c2.setTime(d);
		c.set(Calendar.DATE, 1);
		System.out.println("��\t�@\t�G\t�T\t�|\t��\t��");
		int firstDay=c.get(Calendar.DAY_OF_WEEK);
		for(int i=0;i<(firstDay-1);i++) {
			System.out.print("\t");
		}
		
		for(int i=0;i<c.getActualMaximum(Calendar.DATE);i++) { //������̤j�Ѽ�
			c.set(Calendar.DATE, i+1);
			if((i+1)==c2.get(Calendar.DATE)) {
			System.out.print(i+1+"*");
			}else {
				System.out.print(i+1);
			}
			if(c.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY) {
				System.out.print("\n");
			}else {
				System.out.print("\t");
			}
		}
	}
}
