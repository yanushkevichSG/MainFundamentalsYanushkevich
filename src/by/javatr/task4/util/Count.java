package by.javatr.task4.util;

public class Count {
    private static int sum = 0;
    private  static int multiply = 1;

    public static  int getMultiply() {
        return multiply;
    }

    public static int getSum() {
        return sum;
    }

    public static void allcount(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
            multiply *= arr[i];
        }
    }
}
