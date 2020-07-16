package decorator;

public class DecoratorThree extends Decorator {

	public DecoratorThree(Human human) {
		super(human);
	}
	
	public void findCloth() {
		System.out.println("Found a shirt");
	}
	
	public void findPlace() {
		System.out.println("Found a mountain");
	}
	
	public void dress() {
		super.dress();
		findCloth();
	}
	
	public void walk() {
		super.walk();
		findPlace();
	}

}
