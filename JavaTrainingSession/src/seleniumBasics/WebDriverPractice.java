package seleniumBasics;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriverPractice {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
	WebDriver wd=new ChromeDriver();
	wd.get("https://www.google.co.in");
	System.out.println(wd.getTitle());
	System.out.println(wd.getCurrentUrl());
	wd.findElement(By.name("q")).sendKeys("HelloGoogle");
	Select s = new Select(wd.findElement(By.id("")));
	s.deselectByVisibleText("");
	//wd.quit();
	}

}
