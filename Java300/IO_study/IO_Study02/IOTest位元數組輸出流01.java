package IO_Study02;

import java.io.ByteArrayOutputStream;
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
public class IOTest�줸�Ʋտ�X�y01 {
	
	public static void main(String[] args)  {
		
		//1.�Ыط�
		byte[] dest =null;
		//2.��ܬy(�s�W��k)
		ByteArrayOutputStream btos=null;
		try {
			btos=new ByteArrayOutputStream();  //�O�s�ܤ����Ŷ�
		//3.�ާ@(�g�X)�B�N�r��H�줸�����s�J���s��
			String msg="IO is so easy";
			byte[] datas=msg.getBytes();//�s�X:�r��-->�줸
			btos.write(datas, 0, datas.length);//�ѽX��X
			btos.flush();//�R�X�A�����ƺ��d��y��
			//�q���s������
			dest=btos.toByteArray();
			System.out.println(new String(dest,0,btos.size()));
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		}
	}


