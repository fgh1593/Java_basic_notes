package 泛型與集合;
// ArrayList 和 LinkedList以及Vector 操作方法相同
//ArrayList使用陣列儲存， 讀取快 增刪較慢。線程不安全
//LinkedList使用節點鏈表儲存， 讀取慢 增刪快。線程不安全
//Vector結構同ArrayList，但自帶synchronize同步，效率較差，但線程安全。
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JAVA300_136_ArrayList_索引和順序相關方法 {
	public static void main(String[] args) {
		List<String> L=new ArrayList<String>();
		L.add("A");
		L.add("B");
		L.add("C");
		L.add("D");
		L.add("E");
		
		System.out.println(L);
		
		//在指定位置插入物件
		L.add(2,"安安");
		System.out.println(L);
		//刪除指定位置物件
		L.remove(2);
		System.out.println(L);
		//在指定位置修改物件數值
		L.set(2, "HA");
		System.out.println(L);
		//取得指定位置之值
		System.out.println(L.get(2));
		
		L.add("A");
		
		//獲取物件第一次出現的位置，若不存在返回-1
		System.out.println(L.indexOf("A"));
		//獲取物件最後一次出現的位置，若不存在返回-1
		System.out.println(L.lastIndexOf("A"));
		
		LinkedList<Integer> L2=new LinkedList<Integer>();
		L2.add(1);
		L2.add(2);
		
	}
}
