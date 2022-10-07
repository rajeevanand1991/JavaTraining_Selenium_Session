package seleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// Pass application URL here
		driver.get("https://www.rrc.texas.gov/resource-center/research/gis-viewer/gis-popup-blocker-test/#");

		driver.findElement(By.xpath("//a[contains(text(),'RUN POPUP TEST')]")).click();

		Thread.sleep(2000);

		// To store number of window id's
		Set<String> handler = driver.getWindowHandles();

		// Iterating stored id's
		Iterator<String> it = handler.iterator();

		// moving to parent window id's
		String parentWindowId = it.next();
		System.out.println("Parent window id: " + parentWindowId);

		// moving to child window id's
		String childWindowId = it.next();
		System.out.println("Child window id: " + childWindowId);

		// now switch to child window
		driver.switchTo().window(childWindowId);

		Thread.sleep(2000);
		System.out.println("Child window popup title ===> " + driver.getTitle());
		driver.close(); // which close child window alone

		// now switch to parent window
		driver.switchTo().window(parentWindowId);
		Thread.sleep(2000);
		System.out.println("Parent window popup title ===> " + driver.getTitle());
	}
}