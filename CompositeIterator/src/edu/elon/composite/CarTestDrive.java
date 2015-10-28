package edu.elon.composite;

public class CarTestDrive {

	public static void main(String[] args) {
		CarComponent summary = new CarCategory("Summary");
		CarComponent model = new CarCategory("Model");
		CarComponent modelType = new CarPart("2015 CR-Z EX", "Manual", 21990.00);
		model.add(modelType);
		CarComponent colors = new CarCategory("Colors");
		CarComponent exterior = new CarPart("Exterior: Milano Red", "", 0);
		CarComponent interior = new CarPart("Interior: Black/Red", "", 0);
		colors.add(exterior);
		colors.add(interior);
		CarComponent accessories = new CarCategory("Accessories");
		CarComponent aExterior = new CarCategory("Exterior");
		CarComponent sideSpoilers = new CarPart("Side Spoilers", "", 520.00);
		aExterior.add(sideSpoilers);
		CarComponent aInterior = new CarCategory("Interior");
		CarComponent armrest = new CarPart("Armrest", "", 393.00);
		aInterior.add(armrest);
		CarComponent electronic = new CarCategory("Electronic");
		CarComponent xM = new CarPart("XM Radio", "", 313.00);
		CarComponent dest = new CarPart("Destination and Handling","", 820.00);
		electronic.add(xM);
		electronic.add(dest);
		aInterior.add(electronic);
		accessories.add(aExterior);
		accessories.add(aInterior);
		summary.add(model);
		summary.add(colors);
		summary.add(accessories);
		Car car = new Car(summary);
		car.printCar();
	}

}
