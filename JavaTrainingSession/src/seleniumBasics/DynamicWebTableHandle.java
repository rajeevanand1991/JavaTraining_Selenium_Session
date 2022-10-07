package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicWebTableHandle {

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
		
		//static Xpath values for all the checkboxes in the table:
		//*[@id="main-content"]/div/div[2]/div/table/tbody/tr[1]/td[2]
		//*[@id="main-content"]/div/div[2]/div/table/tbody/tr[2]/td[2]
		//*[@id="main-content"]/div/div[2]/div/table/tbody/tr[3]/td[2]
		//*[@id="main-content"]/div/div[2]/div/table/tbody/tr[4]/td[2]
		//*[@id="main-content"]/div/div[2]/div/table/tbody/tr[5]/td[2]
		
		/*Method-1: This code is for selecting checkbox Rajeev Anand value in table
		
		String before_xpath = "//*[@id=\"main-content\"]/div/div[2]/div/table/tbody/tr[";
		String after_xpath = "]/td[2]";
		
		for(int i=1;i<=5;i++) { //starting row from 1 to 5
			String name = driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
			System.out.println(name);
			if(name.contains("Rajeev Anand")) { //i=5
				//In Naveen automation labs: driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/div/table/tbody/tr["+i+"]/td[3]/input")).click();
				driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/div/table/tbody/tr[" +i+ "]/td[3]")).click();
			}
		}*/
		
		//Method-2:
		
		/*=====================================
		  HTML structure to follow steps from 1 to 4
		<td> ===> 3. third go to sibling
			<input type="checkbox"> ===> 4. Finally come to click checkbox here
		</td>

		<td> ===> 2. second go to parent
			<a> link </a> ===> 1. start from here
		</td>
		=======================================*/
		
		//This below xpath facing ElementClickInterceptedException due to ===> ::before is a pseudo element
		//driver.findElement(By.xpath("//a[contains(text(),'Naveen K')]/parent::td//preceding-sibling::td//div[@class='ui fitted read-only checkbox']/label")).click();
		
		
		
		/*For Your Information: naveen video xpath: 
		//a[contains(text(),'Naveen K')]/parent::td//preceding-sibling::td//input[@type='checkbox']
		*/
		
		//This code is for selecting checkbox Naveen K value in table
		//And I have used JavascriptExecutor due to ===> ::before is a pseudo element not actually in the DOM
		WebElement naveenChkbx = driver.findElement(By.xpath("//a[contains(text(),'Naveen K')]/parent::td//preceding-sibling::td//div[@class='ui fitted read-only checkbox']/label"));
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", naveenChkbx);
	}
}