package IO_Study06;

import java.io.BufferedOutputStream;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class 打印流PrintWriter {
@SuppressWarnings("resource")
public static void main(String[] args) throws FileNotFoundException {
	
	PrintWriter pw;
	
	
	//打印到檔案上
	pw=new PrintWriter(new BufferedOutputStream(new FileOutputStream("print.txt")),true);
	//加上true 自動flush
	pw.println("動森好好玩");
	pw.close();
	
	

	
	
	
	
	
}
}
