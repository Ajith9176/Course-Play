package org.Courseplay.helper;

import java.awt.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.Courseplay.StepDefinition.Hooks;

public class DataDriven {

	public static String configDatas;

	public static String getConfigDatas(String value) throws Throwable {
		try {
			File f = new File(System.getProperty("user.dir") + "\\Datas\\TestConfiguration.xlsx");
			FileInputStream fin = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fin);
			Sheet sheetAt = wb.getSheetAt(0);
			String cellValue = null;
			for (int i = 0; i < sheetAt.getPhysicalNumberOfRows(); i++) {
				String stringCellValue = sheetAt.getRow(i).getCell(1).getStringCellValue();
				if (stringCellValue.equalsIgnoreCase(value)) {
					Cell cell = sheetAt.getRow(i).getCell(2);
					if (cell.getCellType().equals(CellType.STRING)) {
						cellValue = cell.getStringCellValue();
					} else if (cell.getCellType().equals(CellType.NUMERIC)) {
						double numericCellValue = cell.getNumericCellValue();
						long l = (long) numericCellValue;
						cellValue = String.valueOf(l);
					}
				}
			}
			return cellValue;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception();
		}
	}
	
	


	public static Map<String, String> mp = Hooks.mpd;

	public static void mapReport() throws Throwable {
		try {
			int size = mp.size();
			Set<Entry<String, String>> entrySet = mp.entrySet();
			System.out.println(size);
			System.out.println(entrySet);
			int i = 0;
				for (Entry<String, String> entry : entrySet) {

					testExecutionReport(i, 1, entry.getKey());
					testExecutionReport(i, 2, entry.getValue());
					i++;
			}
			System.out.println("Done");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static void testExecutionReport(int rowNumber, int cellnum, String value) throws Throwable {
		try {
			File f = new File(
					System.getProperty("user.dir") + "\\src\\test\\java\\org\\Courseplay\\data\\TestReport.xlsx");
			FileInputStream fin = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fin);
			CellStyle pass = wb.createCellStyle();
			pass.setFillBackgroundColor(IndexedColors.BRIGHT_GREEN.getIndex());
			
			CellStyle fail = wb.createCellStyle();
			fail.setFillBackgroundColor(IndexedColors.DARK_RED.getIndex());
			Sheet sheetAt = wb.getSheetAt(0);
			Row row = sheetAt.getRow(rowNumber);
			if (row == null) {
				row = sheetAt.createRow(rowNumber);
			}
			Cell cell = row.getCell(cellnum);
			if (cell == null) {
				cell = row.createCell(cellnum);
			}
			cell.setCellValue(value);
			FileOutputStream fout = new FileOutputStream(f);
			wb.write(fout);
			wb.close();
			fout.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception();

		}
	}

	public static String getTestData(int row, String value,int no) throws Throwable {
		try {
			File f = new File(System.getProperty("user.dir") +"\\Datas\\TestConfiguration.xlsx");
			FileInputStream fin = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fin);
			Sheet sheetAt = wb.getSheetAt(no);
			String cellValue = null;
			String cellData = null;
			for (int i = 0; i < sheetAt.getRow(1).getPhysicalNumberOfCells(); i++) {
				Cell cell = sheetAt.getRow(1).getCell(i);
				if (cell.getCellType().equals(CellType.STRING)) {
					cellValue = cell.getStringCellValue();
				} else if (cell.getCellType().equals(CellType.NUMERIC)) {
					double numericCellValue = cell.getNumericCellValue();
					long l = (long) numericCellValue;
					cellValue = String.valueOf(l);
				}
				if (cellValue.equalsIgnoreCase(value)) {
					Cell c = sheetAt.getRow(row).getCell(i);
					if (c.getCellType().equals(CellType.STRING)) {
						cellData = c.getStringCellValue();
					} else if (c.getCellType().equals(CellType.NUMERIC)) {
						double numericCellValue = c.getNumericCellValue();
						long l = (long) numericCellValue;
						cellData = String.valueOf(l);
					}
				}
			}
			return cellData;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception();
		}
	}

	//public static void main(String[] args) throws Throwable {
		//String testData = getTestData(Integer.parseInt(getConfigDatas1("RowNumber",2)), "First Name", 4);
		//System.out.println(testData);

	//}
	
	
	public static String getConfigDatas1(String value,int no) throws Throwable {
		try {
			File f = new File(System.getProperty("user.dir") +"\\Datas\\TestConfiguration.xlsx");
			FileInputStream fin = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fin);
			Sheet sheetAt = wb.getSheetAt(no);
			String cellValue = null;
			for (int i = 0; i < sheetAt.getPhysicalNumberOfRows(); i++) {
				String stringCellValue = sheetAt.getRow(i).getCell(1).getStringCellValue();
				if (stringCellValue.equalsIgnoreCase(value)) {
					Cell cell = sheetAt.getRow(i).getCell(2);
					if (cell.getCellType().equals(CellType.STRING)) {
						cellValue = cell.getStringCellValue();
					} else if (cell.getCellType().equals(CellType.NUMERIC)) {
						double numericCellValue = cell.getNumericCellValue();
						long l = (long) numericCellValue;
						cellValue = String.valueOf(l);
					}
				}
			}
			return cellValue;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static String getSkills(int row, String value) throws Throwable {
		try {
			File f = new File(System.getProperty("user.dir") +"\\Datas\\TestConfiguration.xlsx");
			FileInputStream fin = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fin);
			Sheet sheetAt = wb.getSheetAt(4);
			String cellValue = null;
			String cellData = null;
			for (int i = 0; i < sheetAt.getRow(1).getPhysicalNumberOfCells(); i++) {
				Cell cell = sheetAt.getRow(1).getCell(i);
				if (cell.getCellType().equals(CellType.STRING)) {
					cellValue = cell.getStringCellValue();
				} else if (cell.getCellType().equals(CellType.NUMERIC)) {
					double numericCellValue = cell.getNumericCellValue();
					long l = (long) numericCellValue;
					cellValue = String.valueOf(l);
				}
				if (cellValue.equalsIgnoreCase(value)) {
					Cell c = sheetAt.getRow(row).getCell(i);
					if (c.getCellType().equals(CellType.STRING)) {
						cellData = c.getStringCellValue();
					} else if (c.getCellType().equals(CellType.NUMERIC)) {
						double numericCellValue = c.getNumericCellValue();
						long l = (long) numericCellValue;
						cellData = String.valueOf(l);
					}
				}
			}
			return cellData;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception();
		}
	}
	
	
	public static void Testexecution() {
		
		

	}
	
	
	public static void main(String[] args) throws Throwable {
		String text = DataDriven.getTestData(Integer.parseInt(DataDriven.getConfigDatas1("RowNumber",2)),"First Name",2);
		System.out.println(text);
		
	}
	


}