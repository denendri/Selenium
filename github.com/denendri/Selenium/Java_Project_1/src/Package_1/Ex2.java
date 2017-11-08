
package Package_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.Wait;

public class Ex2 {

	public static void main(String[] args) throws InterruptedException {
		
		Thread.sleep(100);
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.lamudi.lk/");	
		
		Thread.sleep(20);

		driver.findElement(By.xpath(".//*[@id='search-widget-tabs']/div[2]/label/span")).click();
		
		Thread.sleep(20);

		driver.findElement(By.xpath(".//*[@id='searchbar']")).sendKeys("Colombo");
		
		Thread.sleep(20);
		
		driver.findElement(By.xpath(".//*[@id='lnkSelectKit-display']/span']")).sendKeys("House");
		
		Thread.sleep(20);
		
		driver.findElement(By.xpath(".//*[@id='maximum-price']")).sendKeys("100000");
		
		Thread.sleep(20);
		
		driver.findElement(By.xpath(".//*[@id='btnSubmitSearch']")).click();
		
		Thread.sleep(20);

		driver.findElement(By.xpath(".//*[@id='pnlPropertiesListPanel']/li[1]/div/div[2]/a/img")).click();
		
		Thread.sleep(20);
		
		driver.findElement(By.xpath(".//*[@id='pnlPropertiesListPanel']/li[1]/div/div[2]/a/img")).click();
		
		Thread.sleep(20);
		
		driver.findElement(By.xpath(".//*[@id='contact_user_first_name']")).sendKeys("Denendri");
		
		Thread.sleep(20);
		
		driver.findElement(By.xpath(".//*[@id='contact_user_last_name']")).sendKeys("Abeygunawardena");
		
		Thread.sleep(20);
		
		driver.findElement(By.xpath(".//*[@id='contact_user_phone_input']")).sendKeys("0703889170");
		
		Thread.sleep(20);
		
		driver.findElement(By.xpath(".//*[@id='contact_user_email_address']")).sendKeys("denendri1sachintha@gmail.com");
		
		Thread.sleep(20);
		
		driver.findElement(By.xpath(".//*[@id='contact_user_newsletter_subscription']")).click();
		
		Thread.sleep(20);
		
	}

}




