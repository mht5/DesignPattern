package proxy;

public class Movie implements Show {

	@Override
	public void watch() {
		System.out.println("Watching a movie...");
	}

}
