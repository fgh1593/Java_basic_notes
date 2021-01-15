package practice5_io.文件分割;

import java.io.File;
import java.io.IOException;

public class Separate_Demo {
	public static void main(String[] args) throws IOException {
		File f=new File("加油.jpg");
		String dirPath="分離檔案資料夾";
		Separate s=new Separate(f,1024*10,dirPath);
	}
}
