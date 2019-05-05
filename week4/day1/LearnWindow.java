package week4.day1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindow {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//	driver.navigate().to("http://leaftaps.com/opentaps");
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElementByXPath("//span[text()='AGENT LOGIN']").click();
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destiny = new File("./snaps/image1.png");
		FileUtils.copyFile(source, destiny);
				driver.findElementByLinkText("Contact Us").click();

//		String currentActiveWindowRef = driver.getWindowHandle();
		
		Set<String> allWindowRef = driver.getWindowHandles();	//for getting the unique reference for current session
		List<String> listRef = new ArrayList<String>();
		listRef.addAll(allWindowRef);
		
		System.out.println("Title before switch "+driver.getTitle());
		driver.switchTo().window(listRef.get(1));
		System.out.println("Title after switch "+driver.getTitle());


		
		
		
		
		
		
		
		
		
		






























	}
}
