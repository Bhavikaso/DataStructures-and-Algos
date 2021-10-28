package com.company.twilio;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Ques3 {

	public static List<String> preprocessDate(List<String> dates)  {

		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
		List<String> result = new ArrayList<>();
		try {
			for (String date : dates) {
				date = date.replace("st", "").replace("nd", "").replace("rd", "").replace("th", "");
				Date tempDate = new SimpleDateFormat("dd MMM yyyy", Locale.ENGLISH).parse(date);
				Calendar tempC = Calendar.getInstance();
				tempC.setTime(tempDate);
				int year = tempC.get(Calendar.YEAR);
				if (year >= 1900 && year <= 2100) {
					String dateStr = formatter.format(tempDate).toString();
					result.add(dateStr);
				}
				else {
					System.out.println("Year out of range");
				}

			}
		}
		catch (Exception ex ){
		System.out.println(ex);
		}
		return result;
	}

	public static void main(String args[]) throws ParseException {
		String string= "1st Mar 1974";
		List<String> result = new ArrayList<>();
		result.add(string);
		System.out.println(preprocessDate(result));

	}
}
