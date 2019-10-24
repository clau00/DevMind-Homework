package Compare;

import java.util.ArrayList;

public class TestCircusGuest {

	public static void main(String[] args) {
		MyComparator myComp = new MyComparator();
		CircusGuest guest1 = new CircusGuest("GIGI", 237, 21);
		CircusGuest guest2 = new CircusGuest("MIMI", 17, 70);
		CircusGuest guest3 = new CircusGuest("Mihai", 1003, 30);
		
		ArrayList<CircusGuest> a = new ArrayList<CircusGuest>();
		
		a.add(guest1);
		a.add(guest2);
		a.add(guest3);
		
		System.out.println(myComp.compare(guest1, guest2));
		System.out.println(guest1.compareTo(guest2));
	}
}
