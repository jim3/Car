// Car class exercise

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
		speed -= 5;
	}
}
