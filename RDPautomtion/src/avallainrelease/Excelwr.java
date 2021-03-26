package avallainrelease;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook; 
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Excelwr {

	public static void main(String[] args) throws InvalidFormatException, IOException 
	{
		// initilize fileInputStream and set path of excel file
		FileInputStream is = new FileInputStream("F:\\RDPAutomation\\RDPAuto.xls");

			// Create workbook and access file into Workbook
			Workbook wb = WorkbookFactory.create(is);

			// Get sheet by sending sheet id or sheet name
			Sheet s = wb.getSheetAt(0);
			//Sheet s = wb.getSheetAt(“Sheet1”);
			

			// Create object for Row and pass which row need to be accessed
			Row r = s.getRow(1);	
			
			//Create new cell and set data by passing column number and Cell Value
			r.createCell(2).setCellValue("Result");
			
			r = s.getRow(2);	
			
			//Create new cell and set data by passing column number and Cell Value
			r.createCell(2).setCellValue("PASS");
			
			r = s.getRow(3);	
			
			//Create new cell and set data by passing column number and Cell Value
			r.createCell(2).setCellValue("FAIL");
			
			//Initilize file outputStream
		FileOutputStream fOut = new FileOutputStream("F:\\RDPAutomation\\RDPAuto.xls");
			
			//Write into workbook
			wb.write(fOut);
			
			//close file
			fOut.close();
			is.close();
		
		
		
		
		
		

	}

}
