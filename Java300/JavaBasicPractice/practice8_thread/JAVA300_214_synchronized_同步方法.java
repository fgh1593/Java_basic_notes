package practice8_thread;
//�u�{�w��:�b�ֵo�ɫO�ҼƾڷǽT�ʡA�åB�������Ĳv
//synchronize:   1.�P�B��k   2.�P�B��
public class JAVA300_214_synchronized_�P�B��k  implements Runnable{
	private boolean flag=true;
	private int ticketnum=1000;
	
	public synchronized void test() {
		if(ticketnum ==0) {
			System.out.println("�w���ƽ�X");
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
		//Thread.currentThread����e�u�{
	}
	
	@Override
	public void run() {
		while(flag) {
			test();
			
		}
				
	}
	public static void main(String[] args) {
		//�@���귽
		JAVA300_214_synchronized_�P�B��k web=new JAVA300_214_synchronized_�P�B��k();
		//�h�ӥN�z
		//""���i���u�{���W�l
		new Thread(web,"A�P��").start();
		new Thread(web,"B�P��").start();
		new Thread(web,"C�P��").start();
	}
	
}
