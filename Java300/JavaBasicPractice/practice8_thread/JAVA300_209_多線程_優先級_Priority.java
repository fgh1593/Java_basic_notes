package practice8_thread;

// .getPriority 獲得線程的優先程度，分為1~10級，5為默認
//Thread.MAX_PRIORITY為10   Thread.MIN_PRIORITY為1
//級數越高，越容易獲得調度，但並非絕對
public class JAVA300_209_多線程_優先級_Priority {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());
		// Main線程為5
		Priority P1=new Priority();
		Thread T1=new Thread(P1,"A");
		Thread T2=new Thread(P1,"B");
		Thread T3=new Thread(P1,"C");
		Thread T4=new Thread(P1,"D");
		Thread T5=new Thread(P1,"E");
		Thread T6=new Thread(P1,"F");
		
		//設置優先級在啟動之前
		T1.setPriority(Thread.MAX_PRIORITY);
		T2.setPriority(Thread.MAX_PRIORITY);
		T3.setPriority(Thread.MAX_PRIORITY);
		T4.setPriority(3);
		T5.setPriority(6);
		T6.setPriority(Thread.MIN_PRIORITY);
		
		
		
		T1.start();
		T2.start();
		T3.start();
		T4.start();
		T5.start();
		T6.start();
	}
}

class Priority implements Runnable{

	public void run() {
		System.out.println(Thread.currentThread().getName()+"-"+Thread.currentThread().getPriority());
	}
	
}