package practice5_io.file_and_path;

import java.io.File;

/*
 * �۹���|�P������|
 */
public class FileDemo02 {
	
	public static void main(String[] args) {
		
		//������|�A�s�b�w�Цr��
		String path ="D:/eclipse-workspace/Java300/src/IO_Study/IO.jpg";
		File src1=new File(path);
		System.out.println(src1.getAbsolutePath());//���o���󪺵�����|
		
		//�۹���|�A���ΦP�@"�M��"���P���|�ɮ�
				
		File src2=new File("src/IO_Study/IO.jpg");
		System.out.println(src2.length());
		System.out.println(src2.getAbsolutePath());
		
		//�c�ؤ��s�b�����A�]�i�H���\�ͦ�
		
		File src3=new File("AAIO.jpg");
		System.out.println(src3.length());
		System.out.println(src3.getAbsolutePath());
	}
}
