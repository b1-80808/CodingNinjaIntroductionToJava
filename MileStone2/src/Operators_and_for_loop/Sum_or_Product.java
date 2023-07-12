package Operators_and_for_loop;

import java.util.Scanner;

public class Sum_or_Product {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number:- ");
		int number = sc.nextInt();
		System.out.println("1.Sum of Numbers /n2.Product of Numbers");
		System.out.print("Choice:-");
		int choice = sc.nextInt();
		
		
		if(choice ==1)
		{
			int sum = 0;
			for(int i=1;i<=number;i++)
			{
				sum+=i;
			}
			System.out.println("Sum of Numbers are:- "+ sum);
		}
		else if(choice==2)
		{
			long mul = 1;
			for(int i=1;i<=number;i++)
			{
				mul = mul*i;
			}
			
			System.out.println("Multiplication of Numbers are:- "+mul);
		}else
		{
			System.out.println("Invalid Input");
		}
		
	}

}
