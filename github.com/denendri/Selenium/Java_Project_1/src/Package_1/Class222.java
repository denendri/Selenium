//gmail login - working

package Package_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.Wait;

public class Class222 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Dene_Sele_Proj_1\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.lamudi.lk/");
		
		Thread.sleep(10);

		driver.findElement(By.xpath(".//*[@id='search-widget-tabs']/div[2]/label/span")).click();
		
		Thread.sleep(10);
/*
		driver.findElement(By.xpath(".//*[@id='searchbar']")).sendKeys("Colombo");
		
		Thread.sleep(10);
		
		driver.findElement(By.xpath(".//*[@id='lnkSelectKit-display']/span']")).sendKeys("House");
		
		Thread.sleep(10);
		
		driver.findElement(By.xpath(".//*[@id='maximum-price']")).sendKeys("100000");
		
		Thread.sleep(10);
		
		driver.findElement(By.xpath(".//*[@id='btnSubmitSearch']")).click();
		
		Thread.sleep(10);

		driver.findElement(By.xpath(".//*[@id='pnlPropertiesListPanel']/li[1]/div/div[2]/a/img")).click();
		
		Thread.sleep(10);
		
		driver.findElement(By.xpath(".//*[@id='pnlPropertiesListPanel']/li[1]/div/div[2]/a/img")).click();
		
		Thread.sleep(10);
		
		driver.findElement(By.xpath(".//*[@id='contact_user_first_name']")).sendKeys("Denendri");
		
		Thread.sleep(10);
		
		driver.findElement(By.xpath(".//*[@id='contact_user_last_name']")).sendKeys("Abeygunawardena");
		
		Thread.sleep(10);
		
		driver.findElement(By.xpath(".//*[@id='contact_user_phone_input']")).sendKeys("0703889170");
		
		Thread.sleep(10);
		
		driver.findElement(By.xpath(".//*[@id='contact_user_email_address']")).sendKeys("denendri1sachintha@gmail.com");
		
		Thread.sleep(10);
		
		driver.findElement(By.xpath(".//*[@id='contact_user_newsletter_subscription']")).click();
		
		Thread.sleep(10);
		
		*/

		
	}

}




