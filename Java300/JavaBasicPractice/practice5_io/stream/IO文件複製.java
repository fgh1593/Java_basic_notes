package practice5_io.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * ���ƻs:���r���J+��X�y
 */
public class IO���ƻs {

	public static void main(String[] args) {

		// 1.�Ыط�
		File src = new File("D:\\eclipse-workspace\\Java300\\SXT");// ���Y
		File dest = new File("D:\\eclipse-workspace\\Java300\\dest.txt");// �ت��a
		// 2.��ܬy
		OutputStream os = null;
		InputStream is = null;
		// 3.�ާ@
		byte[] flush = new byte[1024 * 3];
		int len = 0;

		try {
			is = new FileInputStream(src);
			os = new FileOutputStream(dest);
			while ((len = is.read(flush)) != -1) { // ��J
				os.write(flush, 0, len);// ��X
			}
			os.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {// ����귽�A���q�����A�����}��������
			try {
				if (os != null) {
					os.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				if(is !=null) {
				is.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
