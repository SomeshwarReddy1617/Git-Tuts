package com.eclature.Stream;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.TemporalField;
import java.time.temporal.WeekFields;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class AddingDateClass {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		LocalDate startDate = LocalDate.of(2022, 01, 03);
		// System.out.println(startDate);

		LocalDate endDate = LocalDate.of(2025, 01, 05);

		LocalDate now = LocalDate.now();
		
		for (LocalDate date = startDate; date.isBefore(endDate); date = date.plusDays(1)) {
			if (startDate.isBefore(endDate)
					&& startDate != endDate) {
				
				TemporalField woy = WeekFields.of(DayOfWeek.MONDAY,1).weekOfWeekBasedYear();
				int i = startDate.get(woy);

				LocalDate plusDays = startDate.plusDays(7);
				
					if (plusDays.isBefore(endDate)) {
						System.out.println(startDate + " - " + plusDays);
					}
					
				startDate = plusDays.plusDays(1);

				
				System.out.println("get month no :::: " + startDate.getMonth().getValue());
				System.out.println("get week no :::: " + --i);
				System.out.println("get year :::: "+ startDate.getYear());
			}

		}

		// System.out.println(plusDays);
		/*
		 * Calendar cal = Calendar.getInstance();
		 * 
		 * cal.setTime(sdf.parse(startDate));
		 * 
		 * cal.add(Calendar.DAY_OF_MONTH, 7);
		 */

		// String dateAfter = sdf.format(plusDays);

		/*
		 * cal.setTime(sdf.parse(dateAfter)); cal.add(Calendar.DAY_OF_MONTH, 1); String
		 * dateAfter1 = sdf.format(cal.getTime()); startDate = dateAfter1;
		 */

		/*
		 * GregorianCalendar gcalendar = new GregorianCalendar(); String months[] =
		 * {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov",
		 * "Dec"}; // Display current time and date information.
		 * System.out.print("Date: ");
		 * System.out.print(months[gcalendar.get(Calendar.MONTH)]); System.out.print(" "
		 * + gcalendar.get(Calendar.DATE) + " "); System.out.println(
		 * gcalendar.get(Calendar.YEAR));
		 * 
		 * String input = "2013-01-01"; String format = "yyyy-MM-dd";
		 * 
		 * SimpleDateFormat df = new SimpleDateFormat(format); Date date =
		 * df.parse(input); Calendar cal = Calendar.getInstance(); cal.setTime(date);
		 * int week = cal.get(Calendar.WEEK_OF_YEAR);
		 * System.out.println("weel:::: "+week);
		 */

	}

}
