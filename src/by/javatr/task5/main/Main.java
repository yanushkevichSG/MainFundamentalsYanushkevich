package by.javatr.task5.main;

import by.javatr.scanner.Input;
import by.javatr.task5.util.MonthCount;

public class Main {

    public static void main(String[] args) {
    	int number = Integer.parseInt(args[0]);
		if(number > 0 && number < 13) {
			System.out.println(MonthCount.monthOfNumberInString(number));
		} else {
			System.out.println("Wrong number of month..");
		}
    }
}