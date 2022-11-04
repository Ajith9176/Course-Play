package org.Courseplay.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetExcelData {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		Map<String, String> mp = new LinkedHashMap<String, String>();
		List<String> liTag = new ArrayList<String>();
		Workbook wb = new XSSFWorkbook(new FileInputStream(
				new File(System.getProperty("user.dir") +"\\Datas\\TestExecution.xlsx")));
		Sheet sheetAt = wb.getSheetAt(0);
		for (int i = 0; i < sheetAt.getPhysicalNumberOfRows(); i++) {
			String tag = sheetAt.getRow(i).getCell(3).getStringCellValue();
			String flag = sheetAt.getRow(i).getCell(5).getStringCellValue();

			mp.put(tag, flag);
		}

		Set<Entry<String, String>> entrySet = mp.entrySet();
		for (Entry<String, String> x : entrySet) {
			String value = x.getValue();
			if (value.equalsIgnoreCase("yes")) {
				String key = x.getKey();
				liTag.add(key);
			}
		}
		
		System.out.println(liTag);
		String s = "@"+liTag.toString().substring(1, liTag.toString().length()-1).replace(", ",",@");
		System.out.println(s);
		
	
		
		String tagName = "Call mvn clean test  \"-Dcucumber.options= --tags " + s + "\" " + "\n" + "SLEEP 10" + "\n";
		System.out.println(tagName);
		File file = new File(System.getProperty("user.dir") +"\\Data.bat");
		FileWriter fileWriter = new FileWriter(file);
		
		fileWriter.write(tagName);
		fileWriter.flush();
		fileWriter.close();
		
	}
}
