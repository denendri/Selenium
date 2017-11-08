//open browser

package Package_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.thoughtworks.selenium.Wait;

public class Class6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		
	
		driver.findElement(By.linkText("REGISTER")).click();
		
		
		driver.findElement(By.name("firstName")).sendKeys("Denendri");
		driver.findElement(By.name("lastName")).sendKeys("Abeygunawardena");
		driver.findElement(By.name("phone")).sendKeys("0703889170");
		driver.findElement(By.name("userName")).sendKeys("denendri1sachintha@gmail.com");
		
		driver.findElement(By.name("address1")).sendKeys("Pittugala");
		driver.findElement(By.name("city")).sendKeys("Malabe");
		
		driver.findElement(By.name("state")).sendKeys("Western");
		driver.findElement(By.name("postalCode")).sendKeys("500");
		
	
	    Select country = new Select(driver.findElement(By.name("country")));
	    country.selectByVisibleText("SRI LANKA");
	    
	    
		driver.findElement(By.name("email")).sendKeys("denendri1sachintha@gmail.com");
		driver.findElement(By.name("password")).sendKeys("ffffff@111");
		driver.findElement(By.name("confirmPassword")).sendKeys("ffffff@111");
		
	    driver.findElement(By.name("register")).click();
	   
	    if ( driver.getTitle().contentEquals("Register: Mercury Tours"))                                 
        {
  
  System.out.println(driver.getTitle());                        

        }
else
{
  System.out.println("You are not in the correct page");        
} 

driver.findElement(By.xpath("//table/tbody/tr/td[1]/a")).click();

	}

}




