package �u�{;

public class JAVA300_198_��{Runnable implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println("���q��");
		}
	}
	
	public static void main(String[] args) {
//		//�Ыع�{����H
//		JAVA300_198_��{Runnable R=new JAVA300_198_��{Runnable();
//		//�ЫإN�z��H
//		Thread t=new Thread(R);
//		//�Ұʽu�{
//		t.start();//�u�{���O�ҥߨ�B��A�N��CPU���t�귽�B��C
		
		new Thread(new JAVA300_198_��{Runnable()).start();
		
		for(int i=0;i<20;i++) {
			System.out.println("Ū��");
		}
	}

}
