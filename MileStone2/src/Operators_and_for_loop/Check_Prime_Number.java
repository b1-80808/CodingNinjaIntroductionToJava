package Operators_and_for_loop;

import java.util.Scanner;

public class Check_Prime_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number:- ");
		int number = sc.nextInt();
		for(int i=2;i<number;i++)
		{
			if(number % i == 0)
			{
				System.out.println(number + " is Not Prime.");
				return;			
			}
		}
		System.out.println(number + " is Prime.");
}

}