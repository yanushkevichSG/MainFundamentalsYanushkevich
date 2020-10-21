package by.javatr.task5.util;

import java.util.Calendar;

public class MonthCount {
    
    public static String monthOfNumberInString(int number){
	    String monthOfNumber = null;
        switch (number){
            case 1:
                monthOfNumber = "January";
                break;
            case 2:
                monthOfNumber = "February";
                break;
            case 3:
                monthOfNumber = "March";
                break;
            case 4:
                monthOfNumber = "April";
                break;
            case 5:
                monthOfNumber = "May";
                break;
            case 6:
                monthOfNumber = "June";
                break;
            case 7:
                monthOfNumber = "July";
                break;
            case 8:
                monthOfNumber = "August";
                break;
            case 9:
                monthOfNumber = "September";
                break;
            case 10:
                monthOfNumber = "October";
                break;
            case 11:
                monthOfNumber = "November";
                break;
            case 12:
                monthOfNumber = "December";
        }
        return monthOfNumber;

   }
}