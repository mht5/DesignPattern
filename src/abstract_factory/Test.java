package abstract_factory;

public class Test {

	public static void main(String[] args) {
		CarFactory factory = new BenzFactory();
		factory.produceEngine();
		factory.produceAirConditioner();
		
		factory = new AudiFactory();
		factory.produceEngine();
		factory.produceAirConditioner();
	}
	
}
