package 線程;

public class JAVA300_198_實現Runnable implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println("打電動");
		}
	}
	
	public static void main(String[] args) {
//		//創建實現類對象
//		JAVA300_198_實現Runnable R=new JAVA300_198_實現Runnable();
//		//創建代理對象
//		Thread t=new Thread(R);
//		//啟動線程
//		t.start();//線程不保證立刻運行，將由CPU分配資源運行。
		
		new Thread(new JAVA300_198_實現Runnable()).start();
		
		for(int i=0;i<20;i++) {
			System.out.println("讀書");
		}
	}

}
