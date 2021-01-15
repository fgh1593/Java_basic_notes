package practice5_io.文件分割;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Vector;

public class Merge_SequenceInputStream {
	public static void main(String[] args) throws IOException {
		File dirpath = new File("D:/eclipse-workspace/Java300/分離檔案資料夾");
		File dest = new File("MergeFile.jpg");
		Vector<InputStream> vi = new Vector<InputStream>();
		SequenceInputStream sis;
		BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream(dest, true));

		File[] datas = dirpath.listFiles();

		for (int i = 0; i < datas.length; i++) {

			vi.add(new BufferedInputStream(new FileInputStream(datas[i])));

		}
		sis=new SequenceInputStream(vi.elements());
		
		byte[] flush = new byte[1024 * 10];
		int len = -1;
		while ((len = sis.read(flush)) != -1) {
			os.write(flush, 0, len);

		}
		os.flush();
		sis.close();
		os.close();
	}

}
