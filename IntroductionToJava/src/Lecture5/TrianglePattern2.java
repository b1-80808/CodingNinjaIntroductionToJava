package Lecture5;

import java.util.Scanner;

public class TrianglePattern2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number:- ");
		int number = sc.nextInt();
		for(int i=1;i<=number;i++)
		{
			int p = i;
			for(int j=1;j<=i;j++)
			{
				System.out.print(p++);
			}
			System.out.println();
		}
	}

}
