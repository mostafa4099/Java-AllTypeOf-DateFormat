import java.text.ParseException;
import java.util.Date;

public class App {

	public static void main(String[] args) throws ParseException {
		
		String newDate;
		Date nDate;
		
		DateFormater date = new DateFormater();
		
		newDate = date.dateToStringConverter(new Date(), "yyyy-MM-dd hh:mm:ss a");
		System.out.println(newDate);
		
		nDate = date.stringDateToDateConverter("04-02-2019", "yyyy-MM-dd");
		System.out.println(nDate);
		
		newDate = date.stringDateToStringDateFormater("04 Aug 2019", "dd MMM yyyy", "yyyy-MM-dd hh:mm:ss a");
		System.out.println(newDate);
		
		newDate = date.stringDateCurrentTimeToStringDateFormater("04 Aug 2019", "dd MMM yyyy", "hh:mm:ss a", "yyyy-MM-dd hh:mm:ss a");
		System.out.println(newDate);

	}

}
