package �u�{;
//�a�Ѽ�Lambda
public class JAVA300_202_LambdaTest02 {
	public static void main(String[] args) {
		Like2 love=(int a)->{
			System.out.println("�R�p"+a+"�~");
		};
		love.like(10000);
	}
	
	
}

interface Like2 {
	public void like(int a);
}