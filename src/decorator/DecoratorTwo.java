package decorator;

public class DecoratorTwo extends Decorator {

	public DecoratorTwo(Human human) {
		super(human);
	}
	
	public void checkCloset() {
		System.out.println("Checking closet");
	}
	
	public void checkMap() {
		System.out.println("Checking the map");
	}
	
	public void dress() {
		super.dress();
		checkCloset();
	}
	
	public void walk() {
		super.walk();
		checkMap();
	}

}
