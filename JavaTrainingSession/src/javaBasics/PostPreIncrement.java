package javaBasics;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PostPreIncrement {

	public static void main(String[] args) {
		int i=5;
		System.out.println(i);
		i++; // Post-Increment i+1=5+1=6
		System.out.println(i); //6
		++i; //i+1=6+1=7
		System.out.println(i); //7
		System.out.println("*****************");
		int j=3,k;
		k=j++; // K=3,j=4
		System.out.println("The Post-Increment for value of K is "+k +" and J is " +j);
		k=j++; //k=4,j=5
		System.out.println("The Post-Increment for value of K is "+k +" and J is " +j);
		k=++j; //k=6,j=6
		System.out.println("The Pre-Increment for value of K is "+k +" and J is " +j);
		k=++j; //k=7,j=7
		System.out.println("The Pre-Increment for value of K is "+k +" and J is " +j);
		System.out.println("=========================================");
		int m=2;
		int n=m--;
		System.out.println(m);
		System.out.println(n);
		int p=2;
		int q=--p;
		System.out.println(p);
		System.out.println(q);
		/*WebDriver driver = new ChromeDriver();
		List l;
		WebElement s=driver.findElement(By.tagName("s"));*/
	}

}
