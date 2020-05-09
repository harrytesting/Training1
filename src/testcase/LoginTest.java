package testcase;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrespository.FbLoginpage;

public class LoginTest {

	@Test
	public void Login()
	{
		String chexePath = "C:\\Tools\\Selenium\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chexePath);
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");


		FbLoginpage fb =new FbLoginpage(driver);

		fb.Emailid().sendKeys("Priya");
		fb.FbPassword().sendKeys("abc");
		fb.FbLogin().click();






	}

}
