package upstestlogin;

import org.testng.annotations.Test;

import upsbasesript.BaseScript;

public class LoginTest extends BaseScript{
  
  
  @Test
  public void loginTest() {
	  testLogin().login();
	  testLogin().loginTest("test","pass");
  }
}
