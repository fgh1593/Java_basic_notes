package practice1_array;

import java.util.Arrays;

public class JAVA300_108_Array工具 {
	
	public static void main(String[] args) {
		int[] x= {10,200,3};
		
		//列出數組
		System.out.println(Arrays.toString(x));
		
		//排序
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));
		
		//找出數據的位置
		System.out.println(Arrays.binarySearch(x, 200));
	}

}
