package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("https://mail.rediff.com/cgi-bin/login.cgi");
		wd.findElement(By.xpath("//input[@name=\"proceed\"]")).click();
		Alert alert = wd.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();


	}

}
