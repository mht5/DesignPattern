package decorator;

public class Test {

	public static void main(String[] args) {
		Human person = new Person();
		Decorator decorator = new DecoratorThree(new DecoratorTwo(new DecoratorOne(person)));
		decorator.dress();
		decorator.walk();
	}

}
