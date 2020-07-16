package decorator;

public abstract  class Decorator implements Human {

	private Human human;
	
	public Decorator(Human human) {
		this.human = human;
	}
	
	public void dress() {
		human.dress();
	}
	
	public void walk() {
		human.walk();
	}
	
}
