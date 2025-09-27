package com.tnsif.collection;

import java.util.Stack;

// This class demonstrates the basic usage of the Stack collection.
public class StackDemo {
	public static void main(String[] args) {
		// Create a Stack object to hold integers.
		Stack<Integer> ob = new Stack<Integer>();
		
		// Add elements to the stack using the push() method.
		ob.push(5);
		ob.push(8);
		ob.push(54);
		ob.push(59);
		ob.push(52);
		
		System.out.println("Stack after pushes: " + ob);
		
		// Remove the top element from the stack using the pop() method.
		ob.pop();
		System.out.println("Stack after pop: " + ob);
		
		// Check if the stack is empty.
		if(ob.isEmpty()) {
			System.out.println("Stack is empty");
		} else {
			System.out.println("Stack is not empty");
		}
	}
}
