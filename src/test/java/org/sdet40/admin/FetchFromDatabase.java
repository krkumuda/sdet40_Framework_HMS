package org.sdet40.admin;

import java.sql.SQLException;
import java.util.List;

import org.sdet40.genericUtility.DatabaseUtility;
import org.sdet40.genericUtility.IConstantPath;

public class FetchFromDatabase {
	
	public static void main(String[] args) throws SQLException {
		DatabaseUtility databaseUtil=new DatabaseUtility();
		databaseUtil.openDBConnection(IConstantPath.JDBC_URL_String, "root","root");
		List<String> data1 = databaseUtil.getDataFromDatabase("select * from sdet40;", "emp_name");
		List<String> data2 = databaseUtil.getDataFromDatabase("select * from sdet40;", "emp_name");
		List<String> data3 = databaseUtil.getDataFromDatabase("select * from sdet40;", "emp_name");
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3);
		}
		}


