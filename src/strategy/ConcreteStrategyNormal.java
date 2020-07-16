package strategy;

public class ConcreteStrategyNormal implements Strategy {

	@Override
	public double calculatePrice(double price) {
		return price;
	}

}
