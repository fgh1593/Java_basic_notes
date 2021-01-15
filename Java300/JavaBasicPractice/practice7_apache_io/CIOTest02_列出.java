package practice7_apache_io;

import java.io.File;
import java.util.Collection;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.commons.io.filefilter.EmptyFileFilter;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.io.filefilter.SuffixFileFilter;

public class CIOTest02_列出 {
public static void main(String[] args) {
	//為一個集合，FileUtils.listFiles(路徑,檔案過濾器,資料夾過濾器)
	Collection <File> files=FileUtils.listFiles(new File("D:/eclipse-workspace/Java300/IO_study/IO_Study"),
			EmptyFileFilter.NOT_EMPTY , DirectoryFileFilter.INSTANCE);
	//檔案過濾器 為EmptyFileFilter.NOT_EMPTY 則空白文件不被列入
	//資料夾過濾器 為null只列出一層
	//資料夾過濾器 為DirectoryFileFilter.INSTANCE 列出所有層
	for (File file : files) {
		System.out.println(file.getAbsolutePath());
	}
	
	System.out.println("--------------------------");
	Collection <File> files2=FileUtils.listFiles(new File("D:/eclipse-workspace/Java300/IO_study"),
			FileFilterUtils.or(new SuffixFileFilter("java"),EmptyFileFilter.NOT_EMPTY) , DirectoryFileFilter.INSTANCE);
	//檔案過濾器 為		new SuffixFileFilter("java")  即可 過濾出.java文件
	//FileFilterUtils.or 可以使用多種條件過濾
	//FileFilterUtils.and 可以列出同時具備兩者的文件
	for (File file : files2) {
		System.out.println(file.getAbsolutePath());
	}
}
}
