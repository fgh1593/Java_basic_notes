package practice8_thread;

public class JAVA300_202_LambdaTest01 {

	public static void main(String[] args) {
		Like like ;
		like=()->{
			System.out.println("I love you Guanjen");
		};
		like.love();
	}
}




interface Like {
	public void love();
}

