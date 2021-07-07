package DataDriven; // tried by self , not at all related to any class  


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.actitime.generics.Filelib;


public class ActitimeMultipleTest {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException {
		WebDriver driver= new ChromeDriver();
		Filelib f=new Filelib();
		driver.get(f.getPropertyData("url"));
		FileInputStream fis= new FileInputStream("./data/testscript.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("InvalidLogin");
		int rowCount = sheet.getLastRowNum();
		for (int i = 1; i < rowCount; i++) {
			short cellCount = sheet.getRow(i).getLastCellNum();
			for (int j = 0; j <cellCount; j++) {
				String text = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(text+" ");
				if(j==0) {					driver.findElement(By.id("username")).sendKeys(text);
				}
				else if(j==1) {
					driver.findElement(By.name("pwd")).sendKeys(text);
					driver.findElement(By.linkText("Login")).click();
					String title = driver.getTitle();
					driver.navigate().refresh();
					System.out.println(title);
					if(title.equals("actiTIME - Login")) {
					sheet.getRow(i).getCell(2).setCellValue("fail");
					FileOutputStream fos= new FileOutputStream("./data/testscript.xlsx");
					wb.write(fos);
					}
				}
			}
		}
	}
}
