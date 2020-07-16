package singleton;

/**
 * 饿汉式单例，在创建类时实例化自己，线程安全
 * @author mhts
 * @date 2018年8月31日
 */
public class SingletonTwo {
	
	private static SingletonTwo singleton = new SingletonTwo();
	
	private SingletonTwo() {
		
	}
	
	public static SingletonTwo getInstance() {
		return singleton;
	}
}
