package edu.elon.composite;

import java.util.Iterator;

public class Car {
	CarComponent allComponents;
	
	public Car(CarComponent allComponents){
		this.allComponents = allComponents;
	}
	
	public void printCar(){
		allComponents.print();
		System.out.println("\n\t\tTotal MSRP as Built: $"+allComponents.addPrice());
	}

}
