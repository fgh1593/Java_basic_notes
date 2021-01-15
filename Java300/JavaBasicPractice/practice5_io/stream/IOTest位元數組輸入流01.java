package practice5_io.stream;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/*
 * ByteArrayInputStream
 * 不需要釋放，但仍有.close()公式
 */
public class IOTest位元數組輸入流01 {
	public static void main(String[] args) {
		
		//創建源，改為位元數組
		byte[] src ="I love guanjen".getBytes();
		//選擇流
		ByteArrayInputStream bais=null;
		try {
		//操作(讀取)(分段讀取)
			bais=new ByteArrayInputStream(src); //改為位元數組輸入流
			
			byte[] datas=new byte[1024];
			//上式為中間緩衝容器，一次最多可裝N個位元，為一編碼程序，建議使用1024(1k)的倍數
			//以1024*N撰寫
			int len=0;//此處為實際接收到的位元長度
			
			
			//is.read(byte[])將回傳位元組實際長度
			while(( len=bais.read(datas))!=-1) {  
				
				String str=new String(datas,0,len);//解碼:位元-->字串
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
				if(bais!=null) {
				bais.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
