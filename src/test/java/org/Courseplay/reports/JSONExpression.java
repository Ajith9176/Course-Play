package org.Courseplay.reports;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

import org.apache.commons.collections4.SetValuedMap;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.Courseplay.baseclass.BaseClass;
import org.Courseplay.helper.DataDriven;
import com.jayway.jsonpath.JsonPath;

public class JSONExpression extends BaseClass {

	public static void jsonReports() throws Throwable {

		System.out.println("Start");

		String json = new String(Files
				.readAllBytes(Paths.get(System.getProperty("user.dir") +"\\src\\test\\resource\\Library\\cucumber.json")));
		LocalDateTime current = LocalDateTime.now();

		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		String formatted = current.format(formatter);

		System.out.println("Current Date is: " + formatted);

		BaseClass.setValuetoExcel("TestStepResult", "Sheet2", 7, 2, formatted);

		List<String> scenarioName = JsonPath.read(json, "$..elements[*].name");
		List<String> scenariostatus = JsonPath.read(json, "$..elements[*].after[*].result.status");
		// List<Object> scenarioDuration = JsonPath.read(json,
		// "$..elements[*].after[*].result.duration");
		List<String> tagname = JsonPath.read(json, "$..elements[*].tags[*].name");

		String configDatas = DataDriven.getConfigDatas("Project_Name");
		System.out.println(configDatas);
		String browserversion = DataDriven.getConfigDatas("BrowserVersion");
		System.out.println(browserversion);

		BaseClass.setValuetoExcel("TestStepResult", "Sheet1", 3, 2, configDatas);
		BaseClass.setValuetoExcel("TestStepResult", "Sheet1", 4, 2, browserversion);
		BaseClass.setValuetoExcel("TestStepResult", "Sheet1", 6, 2, "Regression Testing");

		int m = 8;
		int ss;
		for (int i = 0; i < scenarioName.size(); i++) {
			String sN = scenarioName.get(i);
			System.out.println(sN);
			
			
			String sS = scenariostatus.get(i);
			String Status = Character.toUpperCase(sS.charAt(0)) + sS.substring(1);
			System.out.println(Status);
			String tag = tagname.get(i);
			String spilt = tag.replace("@", "");
			String[] tc = spilt.split("_");
			// Object object = scenarioDuration.get(i);
			m = m + 2;
			System.out.println(m);
			BaseClass.setValuetoExcel("TestStepResult", "Sheet2", m, 1, tc[0]);
			System.out.println(tc);
			BaseClass.setValuetoExcel("TestStepResult", "Sheet2", m, 2, tc[1]);
			BaseClass.setValuetoExcel("TestStepResult", "Sheet2", m, 3, sN);
			BaseClass.setValuetoExcel("TestStepResult", "Sheet2", m, 6, Status);
			// BaseClass.setValuetoExcel("TestStepResult", "Sheet", m, 5,
			// String.valueOf(object));

			System.out.println("tag " + sN + " = " + sS);
			List<String> steps = JsonPath.read(json, "$..elements[" + i + "].steps[*].name");
			List<String> status = JsonPath.read(json, "$..elements[" + i + "].steps[*].result.status");
			// List<Object> durations = JsonPath.read(json, "$..elements[" + i +
			// "].steps[*].result.duration");

			for (int j = 0; j < steps.size(); j++) {
				m++;
				System.out.println(m);
				String st = steps.get(j);
				String[] remove = st.split("using");
				System.out.println(remove);
				
				String stepS = status.get(j);
				String message = Character.toUpperCase(stepS.charAt(0)) + stepS.substring(1);
				System.out.println(message);
				// Object durS = durations.get(j);
				System.out.println("Step =" + st + "=" + message);
				BaseClass.setValuetoExcel("TestStepResult", "Sheet2", m, 4, remove[0]);
				BaseClass.setValuetoExcel("TestStepResult", "Sheet2", m, 5, message);
				// BaseClass.setValuetoExcel("TestStepResult", "Sheet", m, 5,
				// String.valueOf(durS));

			}

			m = m++;
			
			
		}
		int k = m-20;
		
		String s =String.valueOf(k); 
		System.out.println(s);

		System.out.println("End");
		String scenarioStatus = BaseClass.getScenarioStatus("TestStepResult", "Sheet2");
		String stepStatus = BaseClass.getStepStatus("TestStepResult", "Sheet2");
		
		String[] split = scenarioStatus.split("=");
		String[] stepsplit = stepStatus.split("=");
		
		System.out.println(split[0]);
		System.out.println(split[1]);
		System.out.println(stepsplit[0]);
		System.out.println(stepsplit[1]);
		
		
		
		int stepS=Integer.parseInt(stepsplit[0]); 
		int StepS = stepS+1-1;
		String value = String.valueOf(StepS);
		System.out.println(value);
		
		int scenstepS=Integer.parseInt(split[0]); 
		int scenario = scenstepS+1-1;
		String scenval = String.valueOf(scenario);
		System.out.println(scenval);
		
		
	
		BaseClass.setValuetoExcel("TestStepResult", "Sheet2", 5, 5, scenval);
		BaseClass.setValuetoExcel("TestStepResult", "Sheet2", 5, 6, scenval);
		BaseClass.setValuetoExcel("TestStepResult", "Sheet2", 5, 7, split[1]);
		BaseClass.setValuetoExcel("TestStepResult", "Sheet2", 6, 5,value);
		BaseClass.setValuetoExcel("TestStepResult", "Sheet2", 6, 6,value);
		BaseClass.setValuetoExcel("TestStepResult", "Sheet2", 6, 7,stepsplit[1]);
		BaseClass.setValuetoExcel("TestStepResult", "Sheet2", 6, 8,stepsplit[2]);
		BaseClass.setValuetoExcel("TestStepResult", "Sheet1", 7, 5,s);


	}

	public static void main(String[] args) throws Throwable {

		jsonReports();
	}

}
