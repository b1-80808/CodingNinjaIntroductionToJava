package Lecture5;

import java.util.Scanner;

public class TrianglePattern3 {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Number:-");
		int number = input.nextInt();
		int p = 1;
		for(int i=1;i<=number;i++)//Row print
		{
			for(int j=1;j<=i;j++)//column print
			{
				System.out.print(p++ + " ");//Printing logic
			}
			System.out.println();
		}
	}
}
