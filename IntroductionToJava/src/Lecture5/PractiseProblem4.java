package Lecture5;

import java.util.Scanner;

public class PractiseProblem4 {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Number:- ");
		int number = input.nextInt();
		for(int i=1;i<=number;i++)
		{
			int num = number - i +1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(num++ + " ");
			}
			for(int k=1;k<=(number-i);k++)
			{
				System.out.print(5 + " ");
			}
			System.out.println();
		}
	}
}
