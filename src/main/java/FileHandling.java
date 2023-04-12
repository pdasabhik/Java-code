import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileHandling {

	public static void main(String[] args) throws IOException, InvalidFormatException {

		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\details.xls");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
        int rownum=sh.getLastRowNum();
		
	   for(int i=0;i<=rownum;i++) {
		   
	     Row row = sh.getRow(i);
	     int cellNum=row.getLastCellNum();
	     
	    
	      Cell cel=row.getCell(cellNum -1);	
	   System.out.println(cel.getStringCellValue());
	   }
	
	}

}
