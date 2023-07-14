package Operators_and_for_loop;

import java.util.Scanner;

public class Decimal_To_Binary {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Number in Decimal Form:- ");
		int number = sc.nextInt();
		int rem = 0;
		int binary = 0;
		int reverse =0;
		while(number>0)
		{
			rem = number%2;
			binary = rem * 10 + binary;
			number = number/2;
		}
		while(binary>0)
		{
			rem = binary%10;
			reverse = reverse*10 + rem;
			binary = binary/10;
		}

		System.out.print("Binary Form :- "+ reverse);
	}

}
