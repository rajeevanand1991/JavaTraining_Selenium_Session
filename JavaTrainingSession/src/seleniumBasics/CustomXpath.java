package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.ebay.com/"); // Pass application URL here
		
		//Dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@class = 'gh-tb ui-autocomplete-input']")).sendKeys("Java");
		driver.findElement(By.xpath("//input[@id= 'gh-ac']")).clear();
		driver.findElement(By.xpath("//input[@id= 'gh-ac']")).sendKeys("Python");
		driver.findElement(By.xpath("//input[contains(@class,'gh-tb ui-autocomplete-input')]")).clear();
		driver.findElement(By.xpath("//input[contains(@class,'gh-tb ui-autocomplete-input')]")).sendKeys("Scala");
		driver.findElement(By.xpath("//a[contains(text(),' Sell')]")).click(); //clicks hyper link of the text
	}

}
