package arrays;

import java.util.Scanner;

public class LinearSearch {		
	public static void main(String args[])
	{
		int arr[]=input();
		boolean isfound = linearSearch(arr);
		if(isfound==true)
			System.out.println("Element is found!!!");
		else
			System.out.println("Element is not found!!!");
	}
	
	public static int[] input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("How many numbers you want to add:- ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Element:- ");
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	
	public static boolean linearSearch(int arr[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Which Element you want to Search:- ");
		int key = sc.nextInt();
		
		for(int i=0;i<arr.length;i++)
		{
			if(key == arr[i])
				return true;
		}
		return false;
	}
}
