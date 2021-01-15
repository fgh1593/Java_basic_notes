package array;

public class JAVA300_116_StringBuilderAndStringBuffer02 {
	public static void main(String[] args) {
		//String 為不可變字符序列
		//StringBuilder、StringBuffer為可變字符序列
		
		//StringBuilder 線程不安全，效率高，比較常用
		//StringBuffer 線程安全，效率低
		//兩者使用方法相似
		StringBuilder sb= new StringBuilder();
		for(int i=0;i<26;i++) {
			char temp='a';
			temp+=i;
			//.append可以將句子接上去
			sb.append(temp);
		}
		System.out.println(sb);
		sb.reverse(); //反轉字串
		System.out.println(sb);
		sb.setCharAt(4,'!');//取代字符
		System.out.println(sb);
		sb.insert(0, '~');//插入字符
		System.out.println(sb);
		sb.insert(4, '@').append("haha").insert(10, 'A');//鍊式調用。核心就是該方法調用了return this,把自己返回。
		System.out.println(sb);
		sb.delete(0, 5);//刪除指定區間的內容
		System.out.println(sb);
	}
}
