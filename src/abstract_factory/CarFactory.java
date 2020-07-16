package abstract_factory;

public interface CarFactory {

	Engine produceEngine();
	
	AirConditioner produceAirConditioner();
	
}
