package practice5_io.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * 文件複製:文件字串輸入+輸出流
 */
public class IO文件複製 {

	public static void main(String[] args) {

		// 1.創建源
		File src = new File("D:\\eclipse-workspace\\Java300\\SXT");// 源頭
		File dest = new File("D:\\eclipse-workspace\\Java300\\dest.txt");// 目的地
		// 2.選擇流
		OutputStream os = null;
		InputStream is = null;
		// 3.操作
		byte[] flush = new byte[1024 * 3];
		int len = 0;

		try {
			is = new FileInputStream(src);
			os = new FileOutputStream(dest);
			while ((len = is.read(flush)) != -1) { // 輸入
				os.write(flush, 0, len);// 輸出
			}
			os.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {// 釋放資源，分段關閉，先打開的後關閉
			try {
				if (os != null) {
					os.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				if(is !=null) {
				is.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
