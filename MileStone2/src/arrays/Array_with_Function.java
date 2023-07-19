package arrays;

import java.util.Scanner;

public class Array_with_Function {
	public static void main(String args[])
	{
		int arr[] = input();
		output(arr);
	}
	
	public static void output(int output[])
	{
		System.out.println("Elements are: ");
		for(int i=0;i<output.length;i++)
		{
			System.out.print(output[i] + " ");
		}
		
	}
	
	public static int[] input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Size of the Array: ");
		int size = sc.nextInt();
		int input[] = new int[size];
		
		for(int i = 0;i<size;i++)
		{
			System.out.print("Element: ");
			input[i] = sc.nextInt();
		}
		return input;
	}
}
