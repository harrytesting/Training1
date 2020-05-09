package objectrespository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Pagefactory {

	WebDriver driver;

	public Pagefactory(WebDriver driver)

	{
		this.driver=driver;

	}

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
}
