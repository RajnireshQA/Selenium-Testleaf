package week3.day1;

public class MyCar {
	
	public static void main(String[] args) {
		
		BMW myCar = new BMW();
		myCar.applyBrake(); // Overridden at BMW level
		myCar.turnSunShield(); // Inherited from Car class
		myCar.soundHorn(); // Inherited from Vehicle class
		myCar.turnAC(); // the default level 2
		myCar.turnAC(3); // this increases the AC level to 3
		
	}

}
