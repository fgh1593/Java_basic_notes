package practice5_io.stream;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/*
 * ByteArrayInputStream
 * ���ݭn����A������.close()����
 */
public class IOTest�줸�Ʋտ�J�y01 {
	public static void main(String[] args) {
		
		//�Ыط��A�אּ�줸�Ʋ�
		byte[] src ="I love guanjen".getBytes();
		//��ܬy
		ByteArrayInputStream bais=null;
		try {
		//�ާ@(Ū��)(���qŪ��)
			bais=new ByteArrayInputStream(src); //�אּ�줸�Ʋտ�J�y
			
			byte[] datas=new byte[1024];
			//�W���������w�Įe���A�@���̦h�i��N�Ӧ줸�A���@�s�X�{�ǡA��ĳ�ϥ�1024(1k)������
			//�H1024*N���g
			int len=0;//���B����ڱ����쪺�줸����
			
			
			//is.read(byte[])�N�^�Ǧ줸�չ�ڪ���
			while(( len=bais.read(datas))!=-1) {  
				
				String str=new String(datas,0,len);//�ѽX:�줸-->�r��
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
				if(bais!=null) {
				bais.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
