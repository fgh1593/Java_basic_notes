package practice5_io.file_and_path;

import java.io.File;
/*
 * 路徑名稱如何打
 */
public class PathDemo01 {
	
	public static void main(String[] args) {
		//  \\為名稱分割符，複製Windows 路徑，Java自動轉字
		String path="D:\\eclipse-workspace\\Java300\\src\\IO_Study\\IO.jpg";
		System.out.println(path);
		
		//建議使用較安全的做法
		//1. "/"通用分割符號
		String path1="D:/eclipse-workspace/Java300/src/IO_Study/IO.jpg";
		System.out.println(path1);
		//2. 拼接方法
		String path2="D:"+File.separator+"eclipse-workspace"+File.separator+"Java300"+File.separator+"src"+File.separator+"IO_Study"+File.separator+"IO.jpg";
		System.out.println(path2);
	}
	
}
