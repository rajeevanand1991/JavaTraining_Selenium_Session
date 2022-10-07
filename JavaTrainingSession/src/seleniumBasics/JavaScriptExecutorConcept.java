package seleniumBasics;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://freecrm.com/"); // Pass application URL here
		
		//Dynamic wait
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("email")).sendKeys("rajeevanand1991@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Test@1232");
		//driver.findElement(By.xpath("//div[text()='Login']")).click();
		
		WebElement loginBtn = driver.findElement(By.xpath("//div[text()='Login']"));
		
		flash(loginBtn, driver); //highlight the element
		Thread.sleep(2000);
		
		drawBorder(loginBtn, driver); //draw a border
		Thread.sleep(2000);
		
		//Take screenshot and store as a file format
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//now copy the screenshot to desired location using copyFile() method
		FileUtils.copyFile(src, new File("E:\\eclipseWorkspace\\JavaTrainingSession\\src\\seleniumBasics\\element.jpg"));
		
		//generate alert
		generateAlert(driver, "There is an issue with login button on login page");
		
		//accept alert
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		//click login button using JavaScriptExecutor
		clickElementByJS(loginBtn, driver);
		
		//Refresh the page
		//1. by using Selenium:
		driver.navigate().refresh();
		
		//2. by using JavaScriptExecutor
		refreshBrowserByJS(driver);
		
		// Get the title of the page using JavaScriptExecutor 
		System.out.println(getTitleByJS(driver));
		
		//Get the page InnerText
		System.out.println(getPageInnerText(driver));
		
		//scroll page down
		scrollPageDown(driver);
		
		//scroll until Forgot your password? webelement link 
		WebElement forgotPwdLink = driver.findElement(By.xpath("//a[contains(text(),'Forgot your password?')]"));
		scrollIntoView(forgotPwdLink, driver);
	}
	
	public static void flash(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String bgColor = element.getCssValue("backgroundColor"); //String bgColor returns rgba(33, 133, 208, 1) which is red green blue alpha
		for(int i = 0; i < 100; i++) { //highlight for 100 times
			changeColor("rgb(0,200,0)", element, driver); //1 change to green color
			changeColor(bgColor, element, driver); //2 again back to button background color
		}
	}
	
	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor = '"+color+"'", element);
		
		try {
			Thread.sleep(20);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void drawBorder(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	
	public static void generateAlert(WebDriver driver, String message) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("alert('"+message+"')");
	}
	
	public static void clickElementByJS(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element);
	}
	
	public static void refreshBrowserByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("history.go(0)");
	}
	
	public static String getTitleByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String title = js.executeScript("return document.title;").toString();
		return title;
	}
	
	public static String getPageInnerText(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String pageText = js.executeScript("return document.documentElement.innerText;").toString();
		return pageText;
	}
	
	public static void scrollPageDown(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	public static void scrollIntoView(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}	
}