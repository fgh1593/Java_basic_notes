package practice5_io.file_and_path;

import java.io.File;

/*
 * �c��File���c��
 */
public class FileDemo01 {
	
	public static void main(String[] args) {
		String path ="D:/eclipse-workspace/Java300/src/IO_Study/IO.jpg";
		
		//1.�غcFile��H�A��k1
		File src=new File(path);
		System.out.println(src.length());//����ɮפj�p
		
		
		//2.�غcFile��H�A��k2
		File src2=new File("D:/eclipse-workspace/Java300/src/IO_Study/IO.jpg");
		//���l���c
		File src21=new File("D:/eclipse-workspace/Java300/src/IO_Study","IO.jpg");
		File src22=new File("D:/eclipse-workspace/Java300/src","IO_Study/IO.jpg");
		
		System.out.println(src2.length());//����ɮפj�p
		//3.�غcFile��H�A��k3
		File src3 =new File(new File("D:/eclipse-workspace/Java300/src/IO_Study"),"IO.jpg");
		System.out.println(src3.length());
	}
}
