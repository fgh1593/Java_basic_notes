package practice5_io.文件分割;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Merge {
	public static void main(String[] args) throws IOException {
		File dirpath=new File("D:/eclipse-workspace/Java300/分離檔案資料夾");
						
		File dest=new File("MergeFile.jpg");
		
		BufferedOutputStream os=new BufferedOutputStream(new FileOutputStream(dest,true));
		
		File[] datas=dirpath.listFiles();
		for (int i = 0; i < datas.length; i++) {
			System.out.println(datas[i].getName());
			
		}
		for(int i=0;i<datas.length;i++) {
			byte[] flush=new byte[1024*10];
			BufferedInputStream is=new BufferedInputStream(new FileInputStream(datas[i]));
			int len=-1;
			while((len=is.read(flush))!=-1) {
				os.write(flush,0,len);
			}
			os.flush();
			is.close();
			
		}
		os.close();
	}
	
	
	
	
}
