package IO_Study02;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class IOTest�r���X�y {
	public static void main(String[] args) throws IOException {
		File dest=new File("aaa");
		Writer w=null;
		
		w=new FileWriter(dest);
		
		String str=new String("�ڷR�ǲ�");
		//��k�@
//		char[] datas=str.toCharArray();
//		w.write(datas,0,datas.length);
//		w.flush();
		
		//��k�G
//		w.write(str, 0, str.length());
//		w.flush();
		
		//��k�T    .apend�@��.�i�H�@���[�U�h �����K
		w.append("�ڷR�ǲ�\n").append("�ګܻ{�u");
		w.flush();
		
		if(w!=null) {
			w.close();
		}
		
		
		
		
	}
}
