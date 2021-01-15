package practice8_thread;

import java.util.ArrayList;
import java.util.List;

public class JAVA300_215_synchronized_同步塊2 {
	public static void main(String[] args) throws InterruptedException {
		List<String> L=new ArrayList<String>();
		new Thread(()->{
			for(int i=1;i<=10000;i++) {
				//主要鎖住List的寫入功能，使其線程安全
				synchronized(L) {
				L.add(Thread.currentThread().getName());
				}
			}
		}).start();
		Thread.sleep(100);
		System.out.println(L.size());
	}
}
