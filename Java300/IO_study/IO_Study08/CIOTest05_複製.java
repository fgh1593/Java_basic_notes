package IO_Study08;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

public class CIOTest05_�ƻs {
	public static void main(String[] args) throws IOException {
//		//�ƻs���
//		FileUtils.copyFile(new File("�[�o.jpg"), new File("�[�o-copy.jpg"));
//		//�ƻs�����Ƨ�
//		FileUtils.copyFileToDirectory(new File("�[�o.jpg"), new File("lib"));
//		//�ƻs��Ƨ����Ƨ�(�ƻs����Ƨ������l��Ƨ�)
//		FileUtils.copyDirectoryToDirectory(new File("lib"), new File("lib2"));
//		//�ƻs��Ƨ�
//		FileUtils.copyDirectory(new File("lib"), new File("lib2"));
		
		//�ƻsURL���e���ɮ�
		String URL="http://img.ewebweb.com/uploads/20190614/13/1560491725-KLlENPGteb.jpg";
		FileUtils.copyURLToFile(new URL(URL), new File("URL-COPY.jpg"));
		
		//Ū������URL��k
		
		String datas=IOUtils.toString(new URL("http://commons.apache.org/proper/commons-io/download_io.cgi"),"UTF-8");
		System.out.println(datas);
	}
}
