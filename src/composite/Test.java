package composite;

/**
 * 组合模式
 * https://www.cnblogs.com/lfxiao/p/6816026.html
 * @author mhts
 * @date 2018年9月4日
 */
public class Test {

	public static void main(String[] args) {
		Component c1 = new Composite("c1");
		Component c2 = new Composite("c2");
		Component c3 = new Composite("c3");
		
		Component l1 = new Leaf("l1");
		Component l2 = new Leaf("l2");
		Component l3 = new Leaf("l3");
		Component l4 = new Leaf("l4");
		Component l5 = new Leaf("l5");
		
		c1.add(l1);
		c1.add(l2);
		c2.add(l3);
		c2.add(l4);
		c2.add(l5);
		c3.add(c1);
		c3.add(c2);
		
		c3.operation();
	}

}
