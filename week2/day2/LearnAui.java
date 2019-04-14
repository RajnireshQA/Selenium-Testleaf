package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnAui {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElementByXPath("//button[text()='✕']").click();		
		WebElement eleElectronics = driver.findElementByXPath("//span[text()='Electronics']");		 
		Actions builder = new Actions(driver);
		builder.moveToElement(eleElectronics).perform();

		Thread.sleep(500);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(
		driver.findElementByXPath("//a[text()='Apple']"))).click();
		
		
		
		
		
		/*Actions builder = new Actions(driver);
		builder.moveToElement(eleElectronics).pause(3000)
		.click(driver.findElementByXPath("//a[text()='Apple']")).perform();*/
	}

}






