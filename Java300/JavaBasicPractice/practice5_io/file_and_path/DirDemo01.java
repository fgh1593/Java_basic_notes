package practice5_io.file_and_path;

import java.io.File;

/*
 * �Ыظ�Ƨ�
 * 1.mkdir():�T�O�W�Ÿ�Ƨ��s�b�A���s�b�Ыإ���
 * 2.mkdirs():�W�Ÿ�Ƨ��i�H���s�b�A�i�H�s�P�W�Ÿ�Ƨ��@�_�Ы�
 */
public class DirDemo01 {
	public static void main(String[] args) {
		//�|���� �]���S���W�Ÿ�Ƨ�
		File dir =new File("D:/eclipse-workspace/Java300/src/IO_Study/dir/a");
		boolean flag=dir.mkdir();
		System.out.println(flag);
		
		File dir2 =new File("D:/eclipse-workspace/Java300/src/IO_Study/dir/a");
		boolean flag2=dir2.mkdirs();
		System.out.println(flag2);
	
		
		
	}
}
