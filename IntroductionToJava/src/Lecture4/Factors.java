package Lecture4;

import java.util.Scanner;

public class Factors {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Number:- ");
		int number = sc.nextInt();
		boolean flag = false;
		for(int i=2;i<number;i++)
		{
			if(number%i==0) {
				System.out.print(i + " ");
				flag = true;
			}
		}
		
		if(flag == false)
		{
			System.out.println("No Factors are possible.");
		}
	}
}
