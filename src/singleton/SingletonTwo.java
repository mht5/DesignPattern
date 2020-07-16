package singleton;

/**
 * ����ʽ�������ڴ�����ʱʵ�����Լ����̰߳�ȫ
 * @author mhts
 * @date 2018��8��31��
 */
public class SingletonTwo {
	
	private static SingletonTwo singleton = new SingletonTwo();
	
	private SingletonTwo() {
		
	}
	
	public static SingletonTwo getInstance() {
		return singleton;
	}
}
