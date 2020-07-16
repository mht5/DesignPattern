package simple_factory;

/**
 * �򵥹�������̬����
 * ÿ����һ�ֲ�Ʒ����Ҫ�ڹ�������������Ӧ�Ĵ���ҵ���߼�������Υ������ԭ���
 * @author mhts
 * @date 2018��8��31��
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
