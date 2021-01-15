package array;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JAVA300_118_DateFormat {
	//時間與字串的互相轉換
	//DateFormate為抽象類，實現類應用為SimpleDateFormate
	public static void main(String[] args) throws ParseException {
		//將指定的時間類"按照指定的格式"轉換成字串
		DateFormat df=new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss"); //日期格式化輸出
		String str=df.format(new Date());
		System.out.println(str);
		
		//將指定的字符串"對比指定格式"轉換成時間類
		DateFormat df2=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date=df2.parse("1993-10-18 01:00:30");
		System.out.println(date);
		
		//測試其他的字符格式。比如:例如利用 'D'獲得對象是今年的第幾天。
		DateFormat df3=new SimpleDateFormat("D");
		String str2=df3.format(new Date());
		System.out.println(str2);
	}
}
