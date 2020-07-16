package observer;

import java.util.ArrayList;
import java.util.List;

public class Cargo implements Observed {
	
	private List<Observer> observers = new ArrayList<>();

	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.act();
		}
	}

}
