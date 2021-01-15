package IO_Study06;
import java.io.BufferedInputStream;
/*����y(�ǦC��):

 * 
 * �˹���
 * ObjectOutputStream
 * ObjectInputStream
 * 
 *  1.�g�X��Ū��
 *  2.Ū�����ǻP�g�X�O���@�P
 *  3.���O�Ҧ���H���i�H�ǦC�ơA�����~�ӱ��fSerializable
 *  4.�i�H�ϥ� �ƾڬy DataOutputStream DataInputStream ���\��
 *  5.����y�P�ƾڬy�̤j���ϧO�b��A�ƾڬy�u��B�z�򥻼ƾ������A����y�i�H�B�z����ǦC�ƪ�Class
 */
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;
import IO_Study06.����y;

public class ����y_�H�ɮקΦ��sŪ�� {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//�g�X
		
		ObjectOutputStream oos=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("obj.ser")));
		//�ާ@�ƾ�����+�ƾ�
		//�N����Φ�������ন�줸��
		oos.writeUTF("�ʴ˦n�n��");
		oos.writeInt(18);
		oos.writeBoolean(true);
		oos.writeChar('x');
		
		//�N����ǦC��(�N����V�W�૬�]�˦�Object)
		
		oos.writeObject("�r�k�߾�K");
		oos.writeObject(new Date());
		Islander pinkorangutan =new Islander("���|",200);
		oos.writeObject(pinkorangutan);
		oos.flush();
		//�D�줸�շ�(ByteArrayOutputStream)�A�n�O��close����귽
		//�o�̤��ΰ�try catch�]���w�gthrow�X�h�F
		oos.close();
		//�ϧǦC���ɮ�
		ObjectInputStream ois=new ObjectInputStream(new BufferedInputStream(new FileInputStream("obj.ser")));
		//���ǻP�g�X�@�P
		String msg=ois.readUTF();
		int age=ois.readInt();
		boolean x=ois.readBoolean();
		char a=ois.readChar();
		System.out.println(msg);
		//�n���Ӽg�X����Ū��
		//�N�ǦC�Ƹ��Ū�JObject�e����
		Object str=ois.readObject();
		Object date=ois.readObject();
		Object islander=ois.readObject();
		//�ϧǦC��
		if(str instanceof String) {
			//�V�U�૬��String
			String s=(String) str;
			System.out.println(s);
		}
		if(date instanceof Date) {
			//�V�U�૬��Date
			Date d=(Date) date;
			System.out.println(d);
		}
		if(islander instanceof Islander) {
			//�V�U�૬��String
			Islander i=(Islander) islander;
			System.out.println(i.getName());
			System.out.println(i.getSalary());
		}
		ois.close();
		
		
	
		
		
	}
	
		
		
	}
