package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFindElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.crystalcruises.com/voyage-finder");
		driver.manage().window().maximize();
		//get All Elements 
		List<WebElement> allDetails = 
				driver.findElementsByClassName("info_card123");
		//get count of elements
		int size = allDetails.size();
		System.out.println(size);
		//get The First one
		WebElement firstElement = allDetails.get(0);
		//System.out.println(firstElement.getText());
		Thread.sleep(5000);
		//get The last one	
		WebElement lastElement = allDetails.get(size-1);
		System.out.println(lastElement.getText());
		
		
		
		
		
		
		
		
	}

}






