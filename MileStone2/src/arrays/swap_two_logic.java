package arrays;

import java.util.Scanner;

public class swap_two_logic {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Number1:- ");
		int num1 = sc.nextInt();
		System.out.println("Number2:- ");
		int num2 = sc.nextInt();
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("Number1:-" + num1 + "\nNumber2:-" + num2);
		
	}
}
