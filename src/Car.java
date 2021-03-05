/*
Write a class named Car that has the following fields:
# yearModel: The yearModel is an int that holds the car's year model.
# make: The make field references a String object that holdes the make of the car. For example, Ford.
# speed: The speed field is an int that holds the car's current speed.

In addition, the class should have the following constructor and other methods:
# Constructor: The constructor should accept the car's year model and make as arguments. These values
should be assigned to the object's yearModel and make fields. The constructor should assign 0 to the speed field.
# Accessors: Appropriate accessor methods should get the values stored in an object's yearModel, make, and speed fields.
# accelerate: The accelerate mthod should add 5 to the speed field each time it is called.
# brake: The brake method should subtract 5 from the speed field each time it is called.
*/

public class Car {
	private int yearModel;
	private String make;
	private int speed;

	// =================================
	// Constructors
	// =================================
	public Car (int year, String m, int speed)
	{
		yearModel = year;
		make = m;
		speed = 0;
	}
	
	// ==========================
	// get methods
	// ==========================
	public int getYear() {
		return yearModel;
	}

	public String getMake() {
		return make;
	}

	public int getSpeed() {
		return speed;
	}

	// ==========================
	// set methods
	// ==========================

	public void setYear(int yr){
		yearModel = yr;
	}

	public void setMake(String m) {
		make = m;
	}

	public void setSpeed(int spd) {
		speed = spd;
	}

	// =================================
	// accelarate & brake methods
	// =================================
	public void accelarate() {
		speed += 5;
	}

	public void brake() {
		speed += 5;
	}
}