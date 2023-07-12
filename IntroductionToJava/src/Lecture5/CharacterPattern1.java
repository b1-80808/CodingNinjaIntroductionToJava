package Lecture5;

import java.util.Scanner;

public class CharacterPattern1 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Number:- ");
		int number = sc.nextInt();
		for(int i=1;i<=number;i++)
		{
			for(int j=1;j<=number;j++)
			{
				System.out.print((char)( 'A' + j -1));
			}
			System.out.println();
		}
	}
}
