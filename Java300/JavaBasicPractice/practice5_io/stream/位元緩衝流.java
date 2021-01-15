package practice5_io.stream;
/*
 * 在選擇流時，加入 new BufferedOutputStream(流) 等裝飾器運用
 * 能大幅提高效率
 */

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class 位元緩衝流 {
	public static void main(String[] args) {
		綜合流複製圖片 X=new 綜合流複製圖片();
		File A=new File("D:/eclipse-workspace/Java300/加油.jpg");
		byte[] flush=X.toByteArray(A);
		X.toImage(flush);
		
	}
	
	public byte[] toByteArray(File img) {
		
		BufferedInputStream is =null;
		ByteArrayOutputStream baos=null;
		
		byte[] flush=new byte[1024*100];
		try {
			is=new BufferedInputStream(new FileInputStream(img));//加入Buffer裝飾器
			baos=new ByteArrayOutputStream();
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
		BufferedOutputStream os=null;
		int len=0;
		
		try {
			os=new BufferedOutputStream(new FileOutputStream(dest));//加入Buffer裝飾器
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
