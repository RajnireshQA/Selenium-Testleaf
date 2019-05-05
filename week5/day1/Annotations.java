package week5.day1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import week5.day2.LearnExcelIntegeration;
public class Annotations {
	public ChromeDriver driver;
	String excelFileName;
	@Parameters({"username","password"})
	@BeforeMethod
	public void login(String uName, String Password) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys(uName);
		driver.findElementById("password").sendKeys(Password);
		driver.findElementByClassName("decorativeSubmit").click();
	}
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
	@DataProvider(name="fetchData", indices =0)
	public String[][] getData() throws InvalidFormatException, IOException{
		return LearnExcelIntegeration
				.readExcel(excelFileName);
	}
	
	
	
	
	
	
	
	
	
	

}
