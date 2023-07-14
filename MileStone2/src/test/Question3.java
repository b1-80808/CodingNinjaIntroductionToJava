package test;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Test Cases:- ");
		int testCase = sc.nextInt();
		while(testCase>0)
		{
			System.out.print("Enter First Number:- ");
			int first = sc.nextInt();
			System.out.print("Enter Second Number:- ");
			int second = sc.nextInt();
			int GCD = 0;
			int low = Math.min(first, second);
			for(int i=2;i<=low;i++)
			{
				
				if(first%i==0 && second%i==0)
				{
					GCD = i;
				}
			}
			System.out.println("GCD:- "+ GCD);
			System.out.println("========================");
			testCase--;
		}
	}

}
