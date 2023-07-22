package arrays;

import java.util.Scanner;

public class Swap_Alternate {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("TestCases:- ");
		int testcase = sc.nextInt();
		System.out.println("Enter the size of array:- ");
		int size = sc.nextInt();
		while(testcase>0)
		{
			int arr[] = arrayFunction(size);
			swaplogic(arr);
			testcase--;
		}
	}
	
	public static int[] arrayFunction(int size)
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[size];
		System.out.print("Enter Values:- ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		return arr;
	}
	
	public static void swaplogic(int arr[])
	{
		for(int i=0,j=i+1;i<arr.length-1;i=i+2)
		{
			arr[i] = arr[i] + arr[j];
			arr[j] = arr[i] - arr[j];
			arr[i] = arr[i] - arr[j];
		}
		printArray(arr);
	}
	
	public static void printArray(int arr[])
	{	System.out.print("The Swapping Array:-  ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
	
	
}
