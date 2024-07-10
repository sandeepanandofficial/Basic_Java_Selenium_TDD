package testNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_2 {
	
	@Test(dataProvider = "getData")
	public void getDataDemo(String name, String model)
	{
		System.out.println("Mobile name is : " + name + " and model is : " + model);
	}
	
	@DataProvider
	public Object[][] getData() throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\DataProvider.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		int lastRow = sh.getLastRowNum();
		int lastCell = sh.getRow(1).getLastCellNum();
		
		Object[][] data = new Object[lastRow][lastCell];
		
		for(int i=1 ; i<lastRow ; i++)
		{
			for(int j=0 ; j<lastCell ; j++)
			{
				data[i][j] = sh.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return data;
	}
}
