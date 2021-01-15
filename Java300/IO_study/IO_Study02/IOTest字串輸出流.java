package IO_Study02;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class IOTest字串輸出流 {
	public static void main(String[] args) throws IOException {
		File dest=new File("aaa");
		Writer w=null;
		
		w=new FileWriter(dest);
		
		String str=new String("我愛學習");
		//方法一
//		char[] datas=str.toCharArray();
//		w.write(datas,0,datas.length);
//		w.flush();
		
		//方法二
//		w.write(str, 0, str.length());
//		w.flush();
		
		//方法三    .apend一直.可以一直加下去 比較方便
		w.append("我愛學習\n").append("我很認真");
		w.flush();
		
		if(w!=null) {
			w.close();
		}
		
		
		
		
	}
}
