package practice7_apache_io;

import java.io.File;

import org.apache.commons.io.FileUtils;

/*
 * 大小
 */
public class CIOTest01_大小 {
public static void main(String[] args) {
	//文件大小
	long len=FileUtils.sizeOf(new File("IO_study/IO_Study08/CIOTest01.java"));
	System.out.println(len);
	//目錄大小
	len=FileUtils.sizeOf(new File("IO_study"));
	System.out.println(len);
	
}
}
