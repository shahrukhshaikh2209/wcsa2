package GenericMethode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class AllGenericMethode {
	
	
	//generic reusable method for read the data from excel sheet
    public String ReadDataExelFile(String excelpath, String sheetname,int Rowcount,int cellcount) throws EncryptedDocumentException, IOException
    {
   FileInputStream fis = new FileInputStream(excelpath);
   Workbook wb = WorkbookFactory.create(fis);
   Sheet sh = wb.getSheet(sheetname);
    Row row = sh.getRow(Rowcount);
    Cell cell = row.getCell(cellcount);
    
    String data = cell.getStringCellValue();
    return data;
	   
	}
    
    //generic reusable method for Rowcount
    
    
    public int Rowcount(String excelPath, String sheetName) throws EncryptedDocumentException, IOException
	{
    	FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		//Row row = sh.getRow(rowCount);
	      int rc = sh.getLastRowNum();
	      return rc;
	
	      
		
	}
	//generic reusable method to write the data in Excel file 
	public void WriteDataExcel(String excelPath,String sheetName,int rowCount,int cellCount,String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);//make file ready for write operation
		Sheet sh = wb.getSheet(sheetName);//go to specified sheet
		Row row = sh.getRow(rowCount);//go to the specified row
		
		Cell cell = row.createCell(cellCount);//create cell
		cell.setCellValue(data);//send data
		
		
		FileOutputStream fos = new FileOutputStream(excelPath);//specify path of excel sheet
		wb.write(fos);//write the data
		
	}
	
	//generic reusable method for read property file
	
	public String readPropertyFile(String propPath,String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(propPath);
		
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
	}
	

	
	
}


	
	
	
	
	


