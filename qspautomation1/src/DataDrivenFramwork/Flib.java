package DataDrivenFramwork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	public String getExceldata(String path,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
	{
	
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
	     Sheet sh = wb.getSheet(sheetName);
	     Row row = sh.getRow(rowCount);
	    Cell cell = row.getCell(cellCount);
	    String data = cell.getStringCellValue();
	    return data;
	}
	
	
	public int getRowCount(String path,String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
	     Sheet sh = wb.getSheet(sheetName);
	    // Row row = sh.getRow(rowCount);
	      int rc = sh.getLastRowNum();
	      return rc;
		
	}
	    
	    
	    
	    
	     
		
		
	}
	

