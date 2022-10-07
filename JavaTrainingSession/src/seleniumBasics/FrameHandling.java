package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().deleteAllCookies();
		wd.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		wd.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		wd.get("https://freecrm.com/");
		wd.switchTo().frame("");
		wd.findElement(By.xpath("//a[contains(text(),'Login')]"));

	}

}
