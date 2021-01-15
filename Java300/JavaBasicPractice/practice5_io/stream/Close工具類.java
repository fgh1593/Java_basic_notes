package practice5_io.stream;

import java.io.Closeable;
import java.io.IOException;

public class Closeㄣ摸 {
	//ノ InputStream 籔 OutputStreamclose()よ猭ㄏノ钡Closable把计
	//ㄏノ  XX ... xx よ猭笷Θ计秖ぃ﹚把计よ猭
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
