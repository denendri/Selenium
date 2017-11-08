//gmail login - working

package Package_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.Wait;

public class Class3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Dene_Sele_Proj_1\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com");
		
		driver.findElement(By.id("identifierId")).sendKeys("denendri1sachintha");
		driver.findElement(By.id("identifierNext")).click();
		
		Thread.sleep(10000);
	
		driver.findElement(By.name("password")).sendKeys("ffffff@111");
		driver.findElement(By.id("passwordNext")).click();
		
		Thread.sleep(10000);
		
	}

}




