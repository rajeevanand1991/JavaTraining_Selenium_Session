package seleniumBasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropBoxHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2"); // Pass application URL here
		
		//Dynamic wait
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		
		//We are collecting all the list values of webelement in the Bootstrap dropdown 
		List<WebElement> list = driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//li//a//label"));
		System.out.println(list.size()); //Get the size
		
		List<WebElement> list1 = driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//li"));
		System.out.println(list1.size()); //Get the size
		
		//To check all the values, the below approach was not given check which is default check of HTML and CSS
		
		//For the already selected options, we can't use isSelected() method. 
		//Because this method always returns false. 
		/*for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).isSelected()) {
				
			}
			else {
				list.get(i).click();
			}
		}*/
		
		//So we have to use the li-class which changes the class name to "active" when the checkbox is selected. 
		//So we can select all the checkboxes without unselecting the already selected ones by using below logic.
		//APPROACH 1 TO SELECT ALL VALUES
		/*for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i).getText());
			  if ((list1.get(i).getAttribute("class").equalsIgnoreCase("active"))) {
			   System.out.println("Already Active, so we won't touch this checkbox: "+list.get(i).getText());
			   Thread.sleep(1000);
			  } else {
				  list1.get(i).click();
			  }
		}*/
		
		//APPROACH 2 TO SELECT ALL VALUES by for-each loop
		/*List<WebElement> elements = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//li"));
		for (WebElement ele : elements) {
			System.out.println(ele.getAttribute("class").equalsIgnoreCase("active"));
			if (ele.getAttribute("class").equalsIgnoreCase("active")) {
				System.out.println(ele.getText());
			} else {
				ele.click();
			}
		}*/
		
		//This for loop is for iterating and select only Angular checkbox alone in Bootstrap dropdown
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("Angular")) {
				list.get(i).click();
				break;
			}	
		}
	}
}