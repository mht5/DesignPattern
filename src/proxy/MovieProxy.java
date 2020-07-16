package proxy;

public class MovieProxy implements Show {
	
	Show show;
	
	public MovieProxy(Show show) {
		this.show = show;
	}

	@Override
	public void watch() {
		System.out.println("I'm going to watch a movie");
		show.watch();
		System.out.println("It was pretty good");
	}

}
