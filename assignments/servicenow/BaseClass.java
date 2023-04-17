package week5.assignments.servicenow;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.sukgu.Shadow;

public class BaseClass {
	
	public ChromeDriver driver;
	public static String incidentNumber;
	public Shadow dom;
	@BeforeMethod
	public void preConditions() {
		//Launch the Chrome Browser
		driver  = new ChromeDriver();
		//Maximize the window
		driver.manage().window().maximize();
		//Launch the URL
		driver.get("https://dev157366.service-now.com");
		//Implicit wait for all Elements
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Enter Username details
		driver.findElement(By.id("user_name")).sendKeys("admin");
		//Enter Password
		driver.findElement(By.id("user_password")).sendKeys("626445@Tl");
		//Click Login Button		
		driver.findElement(By.id("sysverb_login")).click();
		//Using Shadow 
		 dom = new Shadow(driver);
		//Shadow DOM implicit
		dom.setImplicitWait(30);
		//Enter Incidents in Navigator Pane
		dom.findElementByXPath("//input[@id='filter']").sendKeys("Incidents",Keys.ENTER);
		//Click the Incidents text Link
		dom.findElementByXPath("//mark[text()='Incidents']").click();
		//Get the Frame details in WebElement
		WebElement iframe = dom.findElementByXPath("//iframe[@id='gsft_main']");
		//Switch to Frame
		driver.switchTo().frame(iframe);
	}
	@AfterMethod
	public void postConditions() {
		//Close the Browser
		driver.close();
		
	}

}
