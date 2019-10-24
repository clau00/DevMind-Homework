package FormeGeometrice;

import java.util.ArrayList;

public class TestShapes {

	public static void main(String[] args) {
		
		Shape s1 = new Shape();
		Shape s2 = new Shape("Math is easy", "plastic");
		Shape s3 = s2;
		
		Triangle t1 = new Triangle(5, 3);
		Triangle t2 = new Triangle(11, 23, "I reflect light", "glass");
		Triangle t3 = t2;
		
		Rectangle r1 = new Rectangle(5, 7);
		Rectangle r2 = new Rectangle(50, 10, "Yellow rectangle", "steel");
		Rectangle r3 = r2;
		
		System.out.println("\t Shape1 toString:		" + s1.toString());
		System.out.println("\t Shape2 toString:		" + s2.toString());
		System.out.println("\t Shape1 getSize:		" + s1.getSize());
		System.out.println("\t Shape2 getSize:		" + s2.getSize());
		System.out.println("\t Shape1 equals shape2: 		" + s1.equals(s2));
		System.out.println("\t Shape2 equals shape3: 		" + s2.equals(s3));
		System.out.println("\t Shape1 hashCode: 		" + s1.hashCode());
		System.out.println("\t Shape2 hashCode: 		" + s2.hashCode());
		System.out.println("\t Shape1 hashCode: 		" + s1.hashCode());
		System.out.println("\t Shape2 hashCode: 		" + s2.hashCode());
		
		System.out.println("\n\t ================================================================\n");
		
		System.out.println("\t Triangle1 toString:		" + t1.toString());
		System.out.println("\t Triangle2 toString:		" + t2.toString());
		System.out.println("\t Triangle1 getSize:  		" + t1.getSize());
		System.out.println("\t Triangle2 getSize: 		" + t2.getSize());
		System.out.println("\t Triangle1 equals triangle2: 	" + t1.equals(t2));
		System.out.println("\t Triangle2 equals triangle3: 	" + t2.equals(t3));
		System.out.println("\t Triangle1 hashCode: 		" + t1.hashCode());
		System.out.println("\t Triangle2 hashCode: 		" + t2.hashCode());
		System.out.println("\t Triangle1 hashCode: 		" + t1.hashCode());
		System.out.println("\t Triangle2 hashCode: 		" + t2.hashCode());

		System.out.println("\n\t ================================================================\n");
		
		System.out.println("\t Rectangle1 toString:		" + r1.toString());
		System.out.println("\t Rectangle2 toString:		" + r2.toString());
		System.out.println("\t Rectangle1 getSize: 		" + r1.getSize());
		System.out.println("\t Rectangle2 getSize: 		" + r2.getSize());
		System.out.println("\t Rectangle1 equals rectangle2: 	" + r1.equals(r2));
		System.out.println("\t Rectangle2 equals rectangle3: 	" + r2.equals(r3));
		System.out.println("\t Rectangle1 hashCode: 		" + r1.hashCode());
		System.out.println("\t Rectangle2 hashCode: 		" + r2.hashCode());
		System.out.println("\t Rectangle1 hashCode: 		" + r1.hashCode());
		System.out.println("\t Rectangle2 hashCode: 		" + r2.hashCode());

		System.out.println("\n\t ================================================================\n");
				
		ArrayList<Shape> array = new ArrayList<Shape>();
		array.add(s1);
		array.add(s2);
		array.add(t1);
		array.add(t2);
		array.add(r1);
		array.add(r2);
		
		System.out.println("\t ArrayList -> toString: \n");
		for(int i=0; i<array.size(); i++) {
			System.out.println("\t" + array.get(i).toString());
		}

		System.out.println("\n\t ================================================================\n");
		
		System.out.println("\t ArrayList -> getSize: \n");
		for(int i=0; i<array.size(); i++) {
			System.out.println("\t" + array.get(i).getSize());
		}
		
		System.out.println("\t ArrayList -> downcast -> displayHeight: \n");
		for(int i=0; i<array.size(); i++) {
			if(array.get(i) instanceof Triangle) {
				Triangle t = (Triangle) array.get(i);
				t.displayTriangleHeight();
			}else if(array.get(i) instanceof Rectangle) {
				Rectangle r = (Rectangle) array.get(i);
				r.displayRectangleHeight();
			}else if(array.get(i) instanceof Shape) {
				continue;
			}
		}
	}
}
