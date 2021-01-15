package �u�{;

//ThreadLocal ���X�h�ӽu�{���j�Ŷ��A�C�ӽu�{�֦��ۤv���p�Ŷ�
//get/set/initial/value
public class JAVA300_229_ThreadLocalTest01 {
//	private static ThreadLocal<Integer> threadLocal=new ThreadLocal<>();
	// ��l�� ����Ϥƪ��� �Ȭ�NULL
	private static ThreadLocal<Integer> threadLocal = ThreadLocal.withInitial(() -> {
		return 200;
	});

	public static void main(String[] args) {
		// �����
		System.out.println(Thread.currentThread().getName() + "----" + threadLocal.get());
		// �]�m
		threadLocal.set(99);
		System.out.println(Thread.currentThread().getName() + "----" + threadLocal.get());

		new Thread(new MyThread()).start();
		new Thread(new MyThread()).start();
	}

	public static class MyThread implements Runnable {

		@Override
		public void run() {
			threadLocal.set((int) (Math.random()*100));
			System.out.println(Thread.currentThread().getName() + "----" + threadLocal.get());
		}

	}

}
