package IO_Study;

import java.io.File;

/*
 ��󪬺A
 	1�B���s�b:exists
 	2�B�s�b
 	���:isFile
 	��Ƨ�:isDirectory
 */
public class FileDemo04 {
	public static void main(String[] args) {
		File src=new File("IO.jpg");
		
		System.out.println("�O�_�s�b:"+src.exists());
		
		File src2=new File("src/IO_Study/IO.jpg");
		System.out.println("------------------------");
		System.out.println("�O�_�s�b:"+src2.exists());
		System.out.println("�O�_�����:"+src2.isFile());
		System.out.println("�O�_�����:"+src2.isDirectory());
	
		File src3=new File("src/IO_Study");
		System.out.println("------------------------");
		System.out.println("�O�_�s�b:"+src3.exists());
		System.out.println("�O�_�����:"+src3.isFile());
		System.out.println("�O�_�����:"+src3.isDirectory());
		
		 
	
	
	}
	
	
	

}
