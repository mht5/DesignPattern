package adaptor;

public class Test {

	public static void main(String[] args) {
		Target concreteTarget = new ConcreteTarget();
		concreteTarget.request();
		
		Target adaptor = new Adapter(new Adaptee());
		adaptor.request();
	}

}
