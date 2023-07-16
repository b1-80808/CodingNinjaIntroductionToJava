package Operators_and_for_loop;

import java.util.Scanner;

public class Mul_OF_Two {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number1");
		int number1 = sc.nextInt();
		System.out.println("Number2");
		int number2 = sc.nextInt();
		int result = number1*number2;
		System.out.println("Multiplication:- "+ result);
		int result1 = number1/number2;
		System.out.println("Division:- " + result1);

	}

}
