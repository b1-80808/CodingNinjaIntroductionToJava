package Lecture4;

import java.util.Scanner;

public class Multiplication_Table {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Number:- ");
		int num = sc.nextInt();
		
		for (int i = 1 ;i<=10;i++)
		{
			System.out.println(num * i);
		}
	}
}
