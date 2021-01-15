package practice5_io.file_and_path;

import java.io.File;
import java.io.IOException;
/*
 * .createNewFile() 僅能生成尚未存在的文件
 * .delete()  刪除已經存在的文件
 */
public class FileDemo05 {
	public static void main(String[] args) throws IOException {
		File src =new File("D:/eclipse-workspace/Java300/src/IO_Study/IO.txt");
		boolean flag =src.createNewFile();
		System.out.println(flag);
		
		src.delete();
		//無法生成資料夾
		File src2 =new File("D:/eclipse-workspace/Java300/src/IOStudy");
		boolean flag2 =src2.createNewFile();
		System.out.println(flag2);
		
		src2.delete();
	}
}
