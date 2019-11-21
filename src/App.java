import java.text.ParseException;
import java.util.Date;

public class App {

	public static void main(String[] args) throws ParseException {
		
		String strDate;
		Date date;
		
		CustomDateFormater cdf = new CustomDateFormater();
		
		strDate = cdf.dateToString(new Date(), "yyyy-MM-dd");
		System.out.println(strDate);
		
		date = cdf.stringToDate("25-02-2019", "dd-MM-yyyy");
		System.out.println(date);
		
		strDate = cdf.stringToString("04 Aug 2019", "dd MMM yyyy", "MMM dd, yyyy");
		System.out.println(strDate);
		
		strDate = cdf.strCusDateCurTimeToStrDateTime("04 Aug 2019", "dd MMM yyyy", "hh:mm:ss a", "yyyy-MM-dd hh:mm:ss a");
		System.out.println(strDate);

	}

}
