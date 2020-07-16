package strategy;

public class Test {

	public static void main(String[] args) {
		Context context = new Context(new ConcreteStrategyNormal());
		System.out.println(context.calculatePrice(100));
		
		context.setStrategy(new ConcreteStrategyVip());
		System.out.println(context.calculatePrice(100));
		
		context.setStrategy(new ConcreteStrategySuperVip());
		System.out.println(context.calculatePrice(100));
	}

}
