package IO_Study06;

import java.io.BufferedOutputStream;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class ���L�yPrintStream {
public static void main(String[] args) throws FileNotFoundException {
	//���L�y system.out �b�sĶ�t�ΤW
	PrintStream ps=System.out;
	ps.println("���L�y");
	ps.println(true);
	
	//���L���ɮפW
	ps=new PrintStream(new BufferedOutputStream(new FileOutputStream("print.txt")),true);
	//�[�Wtrue �۰�flush
	ps.println("�ʴ˦n�n��");

	
	//���w�V��X�ݡA�NSystem.out.println��X����
	System.setOut(ps);//()���� PrintStream����
	System.out.println("�ڷR��T��");
	
	ps.close();
	
	//���w�V�^�sĶ���t��
	PrintStream pss=new PrintStream(new BufferedOutputStream(new FileOutputStream(FileDescriptor.out)),true);
	System.setOut(pss);
	System.out.println("�ڦ^�ӤF");
	
	
	
	
}
}
