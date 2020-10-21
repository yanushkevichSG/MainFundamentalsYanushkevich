package by.javatr.task4.main;

import by.javatr.task4.util.Count;

public class Main {
    public static void main(String[] args) {
        int n = args.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
	            arr[i] = Integer.parseInt(args[i]);
	    }
        Count.allcount(arr);
        System.out.println("Multiply: " + Count.getMultiply() + " Summ: " + Count.getSum());
    }
}
