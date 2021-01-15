package practice5_io.stream;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;

/*
 * �ഫ�y:InputStreamReader,OutputStreamWriter
 * 1. �H�r�ꪺ�Φ��A�ާ@�줸�y
 * 2.���w�s�X�Φ�
 * 
 */
public class �ഫ�y2 {
	public static void main(String[] args) {
		// �ާ@System.in �M System.out
		
		
		BufferedReader reader=null;
		try {
			URL url =new URL("https://www.pcschoolonline.com.tw/");
			
			//�Q�Ψ�ظ˹����ABuffered �M InputStreamreader
			reader=new BufferedReader
					(new InputStreamReader
							(url.openStream(),"UTF-8"));//���w�s�X
			//Ū��
			String msg;
			while((msg=reader.readLine())!=null) {
				System.out.println(msg);
			}
			
			
		} catch (IOException e) {

			e.printStackTrace();
		} finally {

			try {
				if (reader != null) {
					reader.close();
				}
			} catch (IOException e) {

				e.printStackTrace();
			}
			
		}

	}

}
