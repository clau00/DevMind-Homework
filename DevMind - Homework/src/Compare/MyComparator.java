package Compare;

import java.util.Comparator;

public class MyComparator implements Comparator<CircusGuest> {

	public int compare(CircusGuest o1, CircusGuest o2) {
		return o1.getPlace()-o2.getPlace();
	}
}
