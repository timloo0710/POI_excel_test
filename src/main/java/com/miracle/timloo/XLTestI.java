package com.miracle.timloo;



//import org.apache.poi.ss.usermodel.*;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class XLTestI 
{

    public static void main( String[] args )
    {

		FileOutputStream out = null;
		// create a new file
		try
		    {
				 out = new FileOutputStream("workbook.xls");
		    }
		    catch (FileNotFoundException e)  
		    {

		        e.printStackTrace();
		    }	

	}
}		    	