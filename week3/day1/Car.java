package week3.day1;

// Derived class from Vehicle
public class Car extends Vehicle{

	public void turnAC() {
		System.out.println("AC turned ON from Car - default to level 2");
	}
	
	public void turnAC(int level) {
		System.out.println("AC turned ON from Car to level "+level);
	}

	

}
