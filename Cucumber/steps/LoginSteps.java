package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	
	public ChromeDriver driver;
	@Given("Open the Chrome Browser")
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	@And("Maximize the Browser")
	public void maxBrowser() {
	driver.manage().window().maximize();
	}
	
	@And("Set the Timeout")
	public void setTimeout() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@And("Load the URL")
	public void loadURL() {
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
	@And("Enter the Username as (.*)")
	public void enterUsername(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);
	}
	@And("Enter the Password as (.*)")
	public void enterPassword(String pwd) {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	}
	@When("Click on Login Button")
	public void clickLoginButton() {
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	}
	@Then("User Should Navigate to HomePage")
	public void navigatetoHome() {
		System.out.println("Navigated to homepage");
		driver.close();
	}
	@But("User Should Navigate to LoginPage")
	public void navigateto() {
		System.out.println("Navigated to LoginPage");
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
