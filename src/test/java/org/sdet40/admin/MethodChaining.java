package org.sdet40.admin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MethodChaining {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fisExcel=new FileInputStream("./src/test/resources/Book3.xlsx");
		Workbook wb=WorkbookFactory.create(fisExcel);
		DataFormatter df=new DataFormatter();
		try
		{
			Sheet sheet=wb.getSheet("commondata");
			Cell cell=sheet.getRow(1).getCell(1);
			
			String data=df.formatCellValue(cell);
			System.out.println(data);
			
		}
		finally
		{
			wb.close();
		}

	}

}
