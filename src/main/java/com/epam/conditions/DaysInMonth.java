package com.epam.conditions;
import java.time.YearMonth;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if (year>0 && (0<month) && (month<13)){
            YearMonth yearMonthObject = YearMonth.of(year, month);
            int daysInMonth = yearMonthObject.lengthOfMonth();
            System.out.println(daysInMonth);
        }
        else {
            System.out.println("invalid date");
        }
    }

}
