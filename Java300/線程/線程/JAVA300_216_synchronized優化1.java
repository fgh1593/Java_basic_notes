package �u�{;
//�u�{�w��:�b�ֵo�ɫO�ҼƾڷǽT�ʡA�åB�������Ĳv
//synchronize:   1.�P�B��k   2.�P�B��
public class JAVA300_216_synchronized�u��1  implements Runnable{
	private boolean flag=true;
	private int ticketnum=10;
	//���i�H�u�� (Integer) ticketnum �]���L�O�@�ӷ|�ܰʪ�����
	//�P�B���u��Φb��@���� synchronize(x) x����O�|���ܪ����� �p (Integer) ticketnum 
	//�ɥi����w�X�z���ƾڽd��
	public  void test() {
		
		//�Ҽ{�S���������A�A�N�����A�[���C�Ĳv
		if(ticketnum <=0) {
			System.out.println("�w���ƽ�X");
			flag=false;
			return;
		}
		
		
		synchronized(this){
		//�Ҽ{�ѤU�̫�@�i�������p
		if(ticketnum <=0) {
			System.out.println("�w���ƽ�X");
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
		JAVA300_216_synchronized�u��1 web=new JAVA300_216_synchronized�u��1();
		new Thread(web,"A�P��").start();
		new Thread(web,"B�P��").start();
		new Thread(web,"C�P��").start();
	}
	
}
