package IO_Study04_�w�Ĭy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;

public class �r��w�Ĭy��J�y{
	
		public static void main(String[] args) {
			//1.�Ыط�
			File src=new File("D:\\eclipse-workspace\\Java300\\abc");
			BufferedReader r=null;
			//2.��ܬy
			try {
				r=new BufferedReader(new FileReader(src)); //�Q��BufferedReader ���ɩʯ�
				String line =null;
				//BufferedReader �v��Ū���\��
				while((line=r.readLine())!=null) {
				
				System.out.println(line);
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
