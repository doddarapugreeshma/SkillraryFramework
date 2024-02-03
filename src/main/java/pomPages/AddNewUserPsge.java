package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewUserPsge {
//Declaration
	@FindBy(xpath="//b[text()='Add New User']")
	private WebElement pageHeader;  
	
	@FindBy(xpath="//input[@id='email' and @required]")
	private WebElement emailTf;
	
	@FindBy(xpath="//input[@id='password' and @required]")
	private WebElement passwordTf;
	
	@FindBy(xpath="//input[@id='firstname' and @required]")
	private WebElement firstnameTf;
	
	@FindBy(xpath="//input[@id='lastname' and @required]")
	private WebElement lastnameTf;
	
	@FindBy(xpath="//textarea[@id='address']")
	private WebElement addressTextArea;
	
	@FindBy(xpath="//input[@id='contact']")
	private WebElement contactInfoTf;
	
	@FindBy(xpath="(//input[@id='photo'])[2]")
	private WebElement photoUploadButton;
	@FindBy(xpath="//button[text()=' Save'and @name='add']")
	private WebElement saveButton;
	
	//Initialization
	
	public AddNewUserPsge(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//utilization
	public String getPageHeader() {
		return pageHeader.getText();
		}
	
	public void setEmail(String Email) {
		emailTf.sendKeys(Email);
	}
	public void setPassword(String Password) {
		passwordTf.sendKeys(Password);
	}
	public void setFirstname(String Firstname) {
		firstnameTf.sendKeys(Firstname);
	}
	public void setLastname(String Lastname) {
		lastnameTf.sendKeys(Lastname);
	}
	public void setAddress(String Address) {
		addressTextArea.sendKeys(Address);
	}
	public void setContactInfo(String Contact) {
		contactInfoTf.sendKeys(Contact);
	}
	public void uploadPhoto(String PhotoPath) {
		photoUploadButton.sendKeys(PhotoPath);
	}
	public void clickSave() {
		saveButton.click();
	}
	}
