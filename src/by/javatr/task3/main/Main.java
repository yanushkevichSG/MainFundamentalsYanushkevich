package by.javatr.task3.main;
import by.javatr.task3.util.RandomArray;

public class Main{
    public static void main(String[] args){
        int size = Integer.parseInt(args[0]);
        RandomArray ra = new RandomArray();
        int[] numbers = ra.getIntArray(size);
	    ra.Outputinline(numbers);
	    ra.Outputincolumn(numbers);
    }
}

