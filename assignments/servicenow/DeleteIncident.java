package week5.assignments.servicenow;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class DeleteIncident extends BaseClass {
	//String incidentNumber = "INC0010021";
	@Test
	public void deleteIncident() throws InterruptedException {
		
		//Enter Newly created Incident Number in the Search 
		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys(incidentNumber,Keys.ENTER);
		//Click the Incident Link
		driver.findElement(By.linkText(incidentNumber)).click();
		//Click the Delete Button
		driver.findElement(By.xpath("//button[@id='sysverb_delete']")).click();
		//Click the Confirmation Ok Button
		driver.findElement(By.xpath("//button[@id='ok_button']")).click();
		}
}
