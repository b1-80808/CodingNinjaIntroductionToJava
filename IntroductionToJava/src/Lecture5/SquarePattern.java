package Lecture5;

import java.util.Scanner;

public class SquarePattern {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Number:-");
		int num = input.nextInt();
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=num;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
