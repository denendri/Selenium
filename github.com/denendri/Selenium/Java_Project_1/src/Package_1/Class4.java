// Explicit wait. - working

package Package_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
// import org.openqa.selenium.firefox.FirefoxDriver;

public class Class4 {

       public static void main(String[] args) throws InterruptedException {
         // TODO Auto-generated method stub
              
               System.setProperty("webdriver.chrome.driver","C:\\Dene_Sele_Proj_1\\chromedriver_win32\\chromedriver.exe");
         
         WebDriver driver = new ChromeDriver();
         driver.get("https://mail.google.com");
         
         WebDriverWait wait = new WebDriverWait(driver, 20);
         
         driver.findElement(By.id("identifierId")).sendKeys("denendri1sachintha");
         driver.findElement(By.id("identifierNext")).click();
         
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
         driver.findElement(By.name("password")).sendKeys("ffffff@111");
         driver.findElement(By.id("passwordNext")).click();
         
         
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("z0")));       
         driver.findElement(By.className("z0")).click();
         
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("vO")));       
         driver.findElement(By.className("vO")).sendKeys("testgmailid@gmail.com");        
         driver.findElement(By.className("aoT")).sendKeys("Test subject");        
         driver.findElement(By.xpath("//div[contains(@class,'editable')]")).sendKeys("Test mail body");         
         driver.findElement(By.xpath("//div[contains(text(),'Send')]")).click();

       }


}
