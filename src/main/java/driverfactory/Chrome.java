package driverfactory;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import main.BaseClass;

public class Chrome extends BaseClass{

	public Chrome() throws IOException {
		super();
	}
	ChromeDriver driver = null;
	ChromeOptions options = new ChromeOptions();
	void setSystemProperty()
	{
		System.setProperty("webdriver.chrome.driver", dp.getChromeDriverPath());
	}
	public WebDriver getDriver()
	{
		if(driver == null)
		{
			setSystemProperty();
			String dir= dp.getProfileDirectory();
		    options.addArguments("user-data-dir="+dir);
			driver = new ChromeDriver(options);
		}
		return driver;
	}
}
