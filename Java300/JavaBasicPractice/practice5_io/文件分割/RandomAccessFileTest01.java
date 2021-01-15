package practice5_io.文件分割;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest01 {

	public static void main(String[] args) throws IOException {
		File src=new File("IO_study/IO_Study06/物件流_以檔案形式存讀取.java");
		//區塊大小
		int blockSize=1027;
		//檔案總大小
		long len=src.length();
		//分幾塊
		int amount = (int) Math.ceil((len/(long)blockSize));
		//起始位置
		int beginPos=0;
		
		for(int i=0;i<amount;i++) {
			beginPos=i*1027;
			if(i==amount-1) {//最後一塊
				separate(src,beginPos,(int)len);
			}else {
				separate(src,beginPos,blockSize);
				len-=blockSize;	
			}
			
		}
		
		
		
	}

	
	
	
	
	
	
	
	public static void separate(File f,int bp,int bs) throws IOException {
		RandomAccessFile raf = new RandomAccessFile(f, "r");
		// 起始位置
		int beginPos = bp;
		// 區塊大小
		int blockSize =bs;

		// 隨機讀取
		raf.seek(beginPos);// 從第三個位元組讀取
		// 讀取
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

	//分塊概念:起始，區塊大小
	public void test02() throws IOException {
		RandomAccessFile raf = new RandomAccessFile(new File("IO_study/IO_Study06/物件流_以檔案形式存讀取.java"), "r");
		// 起始位置
		int beginPos = 0;
		// 區塊大小
		int blockSize = 0;

		// 隨機讀取
		raf.seek(beginPos);// 從第三個位元組讀取
		// 讀取
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

//指定起始位置，讀取剩餘內容
	public void test01() throws IOException {
		RandomAccessFile raf = new RandomAccessFile(new File("IO_study/IO_Study06/物件流_以檔案形式存讀取.java"), "r");
		// 隨機讀取
		raf.seek(2);// 從第三個位元組讀取
		// 讀取
		byte[] flush = new byte[1024];
		int len = -1;
		while ((len = raf.read(flush)) != -1) {
			System.out.println(new String(flush, 0, len));
		}

		raf.close();
	}
}
