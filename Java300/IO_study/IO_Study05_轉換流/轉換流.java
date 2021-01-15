package IO_Study05_�ഫ�y;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * �ഫ�y:InputStreamReader,OutputStreamWriter
 * 1. �N�줸�ഫ���r��
 * 2.���w�s�X�Φ�
 * 
 */
public class �ഫ�y {
	public static void main(String[] args) {
		// �ާ@System.in �M System.out
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// �`�������L����J�A��Jexit�h�X�A��X�����e
		String msg = "";
		try {
			while (!msg.equals("exit")) {
				msg = br.readLine(); // �`��Ū��
				bw.write(msg);// �`����X
				bw.newLine();
				bw.flush();//�j���X
			}
		} catch (IOException e) {

			e.printStackTrace();
		} finally {

			try {
				if (bw != null) {
					bw.close();
				}
			} catch (IOException e) {

				e.printStackTrace();
			}
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

	}

}
