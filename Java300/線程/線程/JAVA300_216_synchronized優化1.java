package 線程;
//線程安全:在併發時保證數據準確性，並且維持高效率
//synchronize:   1.同步方法   2.同步塊
public class JAVA300_216_synchronized優化1  implements Runnable{
	private boolean flag=true;
	private int ticketnum=10;
	//不可以只鎖 (Integer) ticketnum 因為他是一個會變動的物件
	//同步塊只能用在單一物件 synchronize(x) x不能是會改變的物件 如 (Integer) ticketnum 
	//盡可能鎖定合理的數據範圍
	public  void test() {
		
		//考慮沒有票的狀態，就不必再加鎖拖慢效率
		if(ticketnum <=0) {
			System.out.println("已全數賣出");
			flag=false;
			return;
		}
		
		
		synchronized(this){
		//考慮剩下最後一張票的狀況
		if(ticketnum <=0) {
			System.out.println("已全數賣出");
			flag=false;
			return;
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+ticketnum--);
		}
	}
	
	@Override
	public void run() {
		while(flag) {
			test();
			
		}
				
	}
	public static void main(String[] args) {
		JAVA300_216_synchronized優化1 web=new JAVA300_216_synchronized優化1();
		new Thread(web,"A同學").start();
		new Thread(web,"B同學").start();
		new Thread(web,"C同學").start();
	}
	
}
