package IO_Study08;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

public class CIOTest05_複製 {
	public static void main(String[] args) throws IOException {
//		//複製文件
//		FileUtils.copyFile(new File("加油.jpg"), new File("加油-copy.jpg"));
//		//複製文件到資料夾
//		FileUtils.copyFileToDirectory(new File("加油.jpg"), new File("lib"));
//		//複製資料夾到資料夾(複製的資料夾成為子資料夾)
//		FileUtils.copyDirectoryToDirectory(new File("lib"), new File("lib2"));
//		//複製資料夾
//		FileUtils.copyDirectory(new File("lib"), new File("lib2"));
		
		//複製URL內容到檔案
		String URL="http://img.ewebweb.com/uploads/20190614/13/1560491725-KLlENPGteb.jpg";
		FileUtils.copyURLToFile(new URL(URL), new File("URL-COPY.jpg"));
		
		//讀取網頁URL方法
		
		String datas=IOUtils.toString(new URL("http://commons.apache.org/proper/commons-io/download_io.cgi"),"UTF-8");
		System.out.println(datas);
	}
}
