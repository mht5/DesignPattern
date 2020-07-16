package decorator;

public class Person implements Human {

	@Override
	public void dress() {
		System.out.println("What am I going to wear?");
	}

	@Override
	public void walk() {
		System.out.println("Where am I going?");
	}

}
