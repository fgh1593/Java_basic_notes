package IO_Study06;
import java.io.BufferedInputStream;
/*物件流(序列化):

 * 
 * 裝飾類
 * ObjectOutputStream
 * ObjectInputStream
 * 
 *  1.寫出後讀取
 *  2.讀取順序與寫出保持一致
 *  3.不是所有對象都可以序列化，必須繼承接口Serializable
 *  4.可以使用 數據流 DataOutputStream DataInputStream 的功能
 *  5.物件流與數據流最大的區別在於，數據流只能處理基本數據類型，物件流可以處理任何序列化的Class
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
import IO_Study06.物件流;

public class 物件流_以檔案形式存讀取 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//寫出
		
		ObjectOutputStream oos=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("obj.ser")));
		//操作數據類型+數據
		//將任何形式的資料轉成位元組
		oos.writeUTF("動森好好玩");
		oos.writeInt(18);
		oos.writeBoolean(true);
		oos.writeChar('x');
		
		//將物件序列化(將物件向上轉型包裝成Object)
		
		oos.writeObject("猛男撿樹枝");
		oos.writeObject(new Date());
		Islander pinkorangutan =new Islander("阿四",200);
		oos.writeObject(pinkorangutan);
		oos.flush();
		//非位元組源(ByteArrayOutputStream)，要記的close釋放資源
		//這裡不用做try catch因為已經throw出去了
		oos.close();
		//反序列化檔案
		ObjectInputStream ois=new ObjectInputStream(new BufferedInputStream(new FileInputStream("obj.ser")));
		//順序與寫出一致
		String msg=ois.readUTF();
		int age=ois.readInt();
		boolean x=ois.readBoolean();
		char a=ois.readChar();
		System.out.println(msg);
		//要按照寫出順序讀取
		//將序列化資料讀入Object容器中
		Object str=ois.readObject();
		Object date=ois.readObject();
		Object islander=ois.readObject();
		//反序列化
		if(str instanceof String) {
			//向下轉型成String
			String s=(String) str;
			System.out.println(s);
		}
		if(date instanceof Date) {
			//向下轉型成Date
			Date d=(Date) date;
			System.out.println(d);
		}
		if(islander instanceof Islander) {
			//向下轉型成String
			Islander i=(Islander) islander;
			System.out.println(i.getName());
			System.out.println(i.getSalary());
		}
		ois.close();
		
		
	
		
		
	}
	
		
		
	}
