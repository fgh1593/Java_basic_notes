package practice5_io.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/*
 *�зǬy�{
 * 1.�Ыط�
 * 2.��ܬy
 * 3.�ާ@�u��
 * 4.����
 */
public class IOTest��J�y02 {
	public static void main(String[] args) {
		
		//�Ыط�
		File file =new File("D:/eclipse-workspace/Java300/src/IO_Study02/SXT");
		//��ܬy
		InputStream is=null;
		try {
		//�ާ@(Ū��)
			is=new FileInputStream(file);
			int x=0;
			
			while(( x=is.read())!=-1) {
				
				System.out.println((char)x);
				
			}
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			//����
			try {
				if(is!=null) {
				is.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
