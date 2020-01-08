package utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import driverfactory.Chrome;

public class DriverFactory {

	public WebDriver getDriver(String driverName) throws IOException
	{
		WebDriver driver = null;
		if(driverName == "Chrome")
		{
			driver = new Chrome().getDriver();
		}
		return driver;
	}
}
