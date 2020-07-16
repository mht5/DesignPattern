package abstract_factory;

public class BenzFactory implements CarFactory {

	@Override
	public Engine produceEngine() {
		return new BenzEngine();
	}

	@Override
	public AirConditioner produceAirConditioner() {
		return new BenzAirConditioner();
	}

}
