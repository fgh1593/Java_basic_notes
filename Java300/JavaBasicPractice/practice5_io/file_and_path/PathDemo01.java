package practice5_io.file_and_path;

import java.io.File;
/*
 * ���|�W�٦p��
 */
public class PathDemo01 {
	
	public static void main(String[] args) {
		//  \\���W�٤��βšA�ƻsWindows ���|�AJava�۰���r
		String path="D:\\eclipse-workspace\\Java300\\src\\IO_Study\\IO.jpg";
		System.out.println(path);
		
		//��ĳ�ϥθ��w�������k
		//1. "/"�q�Τ��βŸ�
		String path1="D:/eclipse-workspace/Java300/src/IO_Study/IO.jpg";
		System.out.println(path1);
		//2. ������k
		String path2="D:"+File.separator+"eclipse-workspace"+File.separator+"Java300"+File.separator+"src"+File.separator+"IO_Study"+File.separator+"IO.jpg";
		System.out.println(path2);
	}
	
}
