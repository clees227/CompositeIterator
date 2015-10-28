package edu.elon.composite;

import java.util.Iterator;

public abstract class CarComponent {
	public void add(CarComponent car){
		throw new UnsupportedOperationException();
	}
	public void remove(CarComponent car){
		throw new UnsupportedOperationException();
	}
	public CarComponent getChild(int i){
		throw new UnsupportedOperationException();
	}
	public String getName(){
		throw new UnsupportedOperationException();
	}
	public String getDescription(){
		throw new UnsupportedOperationException();
	}
	public double getPrice(){
		throw new UnsupportedOperationException();
	}
	public Iterator<CarComponent> createIterator(){
		throw new UnsupportedOperationException();
	}
	public void print(){
		throw new UnsupportedOperationException();
	}
	public double addPrice() {
		throw new UnsupportedOperationException();
	}
}
