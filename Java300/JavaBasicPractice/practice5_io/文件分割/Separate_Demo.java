package practice5_io.������;

import java.io.File;
import java.io.IOException;

public class Separate_Demo {
	public static void main(String[] args) throws IOException {
		File f=new File("�[�o.jpg");
		String dirPath="�����ɮ׸�Ƨ�";
		Separate s=new Separate(f,1024*10,dirPath);
	}
}
