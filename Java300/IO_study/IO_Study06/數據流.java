package IO_Study06;
import java.io.BufferedInputStream;
/*數據流裝飾類:
 * 將任何型態的數據轉換為Byte[]; 如String的 .toByteArray
 * 再將Byte[]轉換成任意數據型態
 * 
 * 裝飾類
 * DataOutputStream
 * DataInputStream
 * 
 *  1.寫出後讀取
 *  2.讀取順序與寫出保持一致
 */
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class 數據流 {
	public static void main(String[] args) throws IOException {
		//寫出
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		DataOutputStream dos=new DataOutputStream(new BufferedOutputStream(baos));
		//操作數據類型+數據
		//將任何形式的資料轉成位元組
		dos.writeUTF("動森好好玩");
		dos.writeInt(18);
		dos.writeBoolean(true);
		dos.writeChar('x');
		dos.flush();
		byte[] datas=baos.toByteArray();
		//讀取
		DataInputStream dis=new DataInputStream(new BufferedInputStream(new ByteArrayInputStream(datas)));
		//順序與寫出一致
		String msg=dis.readUTF();
		int age=dis.readInt();
		boolean x=dis.readBoolean();
		char a=dis.readChar();
		System.out.println(msg);
	}
}
