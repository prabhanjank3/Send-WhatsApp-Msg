package services;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class WhatsappServices
{
	WebDriver driver;
	public WhatsappServices(WebDriver driver) {
		this.driver = driver;
	}
	WebElement getChatWindow(String name)
	{
		return driver.findElement(By.xpath("//span[@title = '"+name+"']"));
	}
	WebElement getChatBox()
	{
		return driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div[2]/div/div[2]"));
	}
	WebElement getSendButton()
	{
		return driver.findElement(By.xpath("//button[@class='_3M-N-']"));
	}
	public boolean isOnScanPage() 
	{
		List<WebElement> qrCodeElement = driver.findElements(By.xpath("//img[@alt = 'Scan me!']"));
		if(qrCodeElement.size()==0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}
