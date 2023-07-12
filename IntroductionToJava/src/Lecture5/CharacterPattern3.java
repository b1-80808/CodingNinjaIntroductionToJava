package Lecture5;

import java.util.Scanner;

public class CharacterPattern3 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Number: ");
		int number = sc.nextInt();
		for(int i=1;i<=number;i++)
		{
			char ch = (char)('A' + i -1);
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(ch+j-1));
			}
			System.out.println();
		}
	}
}
