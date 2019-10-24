package MyIntArrayList;

import java.util.Arrays;

public class MyIntArrayList {
	
	private int[] elements;
	private int size;
	
	public MyIntArrayList() {
		this(10);
	}
	
	public MyIntArrayList(int initialCapacity) {
		this.elements = new int[initialCapacity];
	}
	
	public MyIntArrayList(MyIntArrayList c) {
		this.elements = Arrays.copyOf(c.elements, c.size);
		//this.size = c.size;
	}
	
	public int[] getElements() {
		return Arrays.copyOf(this.elements, this.size);
	}

	public void add(int index, int element) {
		if(index < 0 || index >= this.size) {
			// should throw IndexOutOfBoundsException
			System.out.println("Throwing IndexOutOfBoundsException when trying to" + 
							   " remove element at position " + index);
			return;
		}	
		
		if(this.size == this.elements.length) {
			this.elements = Arrays.copyOf(this.elements, this.size * 2);
		}
		
		for(int i = this.size; i > index; i--) {
			this.elements[i] = this.elements[i-1];
		}
		this.elements[index] = element;
		this.size++;
	}
	
	public boolean add(int e) {
		if(this.size == this.elements.length) {
			this.elements = Arrays.copyOf(this.elements, this.size * 2);
		}
		
		this.elements[size] = e;
		size++;
		
		return true;
	}
	
	public int size() {
		return this.size;
	}
	
	public boolean contains(int e) {
		for(int i=0; i<this.size; i++) {
			if(this.elements[i] == e) {
				return true;
			}
		}
		return false;
	}
	
	public int get(int index) {
		if(index < 0 || index >= size) {
			// should throw IndexOutOfBoundsException
			System.out.println("Throwing IndexOutOfBoundsException when trying to" + 
							   " remove element at position " + index);
			return -1;
		}			
		
		return this.elements[index];
	}
	
	public int indexOf(int e) {
		for(int i=0; i<this.size; i++) {
			if(this.elements[i] == e) {
				return i;
			}
		}
		return -1;
	}
	
	public int lastIndexOf(int e) {
		for(int i=size-1; i>=0; i--) {
			if(this.elements[i] == e) {
				return i;
			}
		}
		return -1;
	}
	
	public boolean remove(int e) {
		for(int i=0; i<this.size; i++) {
			if(this.elements[i] == e) {
				for(int j=i; j<this.size; j++) {
					this.elements[j] = this.elements[j+1];
				}
			}
			size--;
			return true;
		}
		return false;
	}
	
	public int removeElementAtIndex(int index) {
		if(index < 0 || index >= this.size) {
			// should throw IndexOutOfBoundsException
			System.out.println("Throwing IndexOutOfBoundsException when trying to" + 
							   " remove element at position " + index);
			return -1;
		}
		
		int removedElement = this.elements[index];
		for(int i=index; i<this.size; i++) {
			this.elements[i] = this.elements[i+1];
		}
		this.size--;
		
		return removedElement;
	}
	
	public void clear() {
		this.size = 0;
	}
	
	public int set(int index, int e) {
		if(index < 0 || index >= this.size) {
			// should throw IndexOutOfBoundsException
			System.out.println("Throwing IndexOutOfBoundsException when trying to" + 
							   " remove element at position " + index);
			return -1;
		}
		
		int replacedElement = this.elements[index];
		this.elements[index] = e;
		return replacedElement;
	}
	
	public boolean addAll(MyIntArrayList c) {
		if(this.size == this.elements.length && c.size > 0){
			this.elements = Arrays.copyOf(this.elements, this.size + c.size());
		}
		
		for(int i=0; i<c.size(); i++) {
			this.elements[size] = c.elements[i];
			this.size++;
		}
		return true;
	}

	public boolean addAll(int index, MyIntArrayList c) {
		if(index < 0 || index >= this.size) {
			// should throw IndexOutOfBoundsException
			System.out.println("Throwing IndexOutOfBoundsException when trying to" + 
							   " remove element at position " + index);
			return false;
		}
		
		if(this.size == this.elements.length && c.size > 0){
			this.elements = Arrays.copyOf(this.elements, this.size + c.size());
		}
		
		int cnt = size - 1;
		for(int i=this.elements.length - 1; i>=size ; i--) {
			this.elements[i] = this.elements[cnt];
			cnt--;
		}
		cnt = index;
		for(int i=0; i<c.size(); i++) {
			this.elements[cnt] = c.elements[i];
			cnt++;
			size++;
		}
		return true;
	}	
	
	public int[] toArray() {
		int[] array = new int[this.size];
		for(int i=0; i<this.size; i++) {
			array[i] = this.elements[i];
		}
		return array;
	}
	
	public void ensureCapaciy(int minCapacity) {
		if(this.elements.length < minCapacity) {
			this.elements = Arrays.copyOf(this.elements, minCapacity);
		}
	}
	
	public void trimToSize() {
		if(this.size == 0) {
			return;
		}
		this.elements = Arrays.copyOf(this.elements, size);
	}
	
	public void printMyIntArrayList() {
		System.out.println("\t");
		for(int i=0; i<this.size(); i++) {
			System.out.print(this.elements[i] + " ");
		}
		System.out.println();
	}
}
