package IO_Study04_�w�Ĭy;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class �r��w�Ŀ�X�y {
	public static void main(String[] args) throws IOException {
		File dest=new File("aaa");
		BufferedWriter w=null;
		w=new BufferedWriter(new FileWriter(dest));
		
		String str=new String("�ڷR�ǲ�");

		w.append("�ڷR�ǲ�");
		w.newLine(); //BufferedWriter �\��A����
		w.newLine(); 
		w.append("�ګܻ{�u");
		w.flush();
		
		if(w!=null) {
			w.close();
		}
	}
}
