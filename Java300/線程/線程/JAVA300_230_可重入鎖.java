package 線程;

public class JAVA300_230_可重入鎖   {
	public void test() {
		// 第一次獲得鎖
		synchronized (this) {
			while (true) {
				//第二次獲得鎖					
				synchronized (this) {
					System.out.println("ReentrantLock!");
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new JAVA300_230_可重入鎖().test();
	}
}