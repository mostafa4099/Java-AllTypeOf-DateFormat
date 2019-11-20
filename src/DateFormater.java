import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

public class DateFormater {

	public String dateToStringConverter(Date date, String pattern) {

		DateFormat df = new SimpleDateFormat(pattern);
		return df.format(date);
	}
	
	public Date stringDateToDateConverter(String date, String datePattern) throws ParseException {
		
		SimpleDateFormat df = new SimpleDateFormat(datePattern);
		Date dat = df.parse(date);
		return dat;
	}

	public String stringDateToStringDateFormater(String date, String datePattern, String strDatePattern) {

		String dateAsString = "";

		try {
			
			SimpleDateFormat df = new SimpleDateFormat(datePattern);
			SimpleDateFormat df2 = new SimpleDateFormat(strDatePattern);
			Date date2 = df.parse(date);
			dateAsString = df2.format(date2);

		} catch (ParseException e) {
			e.printStackTrace();
		}

		return dateAsString;
	}
	
	public Date dateToDateFormater(Date date, String pattern) {

		Date date2 = new Date();

		try {
			
			SimpleDateFormat df = new SimpleDateFormat(pattern);
			String dateAsString = df.format(date);
			date2 = df.parse(dateAsString);

		} catch (ParseException e) {
			e.printStackTrace();
		}

		return date2;
	}
	
	public String stringDateCurrentTimeToStringDateFormater(String givenDate, String givenDatePattern, 
			String timePattern, String strRetrunDatePattern) {

		String dateAsString = "";
		
		Date time = new Date();
		DateFormat df3 = new SimpleDateFormat(timePattern);
		String currTime = df3.format(time);
		
		String fullDate = givenDate+" "+currTime;
		String fullDatePattern = givenDatePattern+" "+timePattern;
		
		
		
		try {
			
			SimpleDateFormat df = new SimpleDateFormat(fullDatePattern);
			SimpleDateFormat df2 = new SimpleDateFormat(strRetrunDatePattern);
			Date date = df.parse(fullDate);
			dateAsString = df2.format(date);

		} catch (ParseException e) {
			e.printStackTrace();
		}

		return dateAsString;
	}
}
