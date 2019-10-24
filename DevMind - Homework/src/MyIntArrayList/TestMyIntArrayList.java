package MyIntArrayList;

public class TestMyIntArrayList {
	
	public static void main(String args[]) {
		MyIntArrayList a = new MyIntArrayList();
		MyIntArrayList b = new MyIntArrayList(20);
		
		System.out.println("\t Ati introdus elem. 1 in array-ul a: " + a.add(1));
		System.out.println("\t Ati introdus elem. 1 in array-ul a: " + a.add(1));
		System.out.println("\t Ati introdus elem. 2 in array-ul a: " + a.add(2));
		System.out.println("\t Ati introdus elem. 3 in array-ul a: " + a.add(3));
		
		MyIntArrayList c = new MyIntArrayList(a);
		
		a.printMyIntArrayList();
		
		b.add(2, Integer.valueOf(5)); // arunca exceptie IndexOutOfBounds
		
		b.addAll(2, a); // arunca exceptie
		b.addAll(a);
		
		System.out.println("\t Ati introdus 1 elem. pe pozitia 1 in array-ul b");
		b.add(1, Integer.valueOf(9));
		
		System.out.print("\t Array-ul b: ");
		b.printMyIntArrayList();
		
		System.out.println("\t Regarding 'b' array: ");
		System.out.println("\t Size: " + b.size());
		System.out.println("\t Contains 9 and 5: " + b.contains(9) + " " + b.contains(5));
		System.out.println("\t Get value of index 3: " + b.get(3));
		System.out.println("\t IndexOf and LastIndexOf 1: " + b.indexOf(1) + " " + b.lastIndexOf(1));
		
		b.remove(Integer.valueOf(1));
		b.printMyIntArrayList();
		
		b.removeElementAtIndex(0);
		b.printMyIntArrayList();
		
		b.clear();
		b.printMyIntArrayList();
		
		c.addAll(a);
		c.set(1, 7);
		c.printMyIntArrayList();
		c.addAll(3, a);
		c.printMyIntArrayList();
		
		int[] arrayC = c.toArray();
		for(int i=0; i<arrayC.length; i++) {
			System.out.print(arrayC[i] + " ");
		}
		System.out.println();
		
		c.ensureCapaciy(20);
		c.trimToSize();
	}
}
