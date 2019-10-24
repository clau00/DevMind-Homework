package ExercitiiMostenire;

import java.util.ArrayList;

public class ZooTest {
	
	public static void genericAnimal(Terrestrial t) {
		t.saySomething();
	}

	public static void main(String[] args) {
		
		Animal a = new Animal(false, 100, 3, "AAA");
		Terrestrial t = new Terrestrial(false, 100, 3, "ttt", 0, 0);
		Zebra z = new Zebra(false, 100, 3, "ZZZ", 4, 2);
		Tiger t1 = new Tiger(true, 57, 2, "TTT", 4, 2);
		Tiger t2 = new Tiger(true, 34, 1, "TTT", 4, 2);
		Rhino r = new Rhino(true, 200, 4, "RRR", 4, 2);
		
		ArrayList<Terrestrial> zoo = new ArrayList<Terrestrial>();
		zoo.add(z);
		zoo.add(t1);
		zoo.add(r);
		zoo.add(2, t2);
		
		for(int i=0; i<zoo.size(); i++) {
			if(zoo.get(i) instanceof Zebra) {
				Zebra n = (Zebra) zoo.get(i);
				n.mooo();
			}else if(zoo.get(i) instanceof Tiger) {
				Tiger n = (Tiger) zoo.get(i);
				n.arrr();
			}else if(zoo.get(i) instanceof Rhino) {
				Rhino n = (Rhino) zoo.get(i);
				n.rhi();
			}
//			array.get(i).saySomething();
//			System.out.println();
		}		
		
		//genericAnimal(a);
		genericAnimal(t);
		genericAnimal(z);
		genericAnimal(t1);
		genericAnimal(r);
	}
}
