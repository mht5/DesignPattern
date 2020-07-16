package strategy;

public class ConcreteStrategySuperVip implements Strategy {

	@Override
	public double calculatePrice(double price) {
		return price * 0.8;
	}

}
