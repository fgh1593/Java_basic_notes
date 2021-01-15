package IO_Study02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/*
 * 一次讀取多個字
 */
public class IOTest輸入流03 {
	public static void main(String[] args) {
		
		//創建源
		File file =new File("D:/eclipse-workspace/Java300/src/IO_Study02/SXT");
		//選擇流
		InputStream is=null;
		try {
		//操作(讀取)(分段讀取)
			is=new FileInputStream(file);
			
			byte[] flush=new byte[1024];
			//上式為中間緩衝容器，一次最多可裝N個位元，為一編碼程序，建議使用1024(1k)的倍數
			//以1024*N撰寫
			int len=0;//此處為實際接收到的位元長度
			
			
			//is.read(byte[])將回傳位元組實際長度
			while(( len=is.read(flush))!=-1) {  
				
				String str=new String(flush,0,len);//解碼:位元-->字串
				System.out.println(str);
				
			}
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			//釋放
			try {
				if(is!=null) {
				is.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
