package arrays;

import java.util.Scanner;

public class Largest_Number_In_Arr {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int arr[]= input();
		int largest = largestcompute(arr);
		System.out.println("Largest in the array:- " + largest);
	}
	
	public static int[] input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("How many Integers Do you want to Enter: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Element:- ");
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	
	public static int largestcompute(int arr[])
	{
		int largest = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(largest<arr[i])
				largest=arr[i];
		}
		return largest;
	}
}
