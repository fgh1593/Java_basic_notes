package �x���P���X;
//Collection�O���f�ACollections�O�u����
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JAVA300_163_Collections�u�� {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		for(int i=0;i<10;i++) {
			list.add("A"+i);
		}
		System.out.println(list);
		
		//���ö��X����
		Collections.shuffle(list);
		System.out.println(list);
		
		//�˱ԱƦC
		Collections.reverse(list);
		System.out.println(list);
		
		//�ƧǡA���ӻ��W�覡�ƧǡA��Comparable���f
		Collections.sort(list);
		System.out.println(list);
		
		//�G���k�d��A������^1�A�S����^-1
		System.out.println(Collections.binarySearch(list, "A1"));
	}
}
