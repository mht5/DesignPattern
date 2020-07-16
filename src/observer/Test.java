package observer;

public class Test {

	public static void main(String[] args) {
		Observed cargo = new Cargo();
		Observer bandit = new Bandit();
		Observer police = new Police();
		Observer security = new Security();

		cargo.addObserver(bandit);
		cargo.addObserver(police);
		cargo.addObserver(security);
		
		cargo.notifyObservers();
	}
	
}
