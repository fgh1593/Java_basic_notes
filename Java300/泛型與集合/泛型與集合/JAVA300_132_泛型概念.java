package 泛型與集合;

public class JAVA300_132_泛型概念 {
	public static void main(String[] args) {
		MyCollection<String> a=new MyCollection();
		a.set("方", 0);
		System.out.println(a.get(0));
	}

}

//E為泛型，常用E T V作為泛型代號，也可用其他字母
class MyCollection<E>{
	Object[] objs=new Object[5];
	
	public void set(E e,int index) {
		objs[index] =e;
	}
	
	public E get(int index) {
		return (E)objs[index];
	}
	
}
