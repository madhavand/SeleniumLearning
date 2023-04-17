package week5.assignments.servicenow;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
public class CreateNewIncident extends BaseClass {
	@Test
	public void createNewIncident() throws InterruptedException {
		//Click New Button
		driver.findElement(By.id("sysverb_new")).click();
		//Get the Prefilled Incident Number and store 
		incidentNumber = driver.findElement(By.xpath("//input[@id='incident.number']")).getAttribute("value");
		System.out.println(incidentNumber);	
		//Enter Incident Short description
		driver.findElement(By.name("incident.short_description")).sendKeys("Batch Issue control");	
		// Click Submit Button
		driver.findElement(By.id("sysverb_insert_bottom")).click();		
		//Enter Newly created Incident Number in the Search 
		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys(incidentNumber,Keys.ENTER);
		//Click the Incident Link
		driver.findElement(By.linkText(incidentNumber)).click();
		}
}