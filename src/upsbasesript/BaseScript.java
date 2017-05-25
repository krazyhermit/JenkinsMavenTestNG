package upsbasesript;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import upslogincontrol.LoginController;
import org.testng.annotations.BeforeMethod;


public class BaseScript {
	protected WebDriver driver;
	private static final String URL="https://www.ups.com/us/en/Home.page";
  
  
  @BeforeMethod
  public void beforeMethod() {
	  driver = new FirefoxDriver();
	  driver.get(URL);
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
  }
  
  public LoginController testLogin() {
	  return new LoginController(driver);
  }


  @AfterMethod
  public void afterMethod() {

  }

  

  

}
