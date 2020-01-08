package exceldataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import main.BaseClass;

public class ExcelDataProvider extends BaseClass {

	public ExcelDataProvider() throws IOException {
		super();
	}

	public static XSSFSheet getMsgDataSheet() throws IOException
	{
		FileInputStream fis = new FileInputStream(new File(dp.getMsgExcelPath()));
		XSSFWorkbook wb = new XSSFWorkbook(fis);   
		XSSFSheet sheet=wb.getSheetAt(0); 
		return sheet;
	}
}
