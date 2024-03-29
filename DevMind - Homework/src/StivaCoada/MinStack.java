package StivaCoada;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class MinStack {
	
	private Deque<Integer> stack;
	private Deque<Integer> minStack;
	
	public MinStack() {
		stack = new ArrayDeque();
		minStack = new ArrayDeque();
		minStack.push(Integer.MAX_VALUE);
	}

	public void addElement(Integer el) {
		stack.push(el);
		if(el <= minStack.peek()) {
			minStack.push(el);
		}
	}
	
	public Integer removeElement() {
		int el = stack.pop();
		if(el == minStack.peek()) {
			minStack.pop();
		}
		return el;
	}
	
	public Integer getElement() {
		return stack.peek();
	}
	
	public Integer getMin() {
		return minStack.peek();
	}
	
	@Override
	public String toString() {
		String rez = "\t";
		for(Integer el : stack) {
			rez += el + " ";
		}
		
		return rez;
	}
	
	public static void main(String[] args) {
		MinStack stack = new MinStack();
		
		stack.addElement(10);
		stack.addElement(7);
		stack.addElement(25);
		stack.addElement(36);
		stack.addElement(3);
		stack.addElement(12);
		
		System.out.println(stack);
		System.out.println(stack.getMin());
		
		stack.removeElement();
		stack.removeElement();
		
		System.out.println(stack);
		System.out.println(stack.getMin());
	}
}
