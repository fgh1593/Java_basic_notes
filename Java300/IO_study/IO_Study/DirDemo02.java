package IO_Study;

import java.io.File;

/*
 * 1. list()�C�X�U�@�Ÿ�Ƨ��W��
 * 2. listFiles():�C�X�U�@�Ť����
 */
public class DirDemo02 {
	public static void main(String[] args) {
		
		File A=new File("D:/eclipse-workspace/Java300/IO_study");
		
		//�C�X�U�Ÿ�Ƨ����Ҧ��ɮצW�١A�u�|�C�X�@�h
		String[] subNames =A.list();
		for (String aa : subNames) {
			System.out.println(aa);
		}
		
		//�C�X�U�Ÿ�Ƨ����Ҧ���H
		File[] subFiles =A.listFiles();
		for (File aa : subFiles) {
			System.out.println(aa);
		}
	}
}
