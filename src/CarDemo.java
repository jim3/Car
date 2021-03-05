//=======================================================================
// Main.Driver.Demo
//=======================================================================
public class CarDemo {
	public static void main(String[] args) {
		Car myCar = new Car(1975, "Ford", 0);

		System.out.println("Current year and model of my car is: ");
		System.out.println(myCar.getYear());
		System.out.println(myCar.getMake());

		myCar.setYear(1969);
		myCar.setMake("Toyota");
		System.out.println("I updated my car the year and model is now: ");
		System.out.println(myCar.getYear());
		System.out.println(myCar.getMake());


		System.out.println("Now our car will acclerate in increments of 5: ");
		myCar.accelarate();
		System.out.println(myCar.getSpeed());
		myCar.accelarate();
		System.out.println(myCar.getSpeed());
		myCar.accelarate();
		System.out.println(myCar.getSpeed());
		myCar.accelarate();
		System.out.println(myCar.getSpeed());
		myCar.accelarate();
		System.out.println(myCar.getSpeed());

		System.out.println("Now our car will decelerate in increments of 5: ");
		myCar.brake();
		System.out.println(myCar.getSpeed());
		myCar.brake();
		System.out.println(myCar.getSpeed());
		myCar.brake();
		System.out.println(myCar.getSpeed());
		myCar.brake();
		System.out.println(myCar.getSpeed());
		myCar.brake();
		System.out.println(myCar.getSpeed());
	}
}
