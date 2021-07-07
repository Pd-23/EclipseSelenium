package com.actitime.generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * It is a generic class for data driven testing
 * @author dvdpd
 *
 */
public class Filelib {
	/**
	 * generic method to read the data from the property file
	 * @param key
	 * @return
	 * @throws IOException
	 */
public String getPropertyData(String key) throws IOException {
	FileInputStream fis= new FileInputStream("./data/commondata.property");
	Properties p= new Properties();
	p.load(fis);
	return p.getProperty(key);
}
/**
 * Generic method to read the data from eXcel Sheet
 * @param sheetname
 * @param rowNum
 * @param cellNum
 * @return
 * @throws EncryptedDocumentException
 * @throws IOException
 */
public String getExcelData(String sheetname,int rowNum,int cellNum) throws EncryptedDocumentException, IOException {
	FileInputStream fis= new FileInputStream("./data/testscript.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	return wb.getSheet(sheetname).getRow(rowNum).getCell(cellNum).getStringCellValue();
}
/**
 * Generic method to write the data in eXcel sheet
 * @param sheetname
 * @param rowNum
 * @param cellNum
 * @param data
 * @throws EncryptedDocumentException
 * @throws IOException
 */
public void setXcelData(String sheetname,int rowNum,int cellNum, String data) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream("./data/testscript.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	wb.getSheet(sheetname).getRow(rowNum).getCell(cellNum).setCellValue(data);	
	FileOutputStream fos= new FileOutputStream("./data/testscript.xlsx");
	wb.write(fos);
	wb.close();
}
}
