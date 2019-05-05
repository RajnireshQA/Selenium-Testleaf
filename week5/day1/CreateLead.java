package week5.day1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateLead
extends Annotations{
	@BeforeTest
	public void setData() {
		excelFileName = "createleadData";
	}
	
	@Test(dataProvider="fetchData")
	public void runCreateLead(String cName, String fName, String lName) {
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
		driver.findElementByName("submitButton").click();

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}






