package week3.day1;

public class LearnStatic {
	
	
	public int num=10;
	public static int num1 = 20;
	public static void main(String[] args) {
		LearnStatic obj = new LearnStatic();
		obj.counter();
		obj.counter();
		LearnStatic obj1 = new LearnStatic();
		obj1.counter();
		obj.counter();
		obj1.counter();
	
	}
		
	public void counter() {
		num1++;
		num++;
		System.out.println("Non static: "+num+" Static: "+num1);
	}
	
	
	public static void hologram() {
		System.out.println("Hologram available");

	}
	
	
	
	
	
	/*static {
		System.out.println("Hey I am from a static block");
	}*/
	
	
	

}
