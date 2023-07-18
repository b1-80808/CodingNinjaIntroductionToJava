package Operators_and_for_loop;

import java.util.Scanner;

public class Factorial_of_Number {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Number:- ");
		int number = sc.nextInt();
		int fact = 1;
		for(int i=number;i>=1;i--)
		{
			fact = fact * i;
		}
		System.out.println("Factorial of Number is: " + fact);
	}
}	
