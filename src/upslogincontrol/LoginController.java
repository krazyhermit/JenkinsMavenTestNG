package upslogincontrol;

import org.openqa.selenium.WebDriver;

import upsloginbase.LoginModel;

public class LoginController extends LoginControlBase{
	 
	LoginModel login=null;
	public LoginController(WebDriver driver){
		 super (driver);
		 login=new LoginModel(driver);
	 }
	
	public void login(){
		login.login().click();
	}
	
	public void loginTest(String username, String password){
		login.userName().sendKeys(username);
		login.passWord().sendKeys(password);
		
		login.submit().click();
	}

}
