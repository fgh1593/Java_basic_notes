package 線程;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Timer;
import java.util.TimerTask;

//定時調度:借助Timer 和 TimerTask
public class JAVA300_224_定時調度 {
	public static void main(String[] args) {
		Timer timer=new Timer();
		//執行安排
		
		//3秒後啟動，執行一次
		timer.schedule(new MyTask(), 3000);
		
		//2秒後啟動，每隔1秒啟動一次，重複執行
		timer.schedule(new MyTask(), 2000,1000);
		//指定時間啟動，每隔1秒啟動一次，重複執行
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
