package practice8_thread;

// .getPriority ��o�u�{���u���{�סA����1~10�šA5���q�{
//Thread.MAX_PRIORITY��10   Thread.MIN_PRIORITY��1
//�żƶV���A�V�e����o�իסA���ëD����
public class JAVA300_209_�h�u�{_�u����_Priority {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());
		// Main�u�{��5
		Priority P1=new Priority();
		Thread T1=new Thread(P1,"A");
		Thread T2=new Thread(P1,"B");
		Thread T3=new Thread(P1,"C");
		Thread T4=new Thread(P1,"D");
		Thread T5=new Thread(P1,"E");
		Thread T6=new Thread(P1,"F");
		
		//�]�m�u���Ŧb�Ұʤ��e
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