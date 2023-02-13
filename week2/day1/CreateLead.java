package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {
	
	public void launchChromeBrowser(){
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("FirstName");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("LastName");	
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Maddy");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Mechanical");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Description");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test@abc.com");
		//driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).click();
		WebElement stateDropdown = 	driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state = new Select(stateDropdown);
		state.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	public void launchFirefoxBrowser(){
		FirefoxDriver driver = new FirefoxDriver();
		//GeckoDriverInfo driver = new GeckoDriverInfo();
		driver.get("https://www.facebook.com/");
	}

	public static void main(String[] args) {

		CreateLead launch = new CreateLead();
		launch.launchChromeBrowser();
		//launch.launchFirefoxBrowser();
		
		
		
	}

}
