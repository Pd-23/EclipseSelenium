package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class XcelMultipleDataReading {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromerdriver.exe");
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis= new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("InvalidLogin");
		int rowCount = sheet.getLastRowNum();
		for(int i=1;i<=rowCount;i++) {
			String un= sheet.getRow(i).getCell(0).getStringCellValue();
			String pwd= sheet.getRow(i).getCell(1).getStringCellValue();
			System.out.println(un+"  "+pwd);
		}
	}
}
