package IO_Study.編碼;

import java.io.UnsupportedEncodingException;

public class 編碼解碼 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String str="我愛你";
		//getBytes 可對字串進行編碼，轉成位元
		//預設轉換編碼為Package預設編碼，此時為MS950
		byte[] data=str.getBytes(); 
		System.out.println(data.length);//獲得位元長度，長度為6
		
		//使用UTF-8進行編碼
		byte[] data2=str.getBytes("UTF-8");
		System.out.println(data2.length);//位元長度為9
		
		//對data進行解碼   String(位元組,邊界開始值,位元組數量,編碼型態)
		String msg=new String(data2,0,data2.length,"UTF-8");
		System.out.println(msg);
		
		//亂碼
		//狀況1:位元數不足
		String msg2=new String(data2,0,data2.length-2,"UTF-8");
		System.out.println(msg2);
		
		//狀況2:編碼字符錯誤
		String msg3=new String(data2,0,data2.length,"gbk");
		System.out.println(msg3);
	}
}
