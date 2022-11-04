package org.Courseplay.reports;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import org.Courseplay.baseclass.BaseClass;

public class DateAndTime {
	
	public static void settime() {
		

	
		
		LocalDateTime current = LocalDateTime.now();

		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		String formatted = current.format(formatter);

		System.out.println("Current Date is: " + formatted);

		BaseClass.setValuetoExcel("TestStepResult", "Sheet1", 7, 2, formatted);
	}

}
