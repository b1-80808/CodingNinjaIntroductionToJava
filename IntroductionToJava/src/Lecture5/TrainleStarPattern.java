package Lecture5;

import java.util.Scanner;

public class TrainleStarPattern {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Number:- ");
		int number = input.nextInt();
		for(int i=1;i<=number;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
