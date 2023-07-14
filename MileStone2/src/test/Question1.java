package test;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number:-");
		int number = sc.nextInt();
		for(int i=1;i<=number;i++)
		{
			for(int j=1;j<=number-i;j++)
			{
				System.out.print(number-j+1 +" ");	
			}
			System.out.print("* ");
			
			int temp = i-1;
			for(int k=1;k<i;k++)
			{
				System.out.print(temp+ " ");
				temp--;
			}
			System.out.println();
		}

	}

}
