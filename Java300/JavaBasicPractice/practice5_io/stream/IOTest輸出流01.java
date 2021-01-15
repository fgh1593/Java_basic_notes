package practice5_io.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
 * 文件字串輸出流
 * 1.創建源
 * 2.選擇流
 * 3.操作(寫出內容)
 * 4.釋放資源
 */
public class IOTest輸出流01 {
	
	public static void main(String[] args)  {
		
		//1.創建源
		File src =new File("dest.txt");
//		File src =new File("dest.txt",true);  字串不會覆蓋 字串會接續於字串
//		File src =new File("dest.txt",false); 字串會覆蓋舊的字串  
		//2.選擇流
		OutputStream os=null;
		try {
			os=new FileOutputStream(src);
		//3.操作(寫出)
			String msg="IO is so easy";
			byte[] datas=msg.getBytes();//編碼:字串-->位元
			os.write(datas, 0, datas.length);//解碼輸出
			os.flush();//沖出，防止資料滯留於流內
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
		//4.釋放
			if(os!=null) {
				try {
					os.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
		}
	}
}
