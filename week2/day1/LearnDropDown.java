package week2.day1;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		WebElement dropDown1 = driver.findElementById("dropdown1");
		Select dd = new Select(dropDown1);
		//dd.selectByVisibleText("Selenium");
		//dd.selectByValue("2");
		//dd.selectByIndex(3);
		List<WebElement> options = dd.getOptions();
		System.out.println(options.size());
		dd.selectByIndex(options.size()-1);
	}

}






