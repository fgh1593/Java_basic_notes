package array;

public class JAVA300_124_�T�|enum{
	public static void main(String[] args) {
		Season a=Season.SPRING;
		switch(a) {
		case SPRING:
			System.out.println("�K��");
			break;
		case SUMMER:
			System.out.println("�L��");
			break;
		case AUTUMN:
			System.out.println("���");
			break;
		case WINTER:
			System.out.println("�V��");
			break;
		}
	}

}

enum Season{
	SPRING,SUMMER,AUTUMN,WINTER
}
