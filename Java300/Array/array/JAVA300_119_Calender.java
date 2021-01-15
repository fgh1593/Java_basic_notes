package array;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class JAVA300_119_Calender {
	//Calendar為抽象類，實現類為GregorianCalendar();
	public static void main(String[] args) {
		//獲得日期
		Calendar c =new GregorianCalendar(2050,10,18,22,05,01);//設定日期
		System.out.println(c.get(Calendar.YEAR));//獲得年分
		System.out.println(c.get(Calendar.MONTH));//獲得月份,0-11  0是1月
		System.out.println(c.get(Calendar.DAY_OF_WEEK));//星期幾  1是星期天、2是星期一
		System.out.println(c.get(Calendar.DATE));//幾號，也可以用DAY_OF_Month
		
		//設置日期
		Calendar c2=new GregorianCalendar();//建構式不輸入即為現在時間
		c2.set(Calendar.YEAR, 2070);//修改年分
		c2.add(Calendar.DATE, 100);//日期往後100天
		getCalendar(c2);
		//Calendar類轉成DATE類
		Date d=c2.getTime();
		
		//Date類轉成Calendar類
		Calendar c3=new GregorianCalendar();
		c3.setTime(new Date());
		getCalendar(c3);
		
		
	}
	
	//創建一個方法顯示我們想要的日期格式
	public static void getCalendar(Calendar c) {
		int year=c.get(Calendar.YEAR);
		int month=c.get(Calendar.MONTH)+1;
		int day=c.get(Calendar.DATE);
		int day_weak=c.get(Calendar.DAY_OF_WEEK)-1;
		String s= day_weak==0 ? "日" : ""+day_weak;
		int hour=c.get(Calendar.HOUR);
		int min=c.get(Calendar.MINUTE);
		int sec=c.get(Calendar.SECOND);
		System.out.println(year+"年"+month+"月"+day+"日"+" 星期"+s+"  "+hour+"時"+min+"分"+sec+"秒");
	}
}
