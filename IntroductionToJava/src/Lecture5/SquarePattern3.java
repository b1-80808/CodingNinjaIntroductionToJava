package Lecture5;

import java.util.Scanner;

public class SquarePattern3 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Number:- ");
		int num = sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=num;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
