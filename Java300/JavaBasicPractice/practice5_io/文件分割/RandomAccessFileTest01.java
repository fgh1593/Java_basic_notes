package practice5_io.������;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest01 {

	public static void main(String[] args) throws IOException {
		File src=new File("IO_study/IO_Study06/����y_�H�ɮקΦ��sŪ��.java");
		//�϶��j�p
		int blockSize=1027;
		//�ɮ��`�j�p
		long len=src.length();
		//���X��
		int amount = (int) Math.ceil((len/(long)blockSize));
		//�_�l��m
		int beginPos=0;
		
		for(int i=0;i<amount;i++) {
			beginPos=i*1027;
			if(i==amount-1) {//�̫�@��
				separate(src,beginPos,(int)len);
			}else {
				separate(src,beginPos,blockSize);
				len-=blockSize;	
			}
			
		}
		
		
		
	}

	
	
	
	
	
	
	
	public static void separate(File f,int bp,int bs) throws IOException {
		RandomAccessFile raf = new RandomAccessFile(f, "r");
		// �_�l��m
		int beginPos = bp;
		// �϶��j�p
		int blockSize =bs;

		// �H��Ū��
		raf.seek(beginPos);// �q�ĤT�Ӧ줸��Ū��
		// Ū��
		byte[] flush = new byte[1024];
		int len = -1;
		while ((len = raf.read(flush)) != -1) {
			if (len < blockSize) {
				System.out.println(new String(flush, 0, len));
				blockSize -= len;
			} else {
				System.out.println(new String(flush, 0, blockSize));
				break;
			}
		}

		raf.close();
	}

	//��������:�_�l�A�϶��j�p
	public void test02() throws IOException {
		RandomAccessFile raf = new RandomAccessFile(new File("IO_study/IO_Study06/����y_�H�ɮקΦ��sŪ��.java"), "r");
		// �_�l��m
		int beginPos = 0;
		// �϶��j�p
		int blockSize = 0;

		// �H��Ū��
		raf.seek(beginPos);// �q�ĤT�Ӧ줸��Ū��
		// Ū��
		byte[] flush = new byte[1024];
		int len = -1;
		while ((len = raf.read(flush)) != -1) {
			if (len < blockSize) {
				System.out.println(new String(flush, 0, len));
				blockSize -= len;
			} else {
				System.out.println(new String(flush, 0, blockSize));
				break;
			}
		}

		raf.close();
	}

//���w�_�l��m�AŪ���Ѿl���e
	public void test01() throws IOException {
		RandomAccessFile raf = new RandomAccessFile(new File("IO_study/IO_Study06/����y_�H�ɮקΦ��sŪ��.java"), "r");
		// �H��Ū��
		raf.seek(2);// �q�ĤT�Ӧ줸��Ū��
		// Ū��
		byte[] flush = new byte[1024];
		int len = -1;
		while ((len = raf.read(flush)) != -1) {
			System.out.println(new String(flush, 0, len));
		}

		raf.close();
	}
}
