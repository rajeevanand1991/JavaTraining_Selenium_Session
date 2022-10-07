package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopupHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("https://html.com/input-type-file/");
		Thread.sleep(10000);
		wd.findElement(By.xpath("//input[@name=\"fileupload\"]")).click();

	}

}
