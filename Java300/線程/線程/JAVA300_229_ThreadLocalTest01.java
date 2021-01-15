package 線程;

//ThreadLocal 集合多個線程的大空間，每個線程擁有自己的小空間
//get/set/initial/value
public class JAVA300_229_ThreadLocalTest01 {
//	private static ThreadLocal<Integer> threadLocal=new ThreadLocal<>();
	// 初始化 未初使化的話 值為NULL
	private static ThreadLocal<Integer> threadLocal = ThreadLocal.withInitial(() -> {
		return 200;
	});

	public static void main(String[] args) {
		// 獲取值
		System.out.println(Thread.currentThread().getName() + "----" + threadLocal.get());
		// 設置
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
