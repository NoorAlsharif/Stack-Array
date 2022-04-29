/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

public class StackArray {
    
	private int[] stack;
	private int maxSize;
	private int top;
	
	// Constructor
	public StackArray (int size) {
		maxSize = size;             // set array size
		stack = new int[maxSize];   // create array for stack
		top = -1;                   // set top to -1 (no items in stack yet)
	}
	
	
	//
	// boolean | isFull()
	//
	public boolean isFull () {
		return (top == maxSize-1);
	}
	
	
	//
	// boolean | isEmpty()
	//
	public boolean isEmpty() {
		return (top == -1);
	}
	
	
	//
	// int | pop()
	//
	public int pop() {
		return stack[top--];
	}
	
	
	//
	// int | peek()
	//
	public int peek() {
		return stack[top];
	}
	
	
	//
	// void | push(int)
	//
	public void push(int value) {
		stack[++top] = value;
	}
	
	
	//
	// boolean | search(int)
	//
	public boolean search(int value) {
		for(int i=0; i<=top; i++) {
			// if the value is found at stack[i], return true
			if (stack[i] == value)
				return true;
		}
		// If we make it till here, the value was not found in the array.
		return false;
	}
	
	
	//
	// void | PrintStack()
	//
	public void PrintStack() {
		for(int i=0; i<=top; i++) {
			System.out.print(stack[i] + ", ");
		}
		// print a newline
		System.out.println();
	}
	
}
