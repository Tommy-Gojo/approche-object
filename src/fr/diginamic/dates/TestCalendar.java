package fr.diginamic.dates;

import java.util.Calendar;
import java.util.Date;
public class TestCalendar {
	public static void main (String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, 19);
		cal.set(Calendar.MONTH, 5);
		cal.set(Calendar.YEAR, 2016);
		cal.set(Calendar.HOUR_OF_DAY, 23);
		cal.set(Calendar.MINUTE, 59);
		cal.set(Calendar.SECOND, 30);
		Date date = cal.getTime();
		System.out.println(date);
	}
}
