package practice5_io.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/*
 * �Ĥ@�ӨB�J:���x�y�{
 * 1.�Ыط�
 * 2.��ܬy
 * 3.�ާ@�u��
 * 4.����
 */
public class IOTest��J�y01 {
	public static void main(String[] args) {
		
		//�Ыط�
		File file =new File("D:/eclipse-workspace/Java300/src/IO_Study02/SXT");
		//��ܬy
		try {
			InputStream is=new FileInputStream(file);
		//�ާ@(Ū��)
			int data1=is.read(); //Ū���Ĥ@�Ӽƾ�
			int data2=is.read(); //Ū���ĤG�Ӽƾ�
			int data3=is.read(); //Ū���ĤT�Ӽƾ�
			int data4=is.read(); //Ū���ĥ|�ӼƾڡA���L�ĩҥH���-1
			System.out.println((char)(data1));
			System.out.println((char)(data2));
			System.out.println((char)(data3));
			System.out.println((data4));
		//����
			is.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
