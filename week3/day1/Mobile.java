package week3.day1;

public class Mobile {
	// access specifier -> public, private,
	// protected, package or default
	// String -> Text - ""
	// char -> one letter - ''

	public void dialCaller(int number) {
		System.out.println("calling "+number);
	}

	public void sendSms(String name, String text) {
		System.out.println("sending SMS to "+name);
	}

	public String getColor() {
		return "black";
	}
	
	public boolean switchOn() {
		return true;
	}











}
