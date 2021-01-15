package IO_Study05_轉換流;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 轉換流:InputStreamReader,OutputStreamWriter
 * 1. 將位元轉換成字串
 * 2.指定編碼形式
 * 
 */
public class 轉換流 {
	public static void main(String[] args) {
		// 操作System.in 和 System.out
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// 循環獲取鍵盤的輸入，輸入exit退出，輸出此內容
		String msg = "";
		try {
			while (!msg.equals("exit")) {
				msg = br.readLine(); // 循環讀取
				bw.write(msg);// 循環輸出
				bw.newLine();
				bw.flush();//強制輸出
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
