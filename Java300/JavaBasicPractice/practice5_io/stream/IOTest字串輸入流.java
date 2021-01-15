package practice5_io.stream;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class IOTest�r���J�y {
	public static void main(String[] args) {
		//1.�Ыط�
		File src=new File("D:\\eclipse-workspace\\Java300\\abc");
		Reader r=null;
		//2.��ܬy
		try {
			r=new FileReader(src);
			char[] flush=new char[1024];
			int len=0;
			while((len=r.read(flush))!=-1) {
			String str =new String(flush,0,len);
			System.out.println(str);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
		try {
			if(r!=null) {
			r.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
