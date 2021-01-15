package practice8_thread;

//InheritableThreadLocal �u�{�|�~��Main��k���W�U��  �����@�����l�u�{

public class JAVA300_229_ThreadLocalTest04_InheritableThreadLocal {
	private static ThreadLocal<Integer> threadLocal = new InheritableThreadLocal<Integer>();

	public static void main(String[] args) {
		threadLocal.set(0);
		System.out.println(Thread.currentThread().getName()+"-----"+threadLocal.get());
		//�Y���@��ThreadLocal�N�|�o��null
			new Thread(new MyThread()).start();
		
	}

	public static class MyThread implements Runnable {
		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName() + "�o��F----" +threadLocal.get() );
			
		}

	}

}
