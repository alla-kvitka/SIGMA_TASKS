package task1and2;

import java.util.*;


public class DataController {

    public List<String> getBirthdayDayOfWeek(int yearCount) {
        List<String> resultBirthdayDaysOfWeek = new ArrayList<>();
        Calendar calendar = new GregorianCalendar();
        calendar.set(2021, Calendar.DECEMBER, 20);
        calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.UK);
        for (int i = 0; i < yearCount; i++) {
            calendar.set(Calendar.YEAR, calendar.get(Calendar.YEAR) + 1);
            resultBirthdayDaysOfWeek.add(calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.UK));
        }
        return resultBirthdayDaysOfWeek;
    }

    public int countDaysBetween(Date start, Date end) {
        return (int) Math.round((end.getTime() - start.getTime())
                / (double) 86400000);
    }
}

