package LinkedListExamples;

public class UsingLinkedLists {
	
	private final static double EPS = 0.0000001;

	private static Node<Double> makeList(double[] values){
		Node<Double> head = new Node<>();
		Node<Double> it = head;
		for(double el : values) {
			Node<Double> newNode = new Node<>(el);
			it.next(newNode);
			it = it.next();
		}
		return head.next();
	}
	
	public static void iterate(Node<Double> listHead) {
		Node<Double> it = listHead;
		while(it != null) {
			double crt = it.value();
			System.out.println(crt);
			it = it.next();
		}
	}
	
	public static boolean find(Node<Double> listHead, double searchKey) {
		for(Node<Double> it = listHead; it != null; it = it.next()) {
			if(Math.abs((it.value() - searchKey)) < EPS) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		double[] values = {24.15, 24.15, 3.33, 1.01, 12.45, 19.30, 16.11};
		Node<Double> list = makeList(values);
		iterate(list);
		System.out.println();
		
		double searchKey = 12.45;
		System.out.println("\t Element " + searchKey + " exists? Answer: " + find(list, searchKey));
		
	}
}
