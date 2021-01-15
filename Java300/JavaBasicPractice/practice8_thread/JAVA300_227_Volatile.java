package practice8_thread;
//volatile 可以及時同步數據
//並且可以防止數據重排
public class JAVA300_227_Volatile {
	private volatile static int num=0;
	public static void main(String[] args) throws InterruptedException {
		new Thread(()->{ 
			while(num==0) { //故意不編入代碼 讓系統忙碌
				
			}
		}).start();
		
		Thread.sleep(1000);
		num=1;
	}
}
