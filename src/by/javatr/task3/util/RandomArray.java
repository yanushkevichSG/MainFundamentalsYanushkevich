package by.javatr.task3.util;
import java.util.Random;

public class RandomArray{
	Random random = new Random();
	private void IntRandomArr(int[] arr) {
		for (int i = 0; i < arr.length; ++i) {
			arr[i] = random.nextInt(100);
		}
	}
	public int[] getIntArray(int size)	{
		int[] arr = new int[size];
		IntRandomArr(arr);
		return arr;
   	}
	public void Outputinline(int[] arr)	{
		for(int i = 0; i < arr.length; ++i)	{
			System.out.print(arr[i]);
		}
	}
	public void Outputincolumn(int[] arr) {
		for(int i = 0; i < arr.length; ++i)	{
			System.out.println(arr[i]);
		}
	}
}

