package practice5_io.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/*
 *標準流程
 * 1.創建源
 * 2.選擇流
 * 3.操作工具
 * 4.釋放
 */
public class IOTest輸入流02 {
	public static void main(String[] args) {
		
		//創建源
		File file =new File("D:/eclipse-workspace/Java300/src/IO_Study02/SXT");
		//選擇流
		InputStream is=null;
		try {
		//操作(讀取)
			is=new FileInputStream(file);
			int x=0;
			
			while(( x=is.read())!=-1) {
				
				System.out.println((char)x);
				
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
