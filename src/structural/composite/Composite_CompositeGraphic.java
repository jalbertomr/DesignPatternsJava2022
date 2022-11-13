package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite_CompositeGraphic implements Component_Graphic{

	private final List<Component_Graphic> childGraphics = new ArrayList<>();
	
	public void add(Component_Graphic graphic) {
		childGraphics.add( graphic);
	}
	
	@Override
	public void print() {
		System.out.println("Composite");
		for( Component_Graphic graphic: childGraphics) {
			graphic.print();   // Delegation
		}
	}

}
