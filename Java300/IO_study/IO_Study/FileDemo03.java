package IO_Study;

import java.io.File;

/*
 getName()
 getPath()
 getAbsolutePath()
 getParent():上路徑若不存在 返回 null
 */

public class FileDemo03 {
	public static void main(String[] args) {
		File src=new File("D:\\eclipse-workspace\\Java300\\src\\IO_Study\\IO.jpg");
		
		System.out.println("名稱:"+src.getName());
		System.out.println("路徑:"+src.getPath());
		System.out.println("絕對路徑:"+src.getAbsolutePath());
		System.out.println("父路徑:"+src.getParent());
		System.out.println("父對象:"+src.getParentFile().getName());
	}
}
