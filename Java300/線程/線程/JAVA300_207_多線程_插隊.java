package �u�{;

public class JAVA300_207_�h�u�{_���� {
	public static void main(String[] args) throws InterruptedException {
		Thread t=new Thread(()-> {
			for(int i=0;i<100;i++) {
				System.out.println("lambda..."+i);
			}
	});
		t.start();
		
		for(int i=0;i<100;i++) {
			if(i==20) {
				t.join();//�����At����Fmain�u�{�A�]���g�bmain��
			}
			System.out.println("main"+i);
		}
}
}
