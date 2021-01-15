package practice8_thread;

//Lambda�ȯ�ϥΩ� �Ⱦ֦��@�Ӥ�k�����f�Τ���
public class JAVA300_202_LambdaThread���� {
	// �Ĥ@���A:�~����
	// �ĤG���A:�R�A������
	static class Test02 implements Runnable {
		public void run() {
			System.out.println("�Q���p�ĤG��");
		}
	}

	public static void main(String[] args) {
		// �Ĥ@���A����
		Test01 test01 = new Test01();
		new Thread(test01).start();
		// �ĤG���A����
		new Thread(new Test02()).start();
		// �ĤT���A:����������
		class Test03 implements Runnable {
			public void run() {
				System.out.println("�Q���p�ĤT��");
			}
		}
		// �ĤT���A����
		new Thread(new Test03()).start();

		// �ĥ|���A:�ΦW�������A�ݭn�ɧU���f�P�����A���ݭn�ͦ��N�z�P���骺��H
		// �A�X�ȨϥΤ@�����N�X
		// �ĥ|���A����
		new Thread(new Runnable() {
			public void run() {
				System.out.println("�Q���p�ĥ|��");
			}
		}).start();

		// �Ĥ����A:lambda²�� jdk8�H�W�ϥ�
		
		//�ٲ��ĥ|���A�����f�M�䤺��k
		new Thread(// new Runnable() {
				// public void run
				() -> {
					System.out.println("�Q���p�Ĥ���");
				}).start();
		
		
		new Thread(() -> {
			System.out.println("�Q���p�Ĥ���");
		}).start();
	}
}
