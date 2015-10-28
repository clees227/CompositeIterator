package edu.elon.composite;

import java.util.Iterator;

public class CarPart extends CarComponent {
	String name;
	String description;
	double price;
	public CarPart(String name, String description, double price){
		this.name = name;
		this.description = description;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public double getPrice() {
		return price;
	}
	public Iterator<CarComponent> createIterator(){
		return new NullIterator();
	}
	
	public double addPrice(){
		return getPrice();
	}
	
	public void print(){
		String output = "\n"+getName()+"\t"+getDescription();
		output= output + (getPrice() != 0.0 ? "\t"+"$"+getPrice() : "");
		System.out.print(output);
	}
	
	
}
