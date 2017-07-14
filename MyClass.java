package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;

public class MyClass {
	public static void main (String [] args)throws InterruptedException{
		System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "https://www.google.com.vn/";
		String expectedTitle = "Google";
		String actualTitle = "";
		
		driver.get(baseUrl);
		actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		if(actualTitle.contentEquals(expectedTitle)){
			System.out.println("Pass!");
		}
		else 
			System.out.println("Fail!");
			
		driver.get("http://only-testing-blog.blogspot.in/2013/09/test.html");
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		WebElement element = driver.findElement(By.linkText("Facebook"));
		element.click();
		Thread.sleep(5000);
		driver.navigate().back();
		
		driver.findElement(By.xpath(".//*[@id='post-body-6522850981930750493']/div[1]/button")).click();
		String alerMessage = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println(alerMessage);
		
		driver.close();
	}
}
