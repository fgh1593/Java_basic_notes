package practice7_apache_io;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

public class CIOTest03_讀取內容 {
	public static void main(String[] args) throws IOException {
		//讀取文件
		String msg=FileUtils.readFileToString(new File("aaa"),"MS950");
		System.out.println(msg);
		//讀取成位元數組
		byte[] datas=FileUtils.readFileToByteArray(new File("aaa"));
		System.out.println(datas.length);
		
		//逐行讀取
		//List記得import java.util.List;
		List<String> msgs=FileUtils.readLines(new File("aaa"),"MS950");
		System.out.println(msgs.get(0));
		System.out.println(msgs.get(2));
		System.out.println("------------------");
		//迭代器
		LineIterator it=FileUtils.lineIterator(new File("aaa"),"MS950");
		while(it.hasNext()) {
			System.out.println(it.nextLine());
		}
	}
}
