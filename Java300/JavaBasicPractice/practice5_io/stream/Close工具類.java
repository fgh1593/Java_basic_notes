package practice5_io.stream;

import java.io.Closeable;
import java.io.IOException;

public class Close�u���� {
	//�Q�� InputStream �P OutputStream��close()��k�@�P�ϥΪ����fClosable�@���Ѽ�
	//�ϥ�  XX ... xx ����k�F���ƶq���@�w���h�ѼƤ�k
	public static void close(Closeable ...ios) {  
		for (Closeable io : ios) {
			try {
				if(io!=null) {
				io.close();
				}
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}
}
