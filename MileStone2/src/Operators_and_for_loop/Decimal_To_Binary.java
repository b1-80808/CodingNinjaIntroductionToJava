package Operators_and_for_loop;

import java.util.Scanner;

public class Decimal_To_Binary {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Number in Decimal:- ");
		int number = sc.nextInt();
		long binary = 0,pow = 1;
		while(number>0)
		{
			int rem = number%2;
			binary+=rem*pow;
			pow*=10;
			number = number/2;
		}
		System.out.print("Binary:-"+ binary);
	}
}
