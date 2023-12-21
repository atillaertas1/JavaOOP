package WEEK_10.APP_3;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        DateInfo dateInfo = new DateInfo(2023,12,11,12,24);
        Calendar calendar = Calendar.getInstance();
        dateInfo.setYear(calendar.get(Calendar.YEAR));
        dateInfo.setMonth(calendar.get(Calendar.MONTH) + 1);
        dateInfo.setDay(calendar.get(Calendar.DAY_OF_MONTH));
        dateInfo.setHour(calendar.get(Calendar.HOUR_OF_DAY));
        dateInfo.setMinute(calendar.get(Calendar.MINUTE));

        dateInfo.returnDate();
    }
}