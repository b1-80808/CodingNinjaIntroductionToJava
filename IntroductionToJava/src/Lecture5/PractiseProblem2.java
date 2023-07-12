package Lecture5;

import java.util.Scanner;

public class PractiseProblem2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number: ");
		int number = sc.nextInt();
		for(int i=1;i<=number;i++)
		{
			for(int j=1;j<=number-i+1;j++)
			{
				System.out.print(j);
			}
	
			if(i!=1)
			{
				for(int l=1;l<i;l++)
				{
					System.out.print("**");
				}
			}
			
			for(int k=number-i+1;k>=1;k--)
			{
				System.out.print(k);
			}
			
			System.out.println();
		}
	}

}
