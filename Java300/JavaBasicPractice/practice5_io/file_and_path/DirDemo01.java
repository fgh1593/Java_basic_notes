package practice5_io.file_and_path;

import java.io.File;

/*
 * 創建資料夾
 * 1.mkdir():確保上級資料夾存在，不存在創建失敗
 * 2.mkdirs():上級資料夾可以不存在，可以連同上級資料夾一起創建
 */
public class DirDemo01 {
	public static void main(String[] args) {
		//會失敗 因為沒有上級資料夾
		File dir =new File("D:/eclipse-workspace/Java300/src/IO_Study/dir/a");
		boolean flag=dir.mkdir();
		System.out.println(flag);
		
		File dir2 =new File("D:/eclipse-workspace/Java300/src/IO_Study/dir/a");
		boolean flag2=dir2.mkdirs();
		System.out.println(flag2);
	
		
		
	}
}
