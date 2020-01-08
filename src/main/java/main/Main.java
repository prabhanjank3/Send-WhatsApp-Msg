package main;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;

import services.Services;
import utilities.DriverFactory;

public class Main extends BaseClass {

	public Main() throws IOException {
		super();
	}

	public static void main(String[] args) throws IOException
	{
		
		WebDriver driver = new DriverFactory().getDriver("Chrome");
		Services serviceObject = new Services(driver);
		driver.get(dp.getWhatsappURL());
		serviceObject.getImplicitWait(15000);
		if(serviceObject.isOnScanPage())
		{
			serviceObject.getExplicitWaitforScan();
		} 
		serviceObject.sendManyMessage();
		
	}
}
