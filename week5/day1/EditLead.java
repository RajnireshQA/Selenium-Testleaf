package week5.day1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EditLead extends Annotations {
	@BeforeTest
	public void setData() {
		excelFileName = "edit";
	}
	@Test(dataProvider="fetchData")
	public  void runEditLead(String ph, String cn) throws InterruptedException {
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys(ph);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.findElementByLinkText("Edit").click();
		driver.findElementById("updateLeadForm_companyName").sendKeys(cn);
		driver.findElementByName("submitButton").click();
}
}






