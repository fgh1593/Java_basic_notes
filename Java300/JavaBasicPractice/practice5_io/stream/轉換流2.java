package practice5_io.stream;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;

/*
 * 轉換流:InputStreamReader,OutputStreamWriter
 * 1. 以字串的形式，操作位元流
 * 2.指定編碼形式
 * 
 */
public class 轉換流2 {
	public static void main(String[] args) {
		// 操作System.in 和 System.out
		
		
		BufferedReader reader=null;
		try {
			URL url =new URL("https://www.pcschoolonline.com.tw/");
			
			//利用兩種裝飾器，Buffered 和 InputStreamreader
			reader=new BufferedReader
					(new InputStreamReader
							(url.openStream(),"UTF-8"));//指定編碼
			//讀取
			String msg;
			while((msg=reader.readLine())!=null) {
				System.out.println(msg);
			}
			
			
		} catch (IOException e) {

			e.printStackTrace();
		} finally {

			try {
				if (reader != null) {
					reader.close();
				}
			} catch (IOException e) {

				e.printStackTrace();
			}
			
		}

	}

}
