package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileWrite {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fileInput = new FileInputStream(".\\src\\test\\resources\\ExcelFileWrite.xlsx");
		
		Workbook workbook = WorkbookFactory.create(fileInput);
		
		Sheet sheet = workbook.createSheet("Demo");
		
		Row row = sheet.createRow(2);
		
		Cell cell = row.createCell(5);
		
		cell.setCellValue("Saktiman");
		
		FileOutputStream fileOutput = new FileOutputStream(".\\src\\test\\resources\\ExcelFileWrite.xlsx");
		
		workbook.write(fileOutput);
		
		System.out.println("Data written successfully");
		
		String data = cell.getStringCellValue();
		
		System.out.println(data);
	}
}
