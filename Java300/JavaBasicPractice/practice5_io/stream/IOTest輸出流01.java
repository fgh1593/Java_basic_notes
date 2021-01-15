package practice5_io.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
 * ���r���X�y
 * 1.�Ыط�
 * 2.��ܬy
 * 3.�ާ@(�g�X���e)
 * 4.����귽
 */
public class IOTest��X�y01 {
	
	public static void main(String[] args)  {
		
		//1.�Ыط�
		File src =new File("dest.txt");
//		File src =new File("dest.txt",true);  �r�ꤣ�|�л\ �r��|�����r��
//		File src =new File("dest.txt",false); �r��|�л\�ª��r��  
		//2.��ܬy
		OutputStream os=null;
		try {
			os=new FileOutputStream(src);
		//3.�ާ@(�g�X)
			String msg="IO is so easy";
			byte[] datas=msg.getBytes();//�s�X:�r��-->�줸
			os.write(datas, 0, datas.length);//�ѽX��X
			os.flush();//�R�X�A�����ƺ��d��y��
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
		//4.����
			if(os!=null) {
				try {
					os.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
		}
	}
}
