package Operators_and_for_loop;

import java.util.Scanner;

public class Nth_Fibonacci_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number: - ");
		
		int number = sc.nextInt();
		int first = 0;
		int second = 1;
		int temp = 0;
		if(number == 1)
		{
			System.out.println("Fibonacci number:- 1");
		}else if(number==0)
		{
			System.out.println("Fibonacci Number:- 0");
		}
		else {
			for(int i=1;i<=number;i++)
			{
				temp = first + second;
				second = first;
				first = temp;
			}
			System.out.println("Fibonacchi Number:- " + temp);
		}
	}

}
