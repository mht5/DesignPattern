package proxy;

public class Test {

	public static void main(String[] args) {
		Show proxy = new MovieProxy(new Movie());
		proxy.watch();
	}

}
