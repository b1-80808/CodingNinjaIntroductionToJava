package Lecture5;

import java.util.Scanner;

public class PractiseProblem3 {
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Number:- ");
		int number = scan.nextInt();
		for(int i=1;i<=number;i++)
		{
			for(int j=1;j<=(number-i+1);j++)
			{
				System.out.print((char)('A' + j - 1));
			}
			System.out.println();
		}
	}
}
