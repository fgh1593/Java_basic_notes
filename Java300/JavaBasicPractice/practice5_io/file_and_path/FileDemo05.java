package practice5_io.file_and_path;

import java.io.File;
import java.io.IOException;
/*
 * .createNewFile() �ȯ�ͦ��|���s�b�����
 * .delete()  �R���w�g�s�b�����
 */
public class FileDemo05 {
	public static void main(String[] args) throws IOException {
		File src =new File("D:/eclipse-workspace/Java300/src/IO_Study/IO.txt");
		boolean flag =src.createNewFile();
		System.out.println(flag);
		
		src.delete();
		//�L�k�ͦ���Ƨ�
		File src2 =new File("D:/eclipse-workspace/Java300/src/IOStudy");
		boolean flag2 =src2.createNewFile();
		System.out.println(flag2);
		
		src2.delete();
	}
}
