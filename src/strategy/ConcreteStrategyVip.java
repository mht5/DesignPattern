package strategy;

public class ConcreteStrategyVip implements Strategy {

	@Override
	public double calculatePrice(double price) {
		return price * 0.9;
	}

}
