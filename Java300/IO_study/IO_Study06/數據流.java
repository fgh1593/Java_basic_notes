package IO_Study06;
import java.io.BufferedInputStream;
/*�ƾڬy�˹���:
 * �N���󫬺A���ƾ��ഫ��Byte[]; �pString�� .toByteArray
 * �A�NByte[]�ഫ�����N�ƾګ��A
 * 
 * �˹���
 * DataOutputStream
 * DataInputStream
 * 
 *  1.�g�X��Ū��
 *  2.Ū�����ǻP�g�X�O���@�P
 */
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class �ƾڬy {
	public static void main(String[] args) throws IOException {
		//�g�X
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		DataOutputStream dos=new DataOutputStream(new BufferedOutputStream(baos));
		//�ާ@�ƾ�����+�ƾ�
		//�N����Φ�������ন�줸��
		dos.writeUTF("�ʴ˦n�n��");
		dos.writeInt(18);
		dos.writeBoolean(true);
		dos.writeChar('x');
		dos.flush();
		byte[] datas=baos.toByteArray();
		//Ū��
		DataInputStream dis=new DataInputStream(new BufferedInputStream(new ByteArrayInputStream(datas)));
		//���ǻP�g�X�@�P
		String msg=dis.readUTF();
		int age=dis.readInt();
		boolean x=dis.readBoolean();
		char a=dis.readChar();
		System.out.println(msg);
	}
}
