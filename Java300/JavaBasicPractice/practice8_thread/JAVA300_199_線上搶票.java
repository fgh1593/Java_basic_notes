package practice8_thread;

public class JAVA300_199_�u�W�m��  implements Runnable{
	
	private int ticketnum=100;
	@Override
	public void run() {
		while(true) {
			if(ticketnum ==0) {
				System.out.println("�w���ƽ�X");
				break;
			}
			//Thread.currentThread����e�u�{
			System.out.println(Thread.currentThread().getName()+ticketnum--);
		}
				
	}
	public static void main(String[] args) {
		//�@���귽
		JAVA300_199_�u�W�m�� web=new JAVA300_199_�u�W�m��();
		//�h�ӥN�z
		//""���i���u�{���W�l
		new Thread(web,"A�P��").start();
		new Thread(web,"B�P��").start();
		new Thread(web,"C�P��").start();
	}
	
}
