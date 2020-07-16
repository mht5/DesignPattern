package factory_method;

public class AudiFactory implements CarFactory {

	@Override
	public Car getInstance() {
		return new Audi();
	}

}
