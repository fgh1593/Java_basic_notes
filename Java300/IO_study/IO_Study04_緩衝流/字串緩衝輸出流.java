package IO_Study04_緩衝流;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class 字串緩衝輸出流 {
	public static void main(String[] args) throws IOException {
		File dest=new File("aaa");
		BufferedWriter w=null;
		w=new BufferedWriter(new FileWriter(dest));
		
		String str=new String("我愛學習");

		w.append("我愛學習");
		w.newLine(); //BufferedWriter 功能，換行
		w.newLine(); 
		w.append("我很認真");
		w.flush();
		
		if(w!=null) {
			w.close();
		}
	}
}
