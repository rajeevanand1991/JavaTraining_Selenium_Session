package seleniumBasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.ebay.com/"); // Pass application URL here
		
		//Dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//1. Get the total count of hyperlinks in the webpage
		//2. Get the text of each links on the page
		
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		
		/*For take the input fields
		List<WebElement> linkList = driver.findElements(By.tagName("input"));*/
		
		/*For take the button fields
		List<WebElement> linkList = driver.findElements(By.tagName("button"));*/
		
		//size of linkList
		System.out.println("Get the total count of hyperlinks is: "+linkList.size());
		
		//iterate it and in console shows Visible and Hidden links as well
		for (int i=0;i<linkList.size();i++) {
			String linkText = linkList.get(i).getText();
			System.out.println(linkText);
		}

	}

}
