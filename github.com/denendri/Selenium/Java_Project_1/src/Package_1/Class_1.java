//open browser

package Package_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.Wait;

public class Class_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		
		driver.findElement(By.id("lst-ib")).sendKeys("Selenium HQ");
		driver.findElement(By.id("lst-ib")).submit();
		
		driver.findElement(By.linkText("Selenium - Web Browser Automation")).click();
		
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		Thread.sleep(10000);
		
		String title = driver.getTitle();
		
		String pageTitle = "Selenium - Web Browser Automation";
		
		System.out.println(title);
		System.out.println(pageTitle);
		
		if (title.contentEquals(pageTitle))
		
			
				{
			
			System.out.println("pass");				

				}
		else
		{
			System.out.println("not pass");		
		}
	//  driver.close();

	}

}




