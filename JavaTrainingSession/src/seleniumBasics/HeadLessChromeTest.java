package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessChromeTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
		//Mandatory options:
		//1. chrome version should be greater than 59 on MAC machine and greater than 60 on Windows machine.
		//2. window-size=1400,800 ===> This mandatory to avoid NoSuchElement Exception, which is not compatible to Mobile view.
		//Also window-size not given means, running in Jenkins and Vm machines may face error.
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("window-size=1400,800");
		options.addArguments("headless");
		
		WebDriver driver = new ChromeDriver(options); //launch Chrome browser
		
		driver.get("https://freecrm.com/"); // Pass application URL here
		
		//Dynamic wait
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Thread.sleep(5000);
		System.out.println("Application launch, Their Title is ===> "+driver.getTitle());
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		
		Thread.sleep(5000);
		
		System.out.println("Login page, Title is ===> "+driver.getTitle());
		
		driver.findElement(By.name("email")).sendKeys("rajeevanand1991@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Test@123");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		Thread.sleep(2000);
		
		System.out.println("HomePage, Title is ===> "+driver.getTitle());
	}
}