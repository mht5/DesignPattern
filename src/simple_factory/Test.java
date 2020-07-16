package simple_factory;

public class Test {
	
	public static void main(String[] args) {
		String carType = "benz";
		CarFactory.getInstance(carType);
	}
	
}
