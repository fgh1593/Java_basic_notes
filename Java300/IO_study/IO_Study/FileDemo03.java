package IO_Study;

import java.io.File;

/*
 getName()
 getPath()
 getAbsolutePath()
 getParent():�W���|�Y���s�b ��^ null
 */

public class FileDemo03 {
	public static void main(String[] args) {
		File src=new File("D:\\eclipse-workspace\\Java300\\src\\IO_Study\\IO.jpg");
		
		System.out.println("�W��:"+src.getName());
		System.out.println("���|:"+src.getPath());
		System.out.println("������|:"+src.getAbsolutePath());
		System.out.println("�����|:"+src.getParent());
		System.out.println("����H:"+src.getParentFile().getName());
	}
}
