package IO_Study02;
/*
 * �N�Ϥ��ഫ���줸�}�C
 * �A�N�줸�}�C�ഫ���Ϥ��ƻs�@��
 * FileInputStream-->Ū���Ϥ�-->ByteArrayOutputStream---->�s���줸��
 * ---->ByteArrayInputStream--->Ū���줸��----->FileOutputStream
 * ------>��X�Ϥ�
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ��X�y�ƻs�Ϥ� {
	
	public static void main(String[] args) {
		��X�y�ƻs�Ϥ� X=new ��X�y�ƻs�Ϥ�();
		File A=new File("D:/eclipse-workspace/Java300/�[�o.jpg");
		byte[] flush=X.toByteArray(A);
		X.toImage(flush);
		
	}
	
	public byte[] toByteArray(File img) {
		
		InputStream is =null;
		ByteArrayOutputStream baos=null;
		
		byte[] flush=new byte[1024*100];
		try {
			is=new FileInputStream(img);
			baos=new ByteArrayOutputStream();//�i�H���ζ�J�ت��a�A�۰ʦs�J���s
			int len =0;
			while((len=is.read(flush))!=-1) {
				baos.write(flush,0,flush.length);
				baos.flush();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(is!=null) {
				is.close();
				
				}
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		return flush;
	}
	
	public void toImage(byte[] flush) {
		File dest=new File("copy.jpg");
		
		ByteArrayInputStream bais=null;
		OutputStream os=null;
		int len=0;
		
		try {
			os=new FileOutputStream(dest);
			bais=new ByteArrayInputStream(flush);
			byte[] datas=new byte[1024*100];
			while((len=bais.read(datas))!=-1) {
				os.write(datas,0,len);
				os.flush();
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(os!=null) {
				os.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
