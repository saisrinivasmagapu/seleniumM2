package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 //Declartion
public class LoginPage {
	@FindBy(name="email")
	private WebElement emailTF;
	
	@FindBy(id="password")
	private WebElement passwordTF;
	
	@FindBy (css="[type='checkbox']")
	private WebElement KeepMeLoggedInCheckBox;
	
	@FindBy(xpath="//a[text()='Forgot your password']")
	private WebElement ForgotPWDLink;
	
	@FindBy(className="Login_Btn")
	private WebElement loginBTN;

	
	// Initalization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	// Utilization
		public void setEmail(String email) {
			emailTF.sendKeys(email);
		 
		public void setPassword(String pwd) {
			passwordTF.sendKeys(pwd);
			
		public void clickKeepMeLoggedIn() {
			KeepMeLoggedInCheckBox.click();
			
			
		}
		}
		}
	}
		
	
	
	
}
}
