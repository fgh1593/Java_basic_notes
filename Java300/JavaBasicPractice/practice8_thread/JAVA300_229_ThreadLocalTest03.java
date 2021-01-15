package practice8_thread;

//ThreadLocal ���R�W�U��  �[������Ұ_�I
//�c�y��:�ֽեδN�ݩ��
//run��k:�ݩ󪫥�u�{�ۨ���
public class JAVA300_229_ThreadLocalTest03 {
	private static ThreadLocal<Integer> threadLocal = ThreadLocal.withInitial(() -> {
		return -100;
	});

	public static void main(String[] args) {
			new Thread(new MyThread()).start();
			new Thread(new MyThread()).start();
		
	}

	public static class MyThread implements Runnable {
		public MyThread() {
			System.out.println(Thread.currentThread().getName() +threadLocal.get());;
		}
		@Override
		public void run() {
			threadLocal.set(0);
			System.out.println(Thread.currentThread().getName() + "�o��F----" +threadLocal.get() );
			
		}

	}

}
