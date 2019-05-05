package week5.day2;

import org.testng.annotations.Test;

public class LearnDependsOn {
	@Test(enabled=false)
	public void createlead() {
		System.out.println("CL");
		throw new RuntimeException();
		
	}
	@Test(dependsOnMethods="balaji")
	public void editlead() {
		System.out.println("EL");
	}
	@Test
	public void delLead() {
		System.out.println("DL");
	}
	@Test
	public void mergelead() {
		System.out.println("ML");
	}

}
