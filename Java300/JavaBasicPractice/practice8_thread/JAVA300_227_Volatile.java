package practice8_thread;
//volatile �i�H�ήɦP�B�ƾ�
//�åB�i�H����ƾڭ���
public class JAVA300_227_Volatile {
	private volatile static int num=0;
	public static void main(String[] args) throws InterruptedException {
		new Thread(()->{ 
			while(num==0) { //�G�N���s�J�N�X ���t�Φ��L
				
			}
		}).start();
		
		Thread.sleep(1000);
		num=1;
	}
}
