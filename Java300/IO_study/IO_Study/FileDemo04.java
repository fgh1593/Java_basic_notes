package IO_Study;

import java.io.File;

/*
 文件狀態
 	1、不存在:exists
 	2、存在
 	文件:isFile
 	資料夾:isDirectory
 */
public class FileDemo04 {
	public static void main(String[] args) {
		File src=new File("IO.jpg");
		
		System.out.println("是否存在:"+src.exists());
		
		File src2=new File("src/IO_Study/IO.jpg");
		System.out.println("------------------------");
		System.out.println("是否存在:"+src2.exists());
		System.out.println("是否為文件:"+src2.isFile());
		System.out.println("是否為文件夾:"+src2.isDirectory());
	
		File src3=new File("src/IO_Study");
		System.out.println("------------------------");
		System.out.println("是否存在:"+src3.exists());
		System.out.println("是否為文件:"+src3.isFile());
		System.out.println("是否為文件夾:"+src3.isDirectory());
		
		 
	
	
	}
	
	
	

}
