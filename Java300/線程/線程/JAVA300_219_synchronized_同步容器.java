package �u�{;
//�۱a�ꪺ�e�� CopyOnWriteArrayList
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class JAVA300_219_synchronized_�P�B�e�� {
	public static void main(String[] args) throws InterruptedException {
		CopyOnWriteArrayList<String> L=new CopyOnWriteArrayList<String>();
		new Thread(()->{
			for(int i=1;i<=10000;i++) {
				L.add(Thread.currentThread().getName());
			}
		}).start();
		Thread.sleep(100);
		System.out.println(L.size());
	}
}
