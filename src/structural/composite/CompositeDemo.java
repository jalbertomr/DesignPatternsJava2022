package structural.composite;

public class CompositeDemo {

	public static void main(String[] args) {
		// initilize four ellipses
		Leaf_Ellipse ellipse1 = new Leaf_Ellipse();
		Leaf_Ellipse ellipse2 = new Leaf_Ellipse();
		Leaf_Ellipse ellipse3 = new Leaf_Ellipse();
		Leaf_Ellipse ellipse4 = new Leaf_Ellipse();
		
		Composite_CompositeGraphic composite_CompositeGraphic2 = new Composite_CompositeGraphic();
		composite_CompositeGraphic2.add( ellipse1);
		composite_CompositeGraphic2.add( ellipse2);
		composite_CompositeGraphic2.add( ellipse3);
		
		Composite_CompositeGraphic composite_CompositeGraphic3 = new Composite_CompositeGraphic();
		composite_CompositeGraphic3.add( ellipse4);
		
		Composite_CompositeGraphic composite_CompositeGraphic = new Composite_CompositeGraphic();
		composite_CompositeGraphic.add(composite_CompositeGraphic2);
		composite_CompositeGraphic.add(composite_CompositeGraphic3);
		
		composite_CompositeGraphic.print();
		
	}

}
