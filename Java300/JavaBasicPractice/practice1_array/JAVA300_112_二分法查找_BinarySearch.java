package practice1_array;

import java.util.Arrays;

public class JAVA300_112_二分法查找_BinarySearch {
public static void main(String[] args) {
	//先排序
	int[] values = { 3, 1, 6, 2, 9, 0, 7, 4, 5, 8 };
	Arrays.sort(values);
	System.out.println(Arrays.toString(values));
	System.out.println(myBinarySearch(values,3));
}
public static int myBinarySearch(int[] a,int value) {
	int low=0;
	int high=a.length-1;
	while(low<=high) {
		int mid=(low+high)/2;
		if(value==a[mid]) {
			return mid;
		}else if(value>a[mid]){
			low=mid+1;
		}else if(value<a[mid]) {
			high=mid-1;
		}
	}
	return -1;
}

}
