package �u�{;

public class JAVA300_230_�i���J��   {
	public void test() {
		// �Ĥ@����o��
		synchronized (this) {
			while (true) {
				//�ĤG����o��					
				synchronized (this) {
					System.out.println("ReentrantLock!");
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new JAVA300_230_�i���J��().test();
	}
}