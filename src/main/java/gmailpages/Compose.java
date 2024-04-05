package gmailpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Compose {

	WebDriver driver;
	
	@FindBy(xpath = "//*[text()='Use another account']")
	WebElement signInButton;
	@FindBy(xpath = "//*[@type='email']")
	WebElement email;
	@FindBy(xpath = "//*[text()='Next']")
	WebElement next1;
	@FindBy(xpath = "//*[@type='password']")
	WebElement password;
	@FindBy(xpath = "//*[text()='Next']")
	WebElement next2;
	@FindBy(xpath = "//*[text()='Compose']")
	WebElement composeButton;
	@FindBy(xpath = "//*[text()='New Message']")
	WebElement newMessage;
	@FindBy(xpath = "//*[@class='agP aFw']")
	WebElement toField;
	@FindBy(xpath = "//*[@class='aoD az6']")
	WebElement subjectField;
	@FindBy(xpath = "//*[@id=':r6']")
	WebElement messageArea;
	@FindBy(xpath = "//*[@id=':pm']")
	WebElement sendButton;
	
	public Compose(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	public void clickOnsignIn() {
		signInButton.click();
	}
	public String navigateToSignInPage() {
	String pageTitle = driver.getTitle();
	return pageTitle;
	}
	public void enterEmail() {
		email.sendKeys("test@gmail.com");
	}
	public void clickOnNext1() {
		next1.click();
	}
	public void enterPassword() {
		password.sendKeys("Test@123");
	}
	public void clickOnNext2() {
		next2.click();
	}
	public String navigateToInbox() {
		String pageTitle =driver.getTitle();
		return pageTitle;
	}
	public void clickOnComposeButton() {
		composeButton.click();
	}
	public String newMessageWindowOpen() {
		String newM =newMessage.getText();
		return newM;
	}
	public void enterAEmail() {
		toField.click();
		toField.sendKeys("testuser@gmail.com");
	}
	public void enterSubject() {
		subjectField.click();
		subjectField.sendKeys("|| test subject ||");
	}
	public void enterMessage() {
		messageArea.sendKeys("Text Message");
	}
	public void clickOnSendButton() {
		sendButton.click();
	}
	
	
	
	
}
