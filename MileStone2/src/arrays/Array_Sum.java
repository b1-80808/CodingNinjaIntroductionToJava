package arrays;

import java.util.Scanner;

public class Array_Sum {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array:- ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Element: ");
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum +=arr[i];
		}
		System.out.println("Sum of the Arrays is: "+ sum);
	}
}
