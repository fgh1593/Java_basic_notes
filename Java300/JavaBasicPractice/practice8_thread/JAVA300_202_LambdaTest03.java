package practice8_thread;
//±aªğ¦^­ÈLambda
public class JAVA300_202_LambdaTest03 {
	public static void main(String[] args) {
		Sum sum=(int a,int b)->{
			return a+b;
		};
		Sum sum2=(a,b)->{
			return a+b;
		};
		
		System.out.println(sum.sum(5, 2));
	}
}

interface Sum{
	public int sum(int a,int b) ;
	
}