package Lecture5;

import java.util.Scanner;

public class TrianglePattern5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Number:- ");
		int number = input.nextInt();
		for(int i=1;i<=number;i++)
		{
			int p = i;
			for(int j=1;j<=i;j++)
			{
				System.out.print(p--);
			}
			System.out.println();
		}
		
	}

}
