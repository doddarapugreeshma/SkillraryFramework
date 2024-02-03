package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCategoryPage {
//declaration
	
	@FindBy(xpath="//b[text()='Add New Category']")
private WebElement pageHeader;
	
	@FindBy(id="name")
	private WebElement nameTf;
	
	@FindBy(xpath="//button[text()=' Save' and @name='add']")
	private  WebElement saveButton;
	
	//Initialization
	
	public AddNewCategoryPage(WebDriver driver) {
		PageFactory.initElements(driver, this );
	}
	//UtiliZation
	
	public String getPageHeader() {
		return pageHeader.getText();
		
	}
	public void setName(String courseName) {
		nameTf.sendKeys(courseName);
	}
	
	public void clickSave() {
		saveButton.click();
	}
}
