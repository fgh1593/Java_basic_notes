package �x���P���X;

public class JAVA300_132_�x������ {
	public static void main(String[] args) {
		MyCollection<String> a=new MyCollection();
		a.set("��", 0);
		System.out.println(a.get(0));
	}

}

//E���x���A�`��E T V�@���x���N���A�]�i�Ψ�L�r��
class MyCollection<E>{
	Object[] objs=new Object[5];
	
	public void set(E e,int index) {
		objs[index] =e;
	}
	
	public E get(int index) {
		return (E)objs[index];
	}
	
}
