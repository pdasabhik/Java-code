import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Filehandlingone {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\details.xls");
        Workbook wb = WorkbookFactory.create(fis);
	    Sheet sh = wb.getSheet("Sheet1");
	
	 int rowcount=sh.getLastRowNum();
	 System.out.println("Total number of row :"+rowcount);
	
     for(int i=0;i<rowcount;i++) {
    	Row row = sh.getRow(i);
        Cell cel = row.getCell(0);
     
   System.out.println(cel);
	}
	}
}
