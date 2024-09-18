package demopractice;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Assert_practice {
	
	public WebDriver driver;
	
  @Test
  public void function() {
	  
	  String Actualtitle = "DEMO";
	  String Expectedtitle = driver.getTitle();
	  System.out.println(Expectedtitle);
	  
	  System.out.println("kinnu");
	  
	  System.out.println("Madhu");
	  
	  Assert.assertEquals(Actualtitle, Expectedtitle);
	  
	  System.out.println("Madhuri");
	  
	  driver.quit();
	  
	  
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://demoqa.com/forms");
	  driver.manage().window().maximize();
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
