package week5.assignments.servicenow;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
public class UpdateExistingIncident extends BaseClass {
	//String incidentNumber = "INC0010020";
	@Test
	public void updateIncident() throws InterruptedException {
		//Enter Newly created Incident Number in the Search 
		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys(incidentNumber,Keys.ENTER);
		//Click the Incident Link
		driver.findElement(By.linkText(incidentNumber)).click();
		//Change the Urgency
		WebElement urgenceElement = driver.findElement(By.id("incident.urgency"));
		Select urgenceSelect = new Select(urgenceElement);
		urgenceSelect.selectByVisibleText("1 - High");
		//Change the State
		WebElement stateElement = driver.findElement(By.id("incident.state"));
		Select stateSelect = new Select(stateElement);
		stateSelect.selectByVisibleText("In Progress");
		//Click the Update Button
		driver.findElement(By.xpath("//button[@id='sysverb_update']")).click();
		//Click the Incident Link
		driver.findElement(By.linkText(incidentNumber)).click();
		String urgencyStatus = driver.findElement(By.xpath("//select[@id='incident.urgency']//option[@selected='SELECTED']")).getText();
		System.out.println(urgencyStatus);
		String stateStatus = driver.findElement(By.xpath("//select[@id='incident.state']//option[@selected='SELECTED']")).getText();
		System.out.println(stateStatus);
		}
}
