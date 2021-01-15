package practice8_thread;
//yield 禮讓線程、暫停線程 直接進入就緒狀態、而不是阻塞狀態，因此會馬上再次和其他線程競爭資源
public class JAVA300_206_多線程_禮讓 {
	public static void main(String[] args) {
		new Thread(()-> {
			for(int i=0;i<100;i++) {
				System.out.println("lambda..."+i);
			}
	}).start();
		
		for(int i=0;i<100;i++) {
			if(i%20==0) {
				Thread.yield();//main線程禮讓，因為寫在main裡
			}
			System.out.println("main"+i);
		}
}
}
