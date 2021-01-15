package practice8_thread;

//����:�L�h���P�B�i��y���ۤ�������귽
//�q�Ӥ��۵��ݡA�@��o�ͩ�P�B�������h�ӹ�H����
//�ѨM���ꪺ��k�N�O���n�N��g�b�t�@�����
public class JAVA300_220_����deadlock {
	public static void main(String[] args) {
		Makeup A = new Makeup(0, "A");
		Makeup B = new Makeup(1, "B");
		A.start();
		B.start();
	}

}

//�f��
class Lipstick {

}

//��l
class Mirror {

}

//�Ƨ�
class Makeup extends Thread {
	// ���
	static Lipstick lipstick = new Lipstick();
	static Mirror mirror = new Mirror();

	int choice;
	String girl;

	public Makeup(int choice, String girl) {
		super();
		this.choice = choice;
		this.girl = girl;
	}

	public void run() {
		try {
			makeup();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// �ۤ�������誺��A�i��y������
	private void makeup() throws InterruptedException {
		if (choice == 0) {
			synchronized (lipstick) {// ��o�f������
				System.out.println(this.girl + "��o�f��");
				// �@������Q��o��l����
				Thread.sleep(1000);
//--------------------���~��m
//				synchronized (mirror) {
//					System.out.println(this.girl + "����l");
//				}
//--------------------���~��m
			}
			//�ѨM���ꪺ��k�N�O���n�N��g�b�t�@�����
			synchronized (mirror) {
				System.out.println(this.girl + "����l");
			}
		} else {
			synchronized (mirror) {
				System.out.println(this.girl + "����l");
				Thread.sleep(2000);
//				synchronized (lipstick) {
//					System.out.println(this.girl + "��o�f��");
//				}
			}
			synchronized (lipstick) {
				System.out.println(this.girl + "��o�f��");
			}
		}
	}
}