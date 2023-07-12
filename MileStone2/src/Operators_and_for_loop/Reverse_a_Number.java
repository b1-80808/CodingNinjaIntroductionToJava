package Operators_and_for_loop;

import java.util.Scanner;

public class Reverse_a_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number:- ");
		int number  = sc.nextInt();
		int rem =0;
		int rev = 0;
		for(int i=1;number>=1;i++)
		{
			rem = number%10;
			rev =  rev * 10+ rem;
			number = number/10;
		}
		System.out.println("Reverse Number:- "  + rev);
	}

}
