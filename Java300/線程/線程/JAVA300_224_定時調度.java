package �u�{;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Timer;
import java.util.TimerTask;

//�w�ɽի�:�ɧUTimer �M TimerTask
public class JAVA300_224_�w�ɽի� {
	public static void main(String[] args) {
		Timer timer=new Timer();
		//����w��
		
		//3���ҰʡA����@��
		timer.schedule(new MyTask(), 3000);
		
		//2���ҰʡA�C�j1��Ұʤ@���A���ư���
		timer.schedule(new MyTask(), 2000,1000);
		//���w�ɶ��ҰʡA�C�j1��Ұʤ@���A���ư���
		Calendar c=new GregorianCalendar(2020,12,31,06,21,2);
		timer.schedule(new MyTask(), c.getTime(),1000);
		
	}
}

class MyTask extends TimerTask{

	@Override
	public void run() {
			System.out.println("Hello World");
	}
	
}
