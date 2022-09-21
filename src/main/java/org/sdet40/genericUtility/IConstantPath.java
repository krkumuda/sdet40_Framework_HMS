package org.sdet40.genericUtility;

public interface IConstantPath {
	
	//variable.method name=camelcase
	//interface,class,enum,annotation=pascel case
	//static final member=CAPITAL
	
//	String PROJECT_PATH=System.getProperty("user.dir");
//	String Excel_PATH=PROJECT_PATH+"./src/test/resources/Admin (1).xlsx";
//	String PROPERTY_FILE_PATH=PROJECT_PATH+".src/test/resources/commondata.properties.txt";

		//variable, method name=camelcase
		//Interface, class, enum,annotion=pascal case
		//static final-->capital
		String PROJECT_PATH = System.getProperty("user.dir");
		String EXCEL_PATH = PROJECT_PATH + "/src/test/resources/Admin.xlsx";
		String PROPERTY_FILE_PATH = PROJECT_PATH + "/src/test/resources/commonData.properties";
        String JDBC_URL_String = "jdbc:mysql://localhost:3306/tyss";
		String JDBC_USERNAME = "root";
		String JDBC_PASSWORD = "root";
		int Implicitly_TIMEOUT = 20;
		int Explicitly_TIMEOUT = 20;
		}

