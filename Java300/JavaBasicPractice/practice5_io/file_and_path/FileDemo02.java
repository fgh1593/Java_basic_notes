package practice5_io.file_and_path;

import java.io.File;

/*
 * 相對路徑與絕對路徑
 */
public class FileDemo02 {
	
	public static void main(String[] args) {
		
		//絕對路徑，存在硬碟字母
		String path ="D:/eclipse-workspace/Java300/src/IO_Study/IO.jpg";
		File src1=new File(path);
		System.out.println(src1.getAbsolutePath());//取得物件的絕對路徑
		
		//相對路徑，取用同一"專案"的同路徑檔案
				
		File src2=new File("src/IO_Study/IO.jpg");
		System.out.println(src2.length());
		System.out.println(src2.getAbsolutePath());
		
		//構建不存在的文件，也可以成功生成
		
		File src3=new File("AAIO.jpg");
		System.out.println(src3.length());
		System.out.println(src3.getAbsolutePath());
	}
}
