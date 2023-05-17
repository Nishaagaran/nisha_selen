package demo.ttestng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
	WebDriver driver;
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\91978\\Downloads\\chromedriver_win32 (9)\\chromedriver.exe");
	  driver=new ChromeDriver();
	  Thread.sleep(1000);
	  driver.get("https://the-internet.herokuapp.com/login");
  }
  @Test
  @Parameters({"username","password"})

  public void test(String user, String pass)
  {
	  driver.findElement(By.id("username")).sendKeys(user);
	  driver.findElement(By.id("password")).sendKeys(pass);
  }
  
  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
