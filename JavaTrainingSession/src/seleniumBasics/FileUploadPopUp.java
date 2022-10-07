package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// Pass application URL here
		driver.get("https://html.com/input-type-file/");

		// type="file" should be present for Browse/AttachFile/UploadFile buttons
		driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("E:\\Selenium_Jars\\selenium-api-4.1.4.jar");
	}
}