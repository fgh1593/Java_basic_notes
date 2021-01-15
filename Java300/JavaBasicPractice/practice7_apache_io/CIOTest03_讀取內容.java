package practice7_apache_io;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

public class CIOTest03_Ū�����e {
	public static void main(String[] args) throws IOException {
		//Ū�����
		String msg=FileUtils.readFileToString(new File("aaa"),"MS950");
		System.out.println(msg);
		//Ū�����줸�Ʋ�
		byte[] datas=FileUtils.readFileToByteArray(new File("aaa"));
		System.out.println(datas.length);
		
		//�v��Ū��
		//List�O�oimport java.util.List;
		List<String> msgs=FileUtils.readLines(new File("aaa"),"MS950");
		System.out.println(msgs.get(0));
		System.out.println(msgs.get(2));
		System.out.println("------------------");
		//���N��
		LineIterator it=FileUtils.lineIterator(new File("aaa"),"MS950");
		while(it.hasNext()) {
			System.out.println(it.nextLine());
		}
	}
}
