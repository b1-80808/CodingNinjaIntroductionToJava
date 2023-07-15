package Operators_and_for_loop;

import java.util.Scanner;

public class Sum_Two_Number {

	public static void main(String[] args) {
		System.out.print("Enter the Number:- ");
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		System.out.print("Number:- ");
		int number2 = sc.nextInt();
		
		int result = number1 + number2;
		System.out.println("=======================");
		System.out.print("Result- " + result);

	}

}
