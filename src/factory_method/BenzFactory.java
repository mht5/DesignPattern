package factory_method;

public class BenzFactory implements CarFactory {

	@Override
	public Car getInstance() {
		return new Benz();
	}

}
