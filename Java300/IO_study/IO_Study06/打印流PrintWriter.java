package IO_Study06;

import java.io.BufferedOutputStream;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class ���L�yPrintWriter {
@SuppressWarnings("resource")
public static void main(String[] args) throws FileNotFoundException {
	
	PrintWriter pw;
	
	
	//���L���ɮפW
	pw=new PrintWriter(new BufferedOutputStream(new FileOutputStream("print.txt")),true);
	//�[�Wtrue �۰�flush
	pw.println("�ʴ˦n�n��");
	pw.close();
	
	

	
	
	
	
	
}
}
