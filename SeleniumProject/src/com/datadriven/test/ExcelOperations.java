package com.datadriven.test;

import com.excel.utility.Xls_Reader;

public class ExcelOperations {

	public static void main(String[] args) {
		
		Xls_Reader reader = new Xls_Reader("F:\\Naveen Automation labs Tutorials\\Selenium Tutorial\\Data driven using excel\\DataDrivenTest.xlsx");
		
		/* EXCEL OPERATIONS */
		
		//reader.addSheet(sheetname)
		//reader.addColumn(sheetName, colName)
		//reader.getCellData(sheetName, colNum, rowNum)
		//reader.getColumnCount(sheetName)
		//reader.getRowCount(sheetName)
		//reader.setCellData(sheetName, colName, rowNum, data)
		
		reader.addSheet("Homepage"); // To add sheets inside an excel
		int colcount=reader.getColumnCount("RegTestData");// To get column count under the page
		System.out.println("No. of columns under RegTestdata page: "+colcount);
		System.out.println(reader.getCellRowNum("RegTestData", "fname", "Vismaya"));// To get the row number of the data
		
		// to add a row into the excel sheet
		int rCount = reader.getRowCount("RegTestData");
		reader.setCellData("RegTestData", "fname", rCount+1, "Aastha");
		reader.setCellData("RegTestData", "lname", rCount+1, "Grover");
		
	}

}
