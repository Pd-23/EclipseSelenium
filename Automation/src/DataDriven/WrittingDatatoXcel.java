package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WrittingDatatoXcel {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromerdriver.exe");
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis= new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet("Createcustomer").getRow(1).getCell(4).setCellValue("fail");
		FileOutputStream fos= new FileOutputStream("./data/testscript.xlsx");
		wb.write(fos);
		wb.close();
		FileInputStream fis1=new FileInputStream("./data/testscript.xlsx");
		String value = WorkbookFactory.create(fis1).getSheet("CreateCustomer").getRow(1).getCell(4).getStringCellValue();
		System.out.println(value);
	}
}
