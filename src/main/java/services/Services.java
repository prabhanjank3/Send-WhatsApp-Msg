package services;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import exceldataprovider.ExcelDataProvider;
import main.BaseClass;
import utilities.DriverFactory;

public class Services extends BaseClass {
	WebDriver driver;
	WhatsappServices wserviceObject;
	public Services(WebDriver driver) throws IOException
	{
		super();
		this.driver = driver;
		wserviceObject = new WhatsappServices(driver);
	}
	
	public void getImplicitWait(int waitTimeMillisec)
	{
		driver.manage().timeouts().implicitlyWait(waitTimeMillisec, TimeUnit.MILLISECONDS);
	}
	public void getExplicitWaitforScan()
	{
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	}
	public boolean isOnScanPage() 
	{
		return wserviceObject.isOnScanPage();
	}
	void clickElement(WebElement element)
	{
		element.click();
	}
	void enterInput(WebElement element, String message)
	{
		element.sendKeys(message);
	}

	public void sendMessage(String name, String message)
	{
		WebElement nameTab = wserviceObject.getChatWindow(name);
		clickElement(nameTab);
		getImplicitWait(2000);
		WebElement chatBox = wserviceObject.getChatBox();
		enterInput(chatBox, message);
		getImplicitWait(2000);
		WebElement sendButton = wserviceObject.getSendButton();
		clickElement(sendButton);
	}
	public void sendManyMessage() throws IOException
	{
		ExcelDataProvider exdp = new ExcelDataProvider();
		XSSFSheet sheet = exdp.getMsgDataSheet();
		for(int j=1;j<=sheet.getLastRowNum();j++)
		{
			Row row = sheet.getRow(j);
			sendMessage(row.getCell(0).getStringCellValue(), row.getCell(1).getStringCellValue());
			getImplicitWait(2000);
		}
	}
	
}
