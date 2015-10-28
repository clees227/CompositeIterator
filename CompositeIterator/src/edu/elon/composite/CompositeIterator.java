package edu.elon.composite;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<CarComponent> {
	Stack<Iterator<CarComponent>> stack = new Stack<Iterator<CarComponent>>();

	@Override
	public boolean hasNext() {
		if(stack.empty()){
			return false;
		}else{
			Iterator<CarComponent> iterator = stack.peek();
			if(!iterator.hasNext()){
				stack.pop();
				return hasNext();
			}
			else{
				return true;
			}
		}
	}

	@Override
	public CarComponent next() {
		if(hasNext()){
			Iterator<CarComponent> iterator = stack.peek();
			CarComponent component = iterator.next();
			stack.push(component.createIterator());
			return component;
		}
		return null;
	}

}
