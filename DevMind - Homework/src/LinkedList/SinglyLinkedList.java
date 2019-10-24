package LinkedList;

public class SinglyLinkedList<T> {

	private Node listHead;
	
	public SinglyLinkedList(T[] values) {
		Node head = new Node();
		Node it = head;
		for(T el : values) {
			Node newNode = new Node(el);
			it.next(newNode);
			it = it.next();
		}
		listHead = head.next();
	}
	
	public SinglyLinkedList() {}
	
	public int size() {
		int size = 1;
		Node it = listHead;
		while(it.next().next() != null) {
			size++;
			it = it.next();
		}
		System.out.println(it.next().value());
		size++;
		return size;
	}
	
	public void iterate() {
		Node it = listHead;
		while(it.next != null) {
			T crtElement = it.value();
			System.out.println("     " + crtElement);
			it = it.next();
		}
		System.out.println("     " + it.value());
	}
	
	public boolean find(T searchKey) {
		for(Node it = listHead; it.next() != null; it = it.next()) {
			if(it.value().equals(searchKey)) {
				return true;
			}
		}
		return false;
	}
	
	public void insert(T newValue, int pos) {
		Node it = listHead;
		for(int i = 0; i < pos - 1; i++) {
			it = it.next();
		}
		Node newNode = new Node(newValue);
		newNode.next(it.next());
		newNode.previous(it);
		it.next().previous(newNode);
		it.next(newNode);
	}
	
	public T remove(int pos) {
		Node it = listHead;
		for(int i=0; i<pos-1; i++) {
			it = it.next();
		}
		T removedValue = it.next().value();
		it.next(it.next().next());
		it.next().previous(it);
		return removedValue;
	}
	
	private class Node{
		private T value;
		private Node next;
		private Node previous;
		
		public Node(T value, Node next, Node previous) {
			this.value = value;
			this.next = next;
			this.previous = previous;
		}
		
		public Node(T value) {
			this(value, null, null);
		}
		
		public Node() {}
		
		public void value(T value) {
			this.value = value;
		}
		
		public T value() {
			return value;
		}
		
		public void next(Node next) {
			this.next = next;
		}
		
		public Node next() {
			return next;
		}
		
		public void previous(Node previous) {
			this.previous = previous;
		}
		
		public Node previous() {
			return previous;
		}
	}
}
