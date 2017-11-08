//gmail Mail Composing - working

package Package_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.Wait;

public class Class2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://mail.google.com");
		
		driver.findElement(By.id("identifierId")).sendKeys("denendri1sachintha");
		driver.findElement(By.id("identifierNext")).click();
		
		Thread.sleep(5000);
	
		driver.findElement(By.name("password")).sendKeys("give password");
		driver.findElement(By.id("passwordNext")).click();
		
		Thread.sleep(10000);
		
		driver.findElement(By.className("z0")).click();
		
		Thread.sleep(10000);
		
		driver.findElement(By.className("vO")).sendKeys("dabeygunawardena@gmail.com");
		
		driver.findElement(By.className("aoT")).sendKeys("subject");

		
		driver.findElement(By.xpath("//div[contains(@class,'editable')]")).sendKeys("body");
		
		driver.findElement(By.xpath("//div[contains(text(),'Send')]")).click();

	}

}




