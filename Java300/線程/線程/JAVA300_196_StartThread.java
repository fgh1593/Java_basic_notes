package �u�{;

//1.�Ы�Thread+���grun
public class JAVA300_196_StartThread extends Thread {
	
	//�u�{���J�f�I
	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println("���q��");
		}
	}
	
	public static void main(String[] args) {
		//�Ыؤl����H
		JAVA300_196_StartThread st=new JAVA300_196_StartThread();
		//�Ұʽu�{
		st.start();//�u�{���O�ҥߨ�B��A�N��CPU���t�귽�B��C
		
		// st.run()�N��½եΤ�k �A�S���u�{�ĪG
		
		for(int i=0;i<20;i++) {
			System.out.println("Ū��");
		}
	}
}
