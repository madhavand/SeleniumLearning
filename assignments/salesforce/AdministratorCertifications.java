package week5.assignments.salesforce;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AdministratorCertifications extends BaseClass {
	@Test
	public void getAdministratorCertifications() throws InterruptedException {
		//Click on Learn More link in Mobile Publisher
		driver.findElement(By.xpath("//button[@title='Learn More']")).click();
		//Get all the window handles 
		Set<String> windowHandleSet = driver.getWindowHandles();
		//Convert the Set to List to Move from Parent window to Child window
		List<String> windowHandleList = new ArrayList<String>(windowHandleSet);
		//Move the Control to Child window
		driver.switchTo().window(windowHandleList.get(1));
		//Display the child window title
		System.out.println(driver.getTitle());		
		//Click Confirm Button for Redirect to Child window
		driver.findElement(By.xpath("//button[contains(text(),'Confirm')]")).click();
		//Click Accept All Cookies Button
		driver.findElement(By.xpath("//button[text()='Accept All Cookies']")).click();
		//Move to shadow dom
		dom.findElementByXPath("//span[contains(text(),'Learning')]").click();
		//Mouse hover on Learning On Trailhead
		WebElement mouseOverElement = dom.findElementByXPath("//span[contains(text(),'Learning on Trailhead')]");
		Actions mouseOver = new Actions(driver);
		mouseOver.moveToElement(mouseOverElement).perform();	
		//Scroll to Salesforce Certification
		WebElement scrollToElement = dom.findElementByXPath("//a[contains(text(),'Salesforce Certification')]");
		Actions scroll = new Actions(driver);
		scroll.moveToElement(scrollToElement).perform();	
		//Click on Salesforce Certification
		dom.findElementByXPath("//a[contains(text(),'Salesforce Certification')]").click();
		//Click Accept All Cookies Button
		driver.findElement(By.xpath("(//button[text()='Accept All Cookies'])[2]")).click();
		//Verify the Page Title
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		if (pageTitle.contains("Administrator")) {
			System.out.println("Administrator Overview page");
		}
			else {
				System.out.println("Administrator Overview page is not displayed");
		}
		//Print the Certifications available for Administrator Certifications (List)
		List<WebElement> certifications = driver.findElements(By.xpath("//div[contains(@class,'credentials-card_title')]/a"));
		for (WebElement webElement : certifications) {
			System.out.println(webElement.getText());
		}
	}
}