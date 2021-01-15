package practice5_io.file_and_path;

import java.io.File;

/*
 * 1. list()列出下一級資料夾名稱
 * 2. listFiles():列出下一級文件資料
 */
public class DirDemo02 {
	public static void main(String[] args) {
		
		File A=new File("D:/eclipse-workspace/Java300/IO_study");
		
		//列出下級資料夾的所有檔案名稱，只會列出一層
		String[] subNames =A.list();
		for (String aa : subNames) {
			System.out.println(aa);
		}
		
		//列出下級資料夾的所有對象
		File[] subFiles =A.listFiles();
		for (File aa : subFiles) {
			System.out.println(aa);
		}
	}
}
