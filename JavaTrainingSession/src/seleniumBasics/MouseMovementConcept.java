package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.spicejet.com/");
		wd.manage().deleteAllCookies();
		
		Actions action = new Actions(wd);
		action.moveToElement(wd.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-ubezar r-16dba41 r-1pzd9i8'] [contains(text(),'SpiceClub')]"))).build().perform();
		Thread.sleep(3000);
		wd.findElement(By.xpath("//div[@class='css-76zvg2 r-ubezar'] [contains(text(),'Benefits')]")).click();
		

	}

}
