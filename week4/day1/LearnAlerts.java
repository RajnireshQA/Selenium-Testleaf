package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlerts {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
//	driver.navigate().to("http://leaftaps.com/opentaps");
	driver.get("http://leafground.com/pages/Alert.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	driver.findElementByXPath("//button[text()='Alert Box']").click();
	Thread.sleep(3000);
	Alert alertbox = driver.switchTo().alert();
	String alertText = alertbox.getText();
	System.out.println("Alert Text: "+ alertText);
	alertbox.accept();
	
	driver.findElementByXPath("//button[text()='Confirm Box']").click();
	Thread.sleep(3000);
	driver.switchTo().alert().dismiss();
	
	driver.findElementByXPath("//button[text()='Prompt Box']").click();
	Alert promptalert = driver.switchTo().alert();
	Thread.sleep(2000);
	promptalert.sendKeys("Balaji");
	promptalert.accept();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
