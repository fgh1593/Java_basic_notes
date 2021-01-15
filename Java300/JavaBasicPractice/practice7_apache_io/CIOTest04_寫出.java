
package practice7_apache_io;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class CIOTest04_�g�X {
	public static void main(String[] args) throws IOException {
		FileUtils.write(new File("CIOTest.txt"), "�ʴˤӦn���F\n","MS950");
		FileUtils.writeStringToFile(new File("CIOTest.txt"), "�`�ڤ�Ū��\n","MS950",true);
		//true ���O�_����
		FileUtils.writeByteArrayToFile(new File("CIOTest.txt"), "�n�дo��\n".getBytes("MS950"), true);
		
		//�g�X�C��
		List<String> datas=new ArrayList<String>();
		datas.add("�ʪ��ˤͷ|");
		datas.add("FF7");
		datas.add("��Ĭ");
		
		FileUtils.writeLines(new File("CIOTest.txt"), datas, ".@.",true);
		
		//".@."���C���ƾڥy���[�J�����j�Ÿ�
	}
}
