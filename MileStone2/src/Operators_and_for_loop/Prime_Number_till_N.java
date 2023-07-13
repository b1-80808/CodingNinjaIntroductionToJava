package Operators_and_for_loop;

import java.util.Scanner;

public class Prime_Number_till_N {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Number:- ");
		int number = sc.nextInt();
		
		for(int i =2;i<=number;i++)
		{
			boolean isPrime = true;
			for(int j = 2;j<i;j++)
			{
				if(i%j==0)
				{
					isPrime = false;
					break;
				}
			}
			if(isPrime)
			{
				System.out.print(i + " ");
			}
		}
	
			
	}
}
