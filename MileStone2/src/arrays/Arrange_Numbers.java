package arrays;

import java.util.Scanner;

public class Arrange_Numbers {
	public static void main(String args[])
	{
//		System.out.println("Number Of Test Cases");
		
		Scanner sc = new Scanner(System.in);
		
//		int testcase =  sc.nextInt();
		arrangenumber();
//		while(testcase>=0)
//		{
//			
//			testcase--;
//		}
			
	}
	
	public static void  arrangenumber()
	{
		System.out.println("How many Integers do you want to print!!!");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int arr[] = input(number);
		output(arr);
	}
	
	public static int[] input(int number)
	{
		int arr[] = new int[number];
		int printNumber = 1;
		int i =0;
		int j = number-1;
		while(i<j)
		{
			arr[i] = printNumber;
			printNumber++;
			i++;
			
			arr[j] = printNumber;
			printNumber++;
			j--;
			if(i>j)
				break;
		}
		return arr;
	}
	
	public static void output(int arr[])
	{
		for(int i=0;i<=arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}
