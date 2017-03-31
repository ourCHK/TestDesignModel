package chapter9_part2.impl;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {

	Stack stack = new Stack();
	
	public CompositeIterator(Iterator iterator) {
		stack.push(iterator);
		
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

}
