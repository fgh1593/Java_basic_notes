package practice1_array;

public class JAVA300_115_StringBuilderAndStringBuffer {
	public static void main(String[] args) {
		//String 為不可變字符序列
		//StringBuilder、StringBuffer為可變字符序列
		
		//StringBuilder 線程不安全，效率高，比較常用
		//StringBuffer 線程安全，效率低
		//兩者使用方法相似
		StringBuilder sb= new StringBuilder("abcdefg");
		System.out.println(Integer.toHexString(sb.hashCode()));
		System.out.println(sb);
		
		sb.setCharAt(3, 'M');
		System.out.println(Integer.toHexString(sb.hashCode()));
		System.out.println(sb);
	}
}
