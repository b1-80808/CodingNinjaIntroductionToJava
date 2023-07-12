package Lecture5;

import java.util.Scanner;

public class TrianglePattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number: ");
		int number = sc.nextInt();
		for(int i=1;i<=number;i++)//Row 
		{
			for(int j=1;j<=i;j++)//Column
			{
				System.out.print(j);//What to print
			}
			System.out.println();
		}
	}
}
