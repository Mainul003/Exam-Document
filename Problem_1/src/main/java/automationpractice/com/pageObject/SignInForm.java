package automationpractice.com.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.Utils;

public class SignInForm {
	
	private WebDriver driver;
	
	public SignInForm(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getSignInForm() {
		return Utils.waitForElementPresence(driver, By.id("login_form"), 30);
	}
	
	public WebElement getSignInEmailField() {
		return Utils.waitForElementPresence(driver, By.id("email"), 30);
	}
	
	public WebElement getSignInPasswordField() {
		return Utils.waitForElementPresence(driver, By.id("passwd"), 30);
	}
	
	public WebElement getSignInBtn() {
		return Utils.waitForElementPresence(driver, By.id("SubmitLogin"), 30);
	}
	
	
	public void setEmailField(String mail) {
		WebElement email = this.getSignInEmailField();
		email.clear();
		email.sendKeys(mail);
	}
	
	public void setPasswordField(String pass) {
		WebElement password = this.getSignInPasswordField();
		password.clear();
		password.sendKeys(pass);
	}


}
