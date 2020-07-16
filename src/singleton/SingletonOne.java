package singleton;

/**
 * 懒汉式单例，在第一次使用时实例化自己
 * 通过将构造函数设为private来保证不能在其它地方实例化（实际上仍然可以使用反射来实例化）
 * @author mhts
 * @date 2018年8月31日
 */
public class SingletonOne {
	
	private static SingletonOne singleton = null;
	
	private SingletonOne() {
		
	}
	
	/**
	 * 使用synchronized来保证线程安全
	 * @return
	 */
	public static synchronized SingletonOne getInstance() {
		if (singleton == null) {
			singleton = new SingletonOne();
		}
		return singleton;
	}

}
