package 線程;

public class JAVA300_207_多線程_插隊 {
	public static void main(String[] args) throws InterruptedException {
		Thread t=new Thread(()-> {
			for(int i=0;i<100;i++) {
				System.out.println("lambda..."+i);
			}
	});
		t.start();
		
		for(int i=0;i<100;i++) {
			if(i==20) {
				t.join();//插隊，t阻塞了main線程，因為寫在main內
			}
			System.out.println("main"+i);
		}
}
}
