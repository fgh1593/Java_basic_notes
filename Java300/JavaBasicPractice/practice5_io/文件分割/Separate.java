package practice5_io.¤å¥ó¤À³Î;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Separate {
	private File src;
	private long blockSize;
	private String dirPath;

	public Separate(File src, long blockSize, String dirPath) throws IOException {
		super();
		this.src = src;
		this.blockSize = blockSize;
		this.dirPath = dirPath;
		initial(src, dirPath, blockSize);	
		}

	public static void separate(File f, String dest, long beginpos, long blockSize) throws IOException {
		RandomAccessFile raf = new RandomAccessFile(f, "r");
		RandomAccessFile rafw = new RandomAccessFile(dest, "rw");

		raf.seek(beginpos);
		int len = 0;
		byte[] flush = new byte[1024];
		while ((len = raf.read(flush)) != -1) {
			if (len < blockSize) {
				rafw.write(flush, 0, len);
				blockSize -=len;
			} else {
				rafw.write(flush, 0, (int)blockSize);
				break;
			}
		}

		raf.close();

	}
	
	public static void initial(File f,String dirPath, long blockSize) throws IOException {
		double len=f.length();
		int amount=(int) Math.ceil(len/(double) blockSize);
		for(int i=0;i<amount;i++) {
			long beginPos=i*blockSize;
			String a=String.format("%02d", i);
			String dest=dirPath+"/"+a+"-COPY.java";
			if(i==amount-1) {
				separate(f,dest,beginPos,(long) len);
			}else {
				separate(f, dest, beginPos, blockSize);
				len-=blockSize;
			}
		}
	}
	
	
}
