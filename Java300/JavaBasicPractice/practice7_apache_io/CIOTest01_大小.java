package practice7_apache_io;

import java.io.File;

import org.apache.commons.io.FileUtils;

/*
 * �j�p
 */
public class CIOTest01_�j�p {
public static void main(String[] args) {
	//���j�p
	long len=FileUtils.sizeOf(new File("IO_study/IO_Study08/CIOTest01.java"));
	System.out.println(len);
	//�ؿ��j�p
	len=FileUtils.sizeOf(new File("IO_study"));
	System.out.println(len);
	
}
}
