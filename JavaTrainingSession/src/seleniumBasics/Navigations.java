package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.ebay.com/"); // Pass application URL here
		
		//Dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.navigate().to("https://www.amazon.com"); //switching to external URL
		
		//Back, forward and refresh simulations
		driver.navigate().back(); // it will go back to ebay.com
		
		Thread.sleep(2000); //wait for 2 seconds
		driver.navigate().forward(); //it will come back again amazon.com
		
		Thread.sleep(2000); //wait for 2 seconds
		
		driver.navigate().back(); // it will go back to ebay.com
		
		driver.navigate().refresh(); // will refresh the current page
	}
}
