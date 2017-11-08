package Package_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.Wait;

public class Exercise1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.hitad.lk/");
		
		Thread.sleep(10);
		
		driver.findElement(By.xpath(".//*[@id='home']/div[6]/div/div[2]/div[1]/span[1]/a")).click();

		Thread.sleep(10);
		
		driver.findElement(By.xpath(".//*[@id='topseelerimg']/div/div[2]/div/div[1]/a/h4")).click();

		Thread.sleep(10);
		
		driver.findElement(By.xpath(".//*[@id='ad-detail']/div[6]/div[4]/div/ul/li[1]/button")).click();
		
	}

}




