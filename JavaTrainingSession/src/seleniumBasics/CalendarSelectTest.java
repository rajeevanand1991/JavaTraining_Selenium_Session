package seleniumBasics;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CalendarSelectTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://ui.freecrm.com/"); // Pass application URL here
		
		//Dynamic wait
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Thread.sleep(8000);
		
		driver.findElement(By.name("email")).sendKeys("rajeevanand1991@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Test@123");
		driver.findElement(By.xpath("//div[text()='Login']")).click(); //login button
		
		/*This below frame is present while naveen prepared videos, but currently not available
		driver.switchTo().frame("mainpanel");*/
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Calendar')]")).click();
		
		Thread.sleep(5000);
		
		//perform mousehover to get control on tableHeader 
		WebElement synBtn = driver.findElement(By.xpath("//button[contains(text(),'Sync now')]"));
				
		//Creating object of an Actions class
		Actions action = new Actions(driver);

		//Performing the mouse hover action on the target element.
		action.moveToElement(synBtn).perform();
		
		String date = "30-September-2022";
		String[] dateArr = date.split("-"); //{18, September, 2022}
		String day = dateArr[0];
		String month = dateArr[1];
		String year = dateArr[2];
		
		/*This below select class is present while naveen prepared videos, but currently not available
 		Select select = new Select(driver.findElement(By.name("slctMonth")));
		select.selectByVisibleText(month);
		
		Select select1 = new Select(driver.findElement(By.name("slctMonth")));
		select.selectByVisibleText(year);*/
		
		/*This below xpath locators is present while naveen prepared videos, but currently not available
		//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]
		//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]
		//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[6] 
		*/
		 
		// This below Xpath is present not, while i prepare this script
		//*[@id="main-content"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/div/div[1]/a
		//*[@id="main-content"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/div/div[2]/a
		//*[@id="main-content"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/div/div[3]/a
		//*[@id="main-content"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/div/div[7]/a
		//*[@id="main-content"]/div/div[2]/div/div[2]/div/div[2]/div[3]/div[2]/div/div[1]/a
		//*[@id="main-content"]/div/div[2]/div/div[2]/div/div[2]/div[6]/div[2]/div/div[7]/a
		
		String beforeXpath = "//*[@id=\"main-content\"]/div/div[2]/div/div[2]/div/div[2]/div[";
		String afterXpath = "]/div[2]/div/div[";
		final int totalWeekDays = 7;
		
		String monthYear=driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/div/div[2]/div/div[1]/span[2]")).getText();
		System.out.println("Current month and year =====> "+monthYear);
		String[] currentDateArr = monthYear.split(" "); //September 2022
		String currentMonth = currentDateArr[0];
		System.out.println("Current month ===> " +currentMonth);
		String currentYear = currentDateArr[1];
		
		//for loop execution way:
		//row 2- col1 2-2 2-3 2-4 2-5 2-6 2-7
		//3-1 3-2 3-3 3-4 3-5 3-6 3-7
		// In my case rowNum have only 6 maximum, if i gave more than that, i faced NoSuchElementException
		
		/* This is i tried for valid current September month property value of div class='rbc-date-cell'
		String validDateinUI= driver.findElement(By.xpath("//div[@class='rbc-date-cell']")).getText();
		List<WebElement> validDateinUI = driver.findElements(By.xpath("//div[@class='rbc-date-cell']"));
		System.out.println("validDateinUI =============> "+validDateinUI);
		System.out.println("Size of validDateinUI =============> "+validDateinUI.size());
		ArrayList<String> validDates = new ArrayList<String>();*/
		
		boolean flag=false;
		String dayValue = null;
		String validDateCell = "rbc-date-cell";
		String InValidDateCell = "rbc-date-cell rbc-off-range";
		
		/*This is i tried for valid current September month property value of div class='rbc-date-cell'
		for(int validDts=0;validDts<validDateinUI.size();validDts++) {
			validDates.add(validDateinUI.get(validDts).getText());
		}
		System.out.println("validDates ~~~~~~~~=======> "+validDates);*/
		
		for(int rowNum=2; rowNum<=6; rowNum++) {
			for(int colNum=1; colNum<=totalWeekDays; colNum++) {
				try {
					dayValue = driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNum+"]/a")).getText();
					System.out.println(dayValue);
				}catch (NoSuchElementException e) {
					System.out.println("Please enter a correct date value");
					flag=false;
					break;
				}
				
				String currentDateCell = driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNum+"]")).getAttribute("class");
				System.out.println("~~~~~~ Current Date Cell ~~~ ==========> "+currentDateCell);
				
				/*I tried this below condition before and div class not taken for current date which is 'rbc-date-cell rbc-now rbc-current'
				if(dayValue.equals(day) && currentMonth.equals(month) && currentDateCell.equals(validDateCell)) {*/
				if(dayValue.equals(day) && currentMonth.equals(month) && !currentDateCell.equals(InValidDateCell)) {
					//if(dayValue == driver.findElement(By.xpath("//div[@class='rbc-date-cell']")).getText()) {
					driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNum+"]/a")).click();
					flag=true; //Now our date got clicked, hence we make flag as true
					break; //Simply avoid checking other column data when our date was clicked
					}
				}
			//}
			
			if(flag) { //flag check is not to terminate without checking rows 3 to 7 (if break given directly, then it wont check rows 3 to 7)
				break;
			}
		}
	}
}