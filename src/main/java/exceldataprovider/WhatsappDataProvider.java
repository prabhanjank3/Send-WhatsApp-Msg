package exceldataprovider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class WhatsappDataProvider {

	Properties prop;
	FileInputStream fip;
	public WhatsappDataProvider() throws IOException {
		prop = new Properties();
		fip = new FileInputStream("C:\\Users\\prabh\\eclipse-workspace\\WhatsAppSchedule\\src\\test\\java\\resources\\whatsapp.properties");
		prop.load(fip);
	}
	public String getMsgExcelPath()
	{
		return prop.getProperty("msgexcelpath");
	}
	public String getWhatsappURL()
	{
		return prop.getProperty("whatsappURL");
	}
	public String getProfileDirectory()
	{
		return prop.getProperty("profiledirectory");
	}
	public String getChromeDriverPath()
	{
		return prop.getProperty("chromedriverpath");
	}
}
