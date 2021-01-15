package IO_Study04_緩衝流;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;

public class 字串緩衝流輸入流{
	
		public static void main(String[] args) {
			//1.創建源
			File src=new File("D:\\eclipse-workspace\\Java300\\abc");
			BufferedReader r=null;
			//2.選擇流
			try {
				r=new BufferedReader(new FileReader(src)); //利用BufferedReader 提升性能
				String line =null;
				//BufferedReader 逐行讀取功能
				while((line=r.readLine())!=null) {
				
				System.out.println(line);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
			try {
				if(r!=null) {
				r.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		}
}
