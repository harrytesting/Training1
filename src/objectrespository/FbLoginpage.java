package objectrespository;

//import org.openqa.selenium.By;//
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLoginpage {

	WebDriver driver;
// under this line am defining a constructor 
	public FbLoginpage(WebDriver driver)

	{
		this.driver=driver;
		PageFactory.initElements(driver, this);


	}

	@FindBy(xpath="//input[@id='email']")
	WebElement userName;
	@FindBy(xpath="//input[@id='pass']")
	WebElement Password;
	@FindBy(xpath="//input[@data-testid='royal_login_button']")
	WebElement Submit;

	public WebElement Emailidpf()
	{
		return userName;
	}
	public WebElement FbPasswordpf()
	{
		return Password;
	}
	public WebElement FbLoginpf()
	{
		return Submit;
	}

	/*
	By UserName =By.xpath("//input[@id='email']");
	By Password =By.xpath("//input[@id='pass']");
	By Login =By.xpath("//input[@data-testid='royal_login_button']");


	public WebElement Emailid()
	{
		return driver.findElement(UserName);

	}

	public WebElement FbPassword ()
	{
		return driver.findElement(Password);

	}
	public WebElement FbLogin()
	{
		return driver.findElement(Login);

	}
	 */

}

