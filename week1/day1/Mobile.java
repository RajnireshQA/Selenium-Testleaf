package week1.day1;

public class Mobile {
	// access specifier -> public, private,
	// protected, package or default
	// String -> Text - ""
	// char -> one letter - ''
	public String model = "oneplus";
	public short ram = 4;
	boolean hasFaceReg = true;

	public void dialCaller(int number) {
		System.out.println("calling "+number);
	}

	public void sendSms(String name, String text) {
		System.out.println("sending SMS to "+name);
	}

	public String getColor() {
		return "black";
	}
	// method overloading -> 
	// same methodName with different arguments
	
	public String getColor(String brand) {
		if(brand.equals("nokia"))
			return "white";
		else 
			return "silver";
	}












}
