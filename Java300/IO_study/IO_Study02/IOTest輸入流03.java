package IO_Study02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/*
 * �@��Ū���h�Ӧr
 */
public class IOTest��J�y03 {
	public static void main(String[] args) {
		
		//�Ыط�
		File file =new File("D:/eclipse-workspace/Java300/src/IO_Study02/SXT");
		//��ܬy
		InputStream is=null;
		try {
		//�ާ@(Ū��)(���qŪ��)
			is=new FileInputStream(file);
			
			byte[] flush=new byte[1024];
			//�W���������w�Įe���A�@���̦h�i��N�Ӧ줸�A���@�s�X�{�ǡA��ĳ�ϥ�1024(1k)������
			//�H1024*N���g
			int len=0;//���B����ڱ����쪺�줸����
			
			
			//is.read(byte[])�N�^�Ǧ줸�չ�ڪ���
			while(( len=is.read(flush))!=-1) {  
				
				String str=new String(flush,0,len);//�ѽX:�줸-->�r��
				System.out.println(str);
				
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
