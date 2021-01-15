package IO_Study02;

import java.io.ByteArrayOutputStream;
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
public class IOTest位元數組輸出流01 {
	
	public static void main(String[] args)  {
		
		//1.創建源
		byte[] dest =null;
		//2.選擇流(新增方法)
		ByteArrayOutputStream btos=null;
		try {
			btos=new ByteArrayOutputStream();  //保存至內部空間
		//3.操作(寫出)、將字串以位元型式存入內存內
			String msg="IO is so easy";
			byte[] datas=msg.getBytes();//編碼:字串-->位元
			btos.write(datas, 0, datas.length);//解碼輸出
			btos.flush();//沖出，防止資料滯留於流內
			//從內存獲取資料
			dest=btos.toByteArray();
			System.out.println(new String(dest,0,btos.size()));
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		}
	}


