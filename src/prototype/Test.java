package prototype;

/**
 * ԭ��ģʽ
 * @author mhts
 * @date 2018��9��4��
 */
public class Test {

	public static void main(String[] args) {
		ConcretePrototype cp = new ConcretePrototype();
		for (int i = 0; i < 10; i++) {
			ConcretePrototype cpClone = (ConcretePrototype) cp.clone();
			cpClone.show();
		}
	}

}
