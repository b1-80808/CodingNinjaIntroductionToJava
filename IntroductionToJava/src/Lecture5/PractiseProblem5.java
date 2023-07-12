package Lecture5;

import java.util.Scanner;

public class PractiseProblem5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = input.nextInt();
		System.out.println(1);
		for(int i=2;i<=number;i++)
		{
			System.out.print(i-1);
			
			for(int j=1;j<=i-2;j++)
			{
				System.out.print(0);
			}
			
			System.out.println(i-1);
		}
	}

}
