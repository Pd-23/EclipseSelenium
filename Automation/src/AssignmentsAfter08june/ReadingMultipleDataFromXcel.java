package AssignmentsAfter08june;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingMultipleDataFromXcel {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis= new FileInputStream("./data/testscript.xlsx");
		Sheet sheet = WorkbookFactory.create(fis).getSheet("InvalidLogin");
		int rowCount=sheet.getLastRowNum();
		int cellCount = sheet.getRow(1).getPhysicalNumberOfCells();
		for (int i = 1; i <=rowCount; i++) {
			for (int j = 0; j < cellCount; j++) {
				String value = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+"  ");
			}
			System.out.println();
		}

	}
}

