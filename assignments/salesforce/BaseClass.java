package week5.assignments.salesforce;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.sukgu.Shadow;

public class BaseClass {
	
	public ChromeDriver driver;
	public static String incidentNumber;
	public Shadow dom;
	@BeforeMethod
	public void preConditions() {
		//Disable Notifications
		ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-notifications");
		//Launch the Chrome Browser
		driver  = new ChromeDriver(options);
		//Maximize the window
		driver.manage().window().maximize();
		//Launch the URL
		driver.get("https://login.salesforce.com");
		//Implicit wait for all Elements
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Enter Username details
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		//Enter Password
		driver.findElement(By.id("password")).sendKeys("Leaf@123");
		//Click Login Button		
		driver.findElement(By.id("Login")).click();
		//Using Shadow 
		 dom = new Shadow(driver);
		//Shadow DOM implicit
		dom.setImplicitWait(30);
			}
	@AfterMethod
	public void postConditions() {
		//Close the Browser
		//driver.close();
		
	}

}
