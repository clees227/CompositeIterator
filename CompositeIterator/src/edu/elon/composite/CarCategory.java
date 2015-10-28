package edu.elon.composite;

import java.util.ArrayList;
import java.util.Iterator;

public class CarCategory extends CarComponent {
	private ArrayList<CarComponent> carComponents;
	private String name;
	public CarCategory(String name){
		carComponents = new ArrayList<CarComponent>();
		this.name = name;
	}
	public void add(CarComponent carComponent){
		carComponents.add(carComponent);
	}
	public void remove(CarComponent carComponent){
		carComponents.remove(carComponent);
	}
	public CarComponent getChild(int i){
		return carComponents.get(i);
	}
	public String getName() {
		return name;
	}
	public double getPrice(){
		return 0;
	}
	public void print(){
		System.out.print("\n"+getName());
		Iterator<CarComponent> iterator = carComponents.iterator();
		while(iterator.hasNext()){
			CarComponent carComponent = iterator.next();
			carComponent.print();
		}
	}
	
	public double addPrice(){
		double sum = getPrice();
		Iterator<CarComponent> iterator = carComponents.iterator();
		while(iterator.hasNext()){
			CarComponent carComponent = iterator.next();
			sum += carComponent.addPrice();
		}
		return sum;	
	}
	
	public Iterator<CarComponent> createIterator(){
		return carComponents.iterator();
	}
	

}
