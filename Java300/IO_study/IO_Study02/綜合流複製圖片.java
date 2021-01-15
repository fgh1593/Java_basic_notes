package IO_Study02;
/*
 * 將圖片轉換成位元陣列
 * 再將位元陣列轉換成圖片複製一份
 * FileInputStream-->讀取圖片-->ByteArrayOutputStream---->存成位元組
 * ---->ByteArrayInputStream--->讀取位元組----->FileOutputStream
 * ------>輸出圖片
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

public class 綜合流複製圖片 {
	
	public static void main(String[] args) {
		綜合流複製圖片 X=new 綜合流複製圖片();
		File A=new File("D:/eclipse-workspace/Java300/加油.jpg");
		byte[] flush=X.toByteArray(A);
		X.toImage(flush);
		
	}
	
	public byte[] toByteArray(File img) {
		
		InputStream is =null;
		ByteArrayOutputStream baos=null;
		
		byte[] flush=new byte[1024*100];
		try {
			is=new FileInputStream(img);
			baos=new ByteArrayOutputStream();//可以不用填入目的地，自動存入內存
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
