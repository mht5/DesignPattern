package decorator;

public class DecoratorOne extends Decorator {

	public DecoratorOne(Human human) {
		super(human);
	}
	
	public void goHome() {
		System.out.println("Go back home");
	}
	
	public void findMap() {
		System.out.println("Find a map");
	}
	
	public void dress() {
		super.dress();
		goHome();
	}
	
	public void walk() {
		super.walk();
		findMap();
	}

}
