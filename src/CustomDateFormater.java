import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomDateFormater {

	public String dateToString(Date givenDate, String formatPattern) {
		
		DateFormat formater = new SimpleDateFormat(formatPattern);
		String formatedDate = formater.format(givenDate);

		return formatedDate;
	}

	public Date stringToDate(String givenStrDate, String parsePattern) throws ParseException {

		DateFormat parser = new SimpleDateFormat(parsePattern);
		Date parsedDate = parser.parse(givenStrDate);

		return parsedDate;
	}

	public String stringToString(String givenStrDate, String parsePattern, String formatPattern) throws ParseException {
		
		//Parse String to Date
		SimpleDateFormat parser = new SimpleDateFormat(parsePattern);
		Date parsedDate = parser.parse(givenStrDate);
		
		//Format Date to String
		SimpleDateFormat formater = new SimpleDateFormat(formatPattern);
		String formatedDate = formater.format(parsedDate);

		return formatedDate;
	}

	public String strCusDateCurTimeToStrDateTime(String givenStrDate, String parseDatePattern,
			String timePattern, String formatPattern) throws ParseException {
		
		//Current Time Format
		Date curTime = new Date();
		DateFormat timeFormater = new SimpleDateFormat(timePattern);
		String curStrTime = timeFormater.format(curTime);
		
		//Full String Date Time
		String strDateTime = givenStrDate + " " + curStrTime;
		
		//String to Date parser pattern
		String parsePattern = parseDatePattern + " " + timePattern;
		
		//Parse String to Date
		SimpleDateFormat df2 = new SimpleDateFormat(parsePattern);
		Date dateTime = df2.parse(strDateTime);
		
		//Format Date to String 
		SimpleDateFormat df3 = new SimpleDateFormat(formatPattern);
		String returnStrDate = df3.format(dateTime);

		return returnStrDate;
	}
}
