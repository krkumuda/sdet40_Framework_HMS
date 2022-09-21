package org.sdet40.genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This class is consists all common action on excel
 * @author krkum
 *
 */
public class ExcelUtility {

	Workbook wb;
	/**
	 * This method is used to fetch the data from the excel
	 * @param excelPath
	 * @param sheetName
	 * @param rowNumber
	 * @param cellNumber
	 * @return
	 * @throws IOException 
	 * @throws EncryptedDocumentException 
	 */
	//	public String getDataFromExcel(String excelPath, String sheetName, int rowNum, int cellNum)
	//			throws EncryptedDocumentException, IOException {
	//			FileInputStream fisExcel = new FileInputStream(excelPath);
	//			Workbook wb = WorkbookFactory.create(fisExcel);
	//			Sheet sheet = wb.getSheet(sheetName);
	//			String data = new
	//			DataFormatter().formatCellValue(sheet.getRow(rowNum).getCell(cellNum));
	//			wb.close();
	//			return data;
	//			}2
	public String getDataFromExcel(String excelPath, String sheetName, int rowNum, int cellNum)
			throws EncryptedDocumentException, IOException {
		FileInputStream fisExcel = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fisExcel);
		Sheet sheet = wb.getSheet(sheetName);
		String data = new
				DataFormatter().formatCellValue(sheet.getRow(rowNum).getCell(cellNum));
		wb.close();
		return data;
	}
	public void openExcel(String excelPath) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(excelPath);
		wb=WorkbookFactory.create(fis);
	}
	public void setExcelData(String excelPath,String sheetName, int rowNum,int cellNum, int data) throws
	EncryptedDocumentException, IOException {
		FileInputStream fisExcel=new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fisExcel);
		wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).setCellValue(data);
		FileOutputStream fos=new FileOutputStream(excelPath);
		wb.write(fos);
		wb.close();
	}
	/**
	 * This method is used to fetch the data from the excel and stored in List<Map>
	 * @return 
	 */

	public List<Map<String, String>> getDataFromExcelInList(String sheetName) {
		Sheet sheet = wb.getSheet(sheetName);
		List<Map<String,String>> list = new ArrayList<>();
		DataFormatter df=new DataFormatter();
		for(int k=1;k<sheet.getRow(0).getLastCellNum();k++)
		{

			Map<String,String>map=new HashMap<>();
			for(int i=0;i<=sheet.getLastRowNum();i++) {
				map.put(df.formatCellValue(sheet.getRow(i).getCell(0)),df.formatCellValue(sheet.getRow(i).getCell(k)));
				
			}
			list.add(map);
		}
		return list;

	}
	public Map<String, String> getDataFromExcelInMap(String sheetName) {
		Sheet sheet = wb.getSheet(sheetName);
		Map<String,String>map=new HashMap<>();
		DataFormatter df=new DataFormatter();
		for(int i=0;i<=sheet.getLastRowNum();i++) {
			map.put(df.formatCellValue(sheet.getRow(i).getCell(0)),df.formatCellValue(sheet.getRow(i).getCell(1)));
		}
		return map;
	}
	public String getDataFromExcel2(String sheetName,String requiredKey,String testCaseName) {
		Sheet sheet=wb.getSheet("sheetName");
		String value=null;
		for(int i=0;i<=sheet.getLastRowNum();i++) {
			String actualTestCaseName=sheet.getRow(1).getCell(0).getStringCellValue();
			if(actualTestCaseName.equalsIgnoreCase(testCaseName));
			for(int j=1;j<sheet.getRow(i).getLastCellNum();j++) {
				String actualKey=sheet.getRow(i).getCell(j).getStringCellValue();
				if(actualKey.equalsIgnoreCase(requiredKey))
					value=sheet.getRow(i+1).getCell(j).getStringCellValue();
				break;
			}
			break;
	}
		return value;
}
}



