package IO_Study06;

import java.io.BufferedOutputStream;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class 打印流PrintStream {
public static void main(String[] args) throws FileNotFoundException {
	//打印流 system.out 在編譯系統上
	PrintStream ps=System.out;
	ps.println("打印流");
	ps.println(true);
	
	//打印到檔案上
	ps=new PrintStream(new BufferedOutputStream(new FileOutputStream("print.txt")),true);
	//加上true 自動flush
	ps.println("動森好好玩");

	
	//重定向輸出端，將System.out.println輸出到文件
	System.setOut(ps);//()內放 PrintStream物件
	System.out.println("我愛抓狼蛛");
	
	ps.close();
	
	//重定向回編譯器系統
	PrintStream pss=new PrintStream(new BufferedOutputStream(new FileOutputStream(FileDescriptor.out)),true);
	System.setOut(pss);
	System.out.println("我回來了");
	
	
	
	
}
}
