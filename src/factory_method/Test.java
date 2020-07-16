package factory_method;

public class Test {

	public static void main(String[] args) {
		CarFactory factory = new BenzFactory();
		factory.getInstance();
		
		factory = new AudiFactory();
		factory.getInstance();
	}
	
}
