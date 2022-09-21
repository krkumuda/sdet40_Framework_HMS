package org.sdet40.admin;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.sdet40.genericUtility.ExcelUtility;
import org.sdet40.genericUtility.IConstantPath;

public class FetchDataFromExcelThroughListMap {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		ExcelUtility excelutility=new ExcelUtility();
		excelutility.openExcel(IConstantPath.EXCEL_PATH);
		List<Map<String,String>> list=excelutility.getDataFromExcelInList("form");
		System.out.println(list.get(2).get("FirstName"));
		Map<String,String>map=excelutility.getDataFromExcelInMap("form");
		System.out.println(map);
	}

}
