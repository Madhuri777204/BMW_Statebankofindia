package demopractice;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Mouseover {

	public WebDriver driver;
	
	
	
  @Test
  public void function() throws InterruptedException {
	  
	  driver.findElement(By.xpath("//button[normalize-space()='Round Trip']")).click();
	  
	  Thread.sleep(5000);
	  
	  driver.findElement(By.xpath("//button[normalize-space()='Local']")).click();
	  
	  Thread.sleep(5000);
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.savaari.com/");
	  driver.manage().window().maximize();
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.quit();
  }

}
