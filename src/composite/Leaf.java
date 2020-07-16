package composite;

public class Leaf extends Component {
	String name;
	
	public Leaf(String name) {
		this.name = name;
	}

	@Override
	public void add(Component c) {
		
	}

	@Override
	public void remove(Component c) {
		
	}

	@Override
	public Component getChild(int i) {
		return null;
	}

	@Override
	public void operation() {
		System.out.println(name);
	}

}
