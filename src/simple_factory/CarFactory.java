package simple_factory;

/**
 * 简单工厂，或静态工厂
 * 每增加一种产品，都要在工厂类中增加相应的创建业务逻辑，这是违背开闭原则的
 * @author mhts
 * @date 2018年8月31日
 */
public class CarFactory {

	public static Car getInstance(String type) {
		if ("Benz".equalsIgnoreCase(type)) {
			return new Benz();
		} else if ("Audi".equalsIgnoreCase(type)) {
			return new Audi();
		} else {
			throw new RuntimeException("type not supported");
		}
	}
	
}
