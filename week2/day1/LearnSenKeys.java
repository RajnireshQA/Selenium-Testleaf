package week2.day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSenKeys {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		Thread.sleep(8000);
		driver.findElementById("username").clear();
		driver.findElementById("username")
		.sendKeys("DemoSalesManager",Keys.ENTER);
		//driver.findElementById("password").sendKeys("crmsfa");
	
	}

}






