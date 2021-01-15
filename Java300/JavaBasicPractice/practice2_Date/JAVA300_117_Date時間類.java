package practice2_Date;

import java.util.Date;

public class JAVA300_117_Date時間類 {
public static void main(String[] args) {
	Date d=new Date();//建構式不輸入值，及為當前時間
	System.out.println(d);
	
	Date d2=new Date(2000);//為1970年1月1號 後2000毫秒，會因時區影響
	System.out.println(d2);
	
	System.out.println(d.getTime());//獲得從1970至此的毫秒數值
	
	System.out.println(d.after(d2));//判斷d是否在d2之後
}
}
