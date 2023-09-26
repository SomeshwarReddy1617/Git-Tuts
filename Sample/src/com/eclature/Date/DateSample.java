package com.eclature.Date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalField;
import java.time.temporal.WeekFields;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateSample {

	public static void main(String[] args) {
		/*
		 * // TODO Auto-generated method stub java.util.Date dt = new java.util.Date();
		 * java.text.SimpleDateFormat sdf = new
		 * java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); String format =
		 * sdf.format(dt); System.out.println(dt);
		 */

		
		/* final DateTimeFormatter dtf =
		 DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		 
		 LocalDateTime format = LocalDate.parse("2023-10-20").atTime(0, 0, 0);
		 String format2 = format.format(dtf);
		 System.out.println(format2);*/
		 

		/*
		 * LocalDate startDate = LocalDate.of(2022, 01, 10);
		 * 
		 * LocalDate endDate = LocalDate.of(2025, 01, 05); LocalDate localDate =
		 * LocalDate.parse("2022-01-10"); LocalDateTime localDateTime1 =
		 * localDate.atStartOfDay(); //System.out.println(localDateTime1); TemporalField
		 * woy = WeekFields.of(DayOfWeek.MONDAY,1).weekOfWeekBasedYear();
		 * 
		 * int i = startDate.get(woy);
		 * 
		 * //LocalDateTime localDateTime2 = localDate.atTime(LocalTime.now());
		 * System.out.println( --i);
		 */

		/*
		 * DateTimeFormatter newPattern =
		 * DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); DateTimeFormatter
		 * oldPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd"); LocalDate datetime =
		 * LocalDate.parse("2023-10-20", oldPattern); String output =
		 * datetime.format(newPattern); System.out.println(output);
		 */

		/*
		 * String date = "2023-10-20";
		 * 
		 * TemporalAccessor temporal = DateTimeFormatter
		 * .ofPattern("yyyy-MM-dd HH:mm:ss.S") .parse(date); String output =
		 * DateTimeFormatter.ofPattern("yyyy-MM-dd").format(temporal);
		 * System.out.println(output);
		 */

		/*
		 * String strDate = "2011-01-18"; DateTimeFormatter dtfInput =
		 * DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); LocalDateTime ldt =
		 * LocalDateTime.parse(strDate, dtfInput); // Alternatively, the old way: //
		 * LocalDateTime ldt = dtfInput.parse(strDate, LocalDateTime::from);
		 * System.out.println(ldt); LocalDate date1 = ldt.toLocalDate();
		 * System.out.println(date1);
		 */

		/*
		 * date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		 */
	/*	Date time = Calendar.getInstance().getTime();
		System.out.println(time);*/
	}

}
