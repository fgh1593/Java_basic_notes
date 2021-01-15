package 泛型與集合;
//Collection是接口，Collections是工具類
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JAVA300_163_Collections工具 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		for(int i=0;i<10;i++) {
			list.add("A"+i);
		}
		System.out.println(list);
		
		//打亂集合順序
		Collections.shuffle(list);
		System.out.println(list);
		
		//倒敘排列
		Collections.reverse(list);
		System.out.println(list);
		
		//排序，按照遞增方式排序，或Comparable接口
		Collections.sort(list);
		System.out.println(list);
		
		//二分法查找，有找到返回1，沒找到返回-1
		System.out.println(Collections.binarySearch(list, "A1"));
	}
}
