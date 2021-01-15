package practice5_io.file_and_path;

import java.io.File;

/*
 * 構建File結構式
 */
public class FileDemo01 {
	
	public static void main(String[] args) {
		String path ="D:/eclipse-workspace/Java300/src/IO_Study/IO.jpg";
		
		//1.建構File對象，方法1
		File src=new File(path);
		System.out.println(src.length());//顯示檔案大小
		
		
		//2.建構File對象，方法2
		File src2=new File("D:/eclipse-workspace/Java300/src/IO_Study/IO.jpg");
		//父子結構
		File src21=new File("D:/eclipse-workspace/Java300/src/IO_Study","IO.jpg");
		File src22=new File("D:/eclipse-workspace/Java300/src","IO_Study/IO.jpg");
		
		System.out.println(src2.length());//顯示檔案大小
		//3.建構File對象，方法3
		File src3 =new File(new File("D:/eclipse-workspace/Java300/src/IO_Study"),"IO.jpg");
		System.out.println(src3.length());
	}
}
