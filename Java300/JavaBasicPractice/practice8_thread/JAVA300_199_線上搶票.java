package practice8_thread;

public class JAVA300_199_線上搶票  implements Runnable{
	
	private int ticketnum=100;
	@Override
	public void run() {
		while(true) {
			if(ticketnum ==0) {
				System.out.println("已全數賣出");
				break;
			}
			//Thread.currentThread為當前線程
			System.out.println(Thread.currentThread().getName()+ticketnum--);
		}
				
	}
	public static void main(String[] args) {
		//一份資源
		JAVA300_199_線上搶票 web=new JAVA300_199_線上搶票();
		//多個代理
		//""內可為線程取名子
		new Thread(web,"A同學").start();
		new Thread(web,"B同學").start();
		new Thread(web,"C同學").start();
	}
	
}
