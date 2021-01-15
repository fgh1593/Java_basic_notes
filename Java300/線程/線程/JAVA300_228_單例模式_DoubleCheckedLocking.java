package �u�{;

//DCL��ҼҦ�:�b�h�u�{���ҤU�A��~�Ȧs�b�@�Ӫ���
//1.�c�y���p����-->�קK�~��new�c�y��
//2.���Ѩp�����R�A�ݩ�-->�x�s���󪺦a�}
//3.���Ѥ��@���R�A��k-->����ݩ�
public class JAVA300_228_��ҼҦ�_DoubleCheckedLocking {
	// 2.���Ѩp�����R�A�ݩʡA�[�Jvolatile�קK���Ʋ{�Hand�Y�ɧ�s�ƾڤ��e�A�קK���~
	//�S��volatile�A��L�u�{�i��X�ݤ@���٥���l�ƪ���H
	private volatile static JAVA300_228_��ҼҦ�_DoubleCheckedLocking instance;

	// 1.�c�y���p����
	private JAVA300_228_��ҼҦ�_DoubleCheckedLocking() {
	}
	// 3.���Ѥ��@���R�A��k-->����ݩ�

	

	public static JAVA300_228_��ҼҦ�_DoubleCheckedLocking getInstance() {
		//�[�J�����˴������Ĳv�A�b�w�g�s�b��H�ɡA�קK�����n���P�B
		if (null != instance) {
			return instance;
		}
		//�b�Ыع�H��class�]�p�ϤW��
		synchronized (JAVA300_228_��ҼҦ�_DoubleCheckedLocking.class) {
			if (null == instance) {
				instance = new JAVA300_228_��ҼҦ�_DoubleCheckedLocking();
			}
		}
		return instance;
	}
	
	public static void main(String[] args) {
		new Thread(()->{
			System.out.println(getInstance());
		}
		).start();
		System.out.println(getInstance());
	}

}
