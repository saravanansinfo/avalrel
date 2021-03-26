package avallainrelease;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import jxl.Workbook;

public class Excelwr {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException 
	{
		FileInputStream fi = new FileInputStream("F:\\RDPAutomation\\RDP_Template_Variation_Matrix.xlsx");
		
		Workbook wb = (Workbook) WorkbookFactory.create(fi);
		
		
		

	}

}
