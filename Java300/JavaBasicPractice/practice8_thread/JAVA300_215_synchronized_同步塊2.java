package practice8_thread;

import java.util.ArrayList;
import java.util.List;

public class JAVA300_215_synchronized_�P�B��2 {
	public static void main(String[] args) throws InterruptedException {
		List<String> L=new ArrayList<String>();
		new Thread(()->{
			for(int i=1;i<=10000;i++) {
				//�D�n���List���g�J�\��A�Ϩ�u�{�w��
				synchronized(L) {
				L.add(Thread.currentThread().getName());
				}
			}
		}).start();
		Thread.sleep(100);
		System.out.println(L.size());
	}
}
