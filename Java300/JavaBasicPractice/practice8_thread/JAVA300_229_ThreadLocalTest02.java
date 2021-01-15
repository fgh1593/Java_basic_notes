package practice8_thread;

//ThreadLocal �C�ӽu�{�s���ۤv���ƾڡA��藍�|�v�T��L�u�{
//�ҥH���G  �C�ӤH����o��1 �ѤU0   �]�������ƾڤ�����
public class JAVA300_229_ThreadLocalTest02 {
	private static ThreadLocal<Integer> threadLocal = ThreadLocal.withInitial(() -> {
		return 1;
	});

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			new Thread(new MyThread()).start();
		}
		
	}

	public static class MyThread implements Runnable {

		@Override
		public void run() {
			Integer a=threadLocal.get();
			System.out.println(Thread.currentThread().getName() + "�o��F----" + a);
			threadLocal.set(a-1);
			System.out.println(Thread.currentThread().getName() + "�ٳѤU----" + threadLocal.get());
			
		}

	}

}
