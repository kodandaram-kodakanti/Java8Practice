package com.genpact;

import java.util.Stack;

class gerericstack<E> {
	Stack<E> stk = new Stack<E>();

	public void push(E obj) {
		stk.push(obj);

	}

	public E pop() {
		E obj = stk.pop();
		return obj;
	}
}

public class Output1 {

	public static void main(String[] args) {
		gerericstack<Integer> gs = new gerericstack<Integer>();
		gs.push(36);
		System.out.println(gs.pop());

	}

}
