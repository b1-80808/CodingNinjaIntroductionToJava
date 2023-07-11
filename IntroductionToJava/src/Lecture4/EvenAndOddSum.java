package Lecture4;

import java.util.Scanner;

public class EvenAndOddSum {
	public static void main(String args[])
	{
		System.out.println("Number:- ");
		Scanner input = new Scanner(System.in);
		int num =  input.nextInt();
		int evensum = 0;
		int oddsum = 0;
		int rem = 0;
		while(num>0)
		{
			rem = num %10;
			if(rem %2 ==0 )
			{
				evensum+=rem;
			}else
			{
				oddsum +=rem;
			}
			num/=10;
		}
		
		System.out.println(evensum + " " + oddsum);
				
	}
}
