package com.miracle.timloo;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.hssf.usermodel.HSSFWorkbook; //
//import org.apache.poi.hssf.usermodel.HSSFRow;
//import org.apache.poi.hssf.usermodel.HSSFSheet;
//import org.apache.poi.hssf.usermodel.HSSFCell;
//import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.util.CellReference;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class cm40101 
{
    public static void main( String[] args )
    {
        FileInputStream inputStream = null;
         Workbook wb = null;
		try
		    {
				 inputStream = new FileInputStream("cm40101.xls");
                 wb = new HSSFWorkbook(inputStream);
		    }
		    catch (FileNotFoundException e)  
		    {

		        e.printStackTrace();
		    }		
            catch (IOException e)
            {
                e.printStackTrace();
            }
		
		// create a new workbook
        //FileInputStream inputStream = new FileInputStream(new File(templateFile));
		//Workbook wb = new POIFSFileSystem(out);
        //fs = new POIFSFileSystem(new FileInputStream(getPath() + "template" + separator + execlfilename));
		// create a new sheet
		//Sheet s = wb.createSheet();
        Sheet sheet = wb.getSheetAt(0);
        CellReference cellReference = new CellReference("J7"); 
        Row row = sheet.getRow(cellReference.getRow());
        Cell cell = row.getCell(cellReference.getCol()); //中文  
        cell.setCellValue( "V" );
        cellReference = new CellReference("J9"); 
        row = sheet.getRow(cellReference.getRow());
        cell = row.getCell(cellReference.getCol()); 
        //cell.setEncoding(HSSFCell.ENCODING_UTF_16);
        cell.setCellValue( "\u7f85\u5ef7\u4e2d\u5e25\u54e5" );
        cellReference = new CellReference("J11"); 
        row = sheet.getRow(cellReference.getRow());
        cell = row.getCell(cellReference.getCol()); 
        cell.setCellValue( "V" );
        
        cellReference = new CellReference("J13"); 
        row = sheet.getRow(cellReference.getRow());
        cell = row.getCell(cellReference.getCol()); 
        cell.setCellValue( "V" );


        cellReference = new CellReference("J15"); 
        row = sheet.getRow(cellReference.getRow());
        cell = row.getCell(cellReference.getCol()); 
        cell.setCellValue( "V" );

		try 
		{
        FileOutputStream fileOut = new FileOutputStream("cm40101_1.xls");
        wb.write(fileOut);
		fileOut.close();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}        

    }
}