package seleniumBasics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReadPropFile {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		
		FileInputStream fis = new FileInputStream("E:\\eclipseWorkspace\\JavaTrainingSession\\src\\seleniumBasics\\config.properties");
		
		//Load the properties file
		prop.load(fis);
		
		//Read data now from property file, if proper key not give ===> will return null in this case
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		
		String url = prop.getProperty("URL");
		System.out.println(url);
		
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		
		if(browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		driver=new ChromeDriver(); //launch chrome
		} 
		
		else if(browserName.equals("firefox")) {
			System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		} 
		
		else if(browserName.equals("IE")) {
			System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\internetexplorer.exe");
			driver = new InternetExplorerDriver();
		}
		
		driver.get(url);
		
		driver.findElement(By.xpath(prop.getProperty("firstname_xpath"))).sendKeys(prop.getProperty("firstName"));
		driver.findElement(By.xpath(prop.getProperty("lastname_xpath"))).sendKeys(prop.getProperty("lastName"));
		driver.findElement(By.xpath(prop.getProperty("email_xpath"))).sendKeys(prop.getProperty("email"));
		}
}