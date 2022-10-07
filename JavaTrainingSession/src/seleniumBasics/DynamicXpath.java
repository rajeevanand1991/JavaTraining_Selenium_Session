package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://ui.freecrm.com/"); // Pass application URL here
		
		//Dynamic wait
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("email")).sendKeys("rajeevanand1991@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Test@123");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
		
		Thread.sleep(5000);
		
		//driver.navigate().refresh();
		
		//perform mousehover to get control on tableHeader 
		WebElement tableHeader = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/div/table/thead/tr/th[3]"));
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);

		//Performing the mouse hover action on the target element.
		action.moveToElement(tableHeader).perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='Show Filters']")).click();
		//driver.findElement(By.xpath("//b[text()='Hireteks India Private Limited']")).click();
		
		Thread.sleep(4000);
		
		//The below code not working ===> ::before is a pseudo element not actually in the DOM and facing ElementClickInterceptedException: ===> Better to use JavaScriptExecutor in this case
		driver.findElement(By.xpath("//a[text()='Rajeev Anand']//parent::td//preceding-sibling::td//div[@class='ui fitted read-only checkbox']//input")).click();
	}
}