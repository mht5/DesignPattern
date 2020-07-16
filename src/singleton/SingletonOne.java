package singleton;

/**
 * ����ʽ�������ڵ�һ��ʹ��ʱʵ�����Լ�
 * ͨ�������캯����Ϊprivate����֤�����������ط�ʵ������ʵ������Ȼ����ʹ�÷�����ʵ������
 * @author mhts
 * @date 2018��8��31��
 */
public class SingletonOne {
	
	private static SingletonOne singleton = null;
	
	private SingletonOne() {
		
	}
	
	/**
	 * ʹ��synchronized����֤�̰߳�ȫ
	 * @return
	 */
	public static synchronized SingletonOne getInstance() {
		if (singleton == null) {
			singleton = new SingletonOne();
		}
		return singleton;
	}

}
