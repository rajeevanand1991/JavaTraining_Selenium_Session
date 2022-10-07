package seleniumBasics;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkTest {

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://ui.in.freecrm.com/"); // Pass application URL here
		
		//Dynamic wait
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("email")).sendKeys("rajeevanand1991@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Test@123");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		
		Thread.sleep(5000);
		
		//1. get the list of all the links and images: Example - 500 total
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		linksList.addAll(driver.findElements(By.tagName("img")));
		
		//get the size of complete active and broken links list:
		System.out.println("size of full links and images ---> "+linksList.size()); //size of full links and images ---> 42
		
		List<WebElement> activeLinks = new ArrayList<WebElement>(); //For example: Taking only 450 valid links of href and images
		
		//2. iterate linksList: exclude all the link/images - does not have any href attribute
		for(int i=0; i<linksList.size(); i++) {
			System.out.println(linksList.get(i).getAttribute("href"));
			if(linksList.get(i).getAttribute("href") != null && (! linksList.get(i).getAttribute("href").contains("javascript"))) { //check only valid href attributes which should not be null and ignore if url contains any javascript word inclusion
				activeLinks.add(linksList.get(i)); //Add only valid href attributes in activeLinks list
			}
		}
		
		//get the size of active links list:
		System.out.println("size of active links and images ---> "+activeLinks.size()); //size of active links and images ---> 21
		
		//3. check the href url, with httpconnection api:
		//200 - OK
		//400 - Bad Request
		//401 - Unauthorized
		//404 - Not Found
		//500 - Internal server error
		for(int j=0; j<activeLinks.size(); j++) {
			HttpURLConnection connection = (HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href")).openConnection();
			
			connection.connect();
			String response = connection.getResponseMessage(); //if the link is working good, will return OK
			connection.disconnect();
			System.out.println(activeLinks.get(j).getAttribute("href") +" ---> "+response);	
		}
	}
	/*Output:
			https://ui.in.freecrm.com/home ---> OK
			https://ui.in.freecrm.com/calendar ---> OK
			https://ui.in.freecrm.com/contacts ---> OK
			https://ui.in.freecrm.com/companies ---> OK
			https://ui.in.freecrm.com/deals ---> OK
			https://ui.in.freecrm.com/tasks ---> OK
			https://ui.in.freecrm.com/cases ---> OK
			https://ui.in.freecrm.com/calls ---> OK
			https://ui.in.freecrm.com/documents ---> OK
			https://ui.in.freecrm.com/email ---> OK
			https://ui.in.freecrm.com/campaigns ---> OK
			https://ui.in.freecrm.com/forms ---> OK
			https://ui.in.freecrm.com/settings/billing/ ---> OK
			https://ui.in.freecrm.com/contacts/c664a80c-42d4-45c2-9fcd-f6d2febe91c8 ---> OK
			https://ui.in.freecrm.com/contacts/1e57300a-b792-461a-89e8-a78a5160b4f7 ---> OK
			https://ui.in.freecrm.com/contacts/cee3c897-96f6-420c-a6aa-3e3ef3f9afdf ---> OK
			https://ui.in.freecrm.com/contacts/95aa2e7f-5749-43e4-abd6-356e17d9a80d ---> OK
			https://ui.in.freecrm.com/contacts/d997ce59-0928-414a-8f45-988b219cb54e ---> OK
			https://ui.in.freecrm.com/contacts/37d0514c-fcb4-4b19-b086-7d7b6aba8b15 ---> OK
			https://ui.in.freecrm.com/contacts/82ae6831-e597-420c-8918-71b0434db7bd ---> OK
			https://ui.in.freecrm.com/contacts/ccae715c-bc54-400c-81d7-777f50180378 ---> OK 
			
			WE CHECKED IN https://makemysushi.com/404?
			https://makemysushi.com/404?#navigation ---> Not Found
			https://makemysushi.com/ ---> OK
			https://makemysushi.com/ ---> OK
			https://makemysushi.com/sushi-university ---> OK
			https://makemysushi.com/sushi-recipes ---> OK
			https://makemysushi.com/sushi-essentials ---> OK
			https://makemysushi.com/store ---> OK
			https://makemysushi.com/404?# ---> Not Found
			https://www.facebook.com/Makemysushi/ ---> OK
			https://www.instagram.com/explore/tags/makemysushi/ ---> OK */
}