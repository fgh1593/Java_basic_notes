package practice8_thread;
//線程安全:在併發時保證數據準確性，並且維持高效率
//synchronize:   1.同步方法   2.同步塊
public class JAVA300_214_synchronized_同步方法  implements Runnable{
	private boolean flag=true;
	private int ticketnum=1000;
	
	public synchronized void test() {
		if(ticketnum ==0) {
			System.out.println("已全數賣出");
			flag=false;
			return;
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+ticketnum--);
		//Thread.currentThread為當前線程
	}
	
	@Override
	public void run() {
		while(flag) {
			test();
			
		}
				
	}
	public static void main(String[] args) {
		//一份資源
		JAVA300_214_synchronized_同步方法 web=new JAVA300_214_synchronized_同步方法();
		//多個代理
		//""內可為線程取名子
		new Thread(web,"A同學").start();
		new Thread(web,"B同學").start();
		new Thread(web,"C同學").start();
	}
	
}
