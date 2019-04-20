package week3.day1;

//Derived class from Car
public class BMW extends Car{
	String brakeType;
	public void turnSunShield() {
		System.out.println("Sun Shield turned ON from BMW");
	}

	// Overridden method of the Vehicle class
	public void applyBrake() {
		if(brakeType.equals("normal"))
			super.applyBrake();
		else {
			// implement ABS logic here
			System.out.println("ABS Brake applied from BMW");
		}
	}


}
