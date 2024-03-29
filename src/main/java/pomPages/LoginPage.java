package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath="//h3[text()='Login']")
	private WebElement pageHeader;
	@FindBy(id="email")
	private WebElement usernameTF;
	
@FindBy(id="password")
private WebElement passwordTf;

@FindBy(name="login")
private WebElement loginButton;

//initialization
public LoginPage(WebDriver driver) 
{
	PageFactory.initElements(driver, this);
}

//Utilization
public String getPageHeader() {
	return pageHeader.getText();
}
public void loginToApp(String username,String password)
{ 
	usernameTF.sendKeys(username);
	passwordTf.sendKeys(password);
	loginButton.click();
}
	
}
