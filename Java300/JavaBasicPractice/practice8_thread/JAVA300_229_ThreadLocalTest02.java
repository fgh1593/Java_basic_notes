package practice8_thread;

//ThreadLocal 每個線程存取自己的數據，更改不會影響其他線程
//所以結果  每個人都能得到1 剩下0   因為彼此數據不相關
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
			System.out.println(Thread.currentThread().getName() + "得到了----" + a);
			threadLocal.set(a-1);
			System.out.println(Thread.currentThread().getName() + "還剩下----" + threadLocal.get());
			
		}

	}

}
