package practice8_thread;
//yield §���u�{�B�Ȱ��u�{ �����i�J�N�����A�B�Ӥ��O���몬�A�A�]���|���W�A���M��L�u�{�v���귽
public class JAVA300_206_�h�u�{_§�� {
	public static void main(String[] args) {
		new Thread(()-> {
			for(int i=0;i<100;i++) {
				System.out.println("lambda..."+i);
			}
	}).start();
		
		for(int i=0;i<100;i++) {
			if(i%20==0) {
				Thread.yield();//main�u�{§���A�]���g�bmain��
			}
			System.out.println("main"+i);
		}
}
}
