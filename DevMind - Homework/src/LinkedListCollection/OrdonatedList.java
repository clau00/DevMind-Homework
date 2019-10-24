package LinkedListCollection;

import java.util.ListIterator;
import java.util.LinkedList;
import java.util.List;

public class OrdonatedList<T extends Town> {

	private List<T> elements = new LinkedList();
	
	public boolean addELement(T el) {
		ListIterator<T> it = elements.listIterator();
		
		while(it.hasNext()) {
			int compare = it.next().compareTo(el);
			
			if(compare < 0) {
			}else if(compare > 0) {
				it.previous();
				it.add(el);
				return true;
			}else {
				return false;
			}
		}
		it.add(el);
		return true;
	}
	
	@Override
	public String toString() {
		String rez = "";
		for(T el : elements) {
			rez += "\t " + el.getTown() + " " + el.getDistance() + " \n";
		}
		return rez;
	}
}
