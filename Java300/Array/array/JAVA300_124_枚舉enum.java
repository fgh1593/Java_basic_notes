package array;

public class JAVA300_124_枚舉enum{
	public static void main(String[] args) {
		Season a=Season.SPRING;
		switch(a) {
		case SPRING:
			System.out.println("春天");
			break;
		case SUMMER:
			System.out.println("夏天");
			break;
		case AUTUMN:
			System.out.println("秋天");
			break;
		case WINTER:
			System.out.println("冬天");
			break;
		}
	}

}

enum Season{
	SPRING,SUMMER,AUTUMN,WINTER
}
