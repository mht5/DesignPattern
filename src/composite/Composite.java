package composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
	
	private List<Component> list = new ArrayList<Component>();
	String name;
	
	public Composite(String name) {
		this.name = name;
	}

	@Override
	public void add(Component c) {
		list.add(c);
	}

	@Override
	public void remove(Component c) {
		list.remove(c);
	}

	@Override
	public Component getChild(int i) {
		return list.get(i);
	}

	@Override
	public void operation() {
		System.out.println(name + ": ");
		for (Component c : list) {
			c.operation();
		}
	}

}
