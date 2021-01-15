package practice5_io.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/*
 * 第一個步驟:熟悉流程
 * 1.創建源
 * 2.選擇流
 * 3.操作工具
 * 4.釋放
 */
public class IOTest輸入流01 {
	public static void main(String[] args) {
		
		//創建源
		File file =new File("D:/eclipse-workspace/Java300/src/IO_Study02/SXT");
		//選擇流
		try {
			InputStream is=new FileInputStream(file);
		//操作(讀取)
			int data1=is.read(); //讀取第一個數據
			int data2=is.read(); //讀取第二個數據
			int data3=is.read(); //讀取第三個數據
			int data4=is.read(); //讀取第四個數據，但無效所以顯示-1
			System.out.println((char)(data1));
			System.out.println((char)(data2));
			System.out.println((char)(data3));
			System.out.println((data4));
		//釋放
			is.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
