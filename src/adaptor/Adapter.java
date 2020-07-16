package adaptor;

public class Adapter implements Target {
	
	Adaptee adaptee;
	
	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void request() {
		this.adaptee.specifiedRequest();
	}

}
