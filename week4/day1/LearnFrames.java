package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
//	driver.navigate().to("http://leaftaps.com/opentaps");
	driver.get("http://jqueryui.com/selectable/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
//	WebElement frameElement = driver.findElementByClassName("demo-frame");
//	driver.switchTo().frame(frameElement);
	driver.switchTo().frame(0);
	driver.findElementByXPath("//li[text()='Item 1']").click();
	
	driver.switchTo().defaultContent();
	driver.findElementByLinkText("Download").click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
