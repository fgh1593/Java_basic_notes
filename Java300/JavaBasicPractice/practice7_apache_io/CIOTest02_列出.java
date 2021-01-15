package practice7_apache_io;

import java.io.File;
import java.util.Collection;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.commons.io.filefilter.EmptyFileFilter;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.io.filefilter.SuffixFileFilter;

public class CIOTest02_�C�X {
public static void main(String[] args) {
	//���@�Ӷ��X�AFileUtils.listFiles(���|,�ɮ׹L�o��,��Ƨ��L�o��)
	Collection <File> files=FileUtils.listFiles(new File("D:/eclipse-workspace/Java300/IO_study/IO_Study"),
			EmptyFileFilter.NOT_EMPTY , DirectoryFileFilter.INSTANCE);
	//�ɮ׹L�o�� ��EmptyFileFilter.NOT_EMPTY �h�ťդ�󤣳Q�C�J
	//��Ƨ��L�o�� ��null�u�C�X�@�h
	//��Ƨ��L�o�� ��DirectoryFileFilter.INSTANCE �C�X�Ҧ��h
	for (File file : files) {
		System.out.println(file.getAbsolutePath());
	}
	
	System.out.println("--------------------------");
	Collection <File> files2=FileUtils.listFiles(new File("D:/eclipse-workspace/Java300/IO_study"),
			FileFilterUtils.or(new SuffixFileFilter("java"),EmptyFileFilter.NOT_EMPTY) , DirectoryFileFilter.INSTANCE);
	//�ɮ׹L�o�� ��		new SuffixFileFilter("java")  �Y�i �L�o�X.java���
	//FileFilterUtils.or �i�H�ϥΦh�ر���L�o
	//FileFilterUtils.and �i�H�C�X�P�ɨ�ƨ�̪����
	for (File file : files2) {
		System.out.println(file.getAbsolutePath());
	}
}
}
