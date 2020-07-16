package abstract_factory;

public class AudiFactory implements CarFactory {

	@Override
	public Engine produceEngine() {
		return new AudiEngine();
	}

	@Override
	public AirConditioner produceAirConditioner() {
		return new AudiAirConditioner();
	}

}
