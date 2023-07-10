package Lecture4;

import java.util.Scanner;

public class SumOfEvenNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter the Number:- ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		int i = 1;
		while(i<=num)
		{
			if(i%2==0)
				sum+=i;
				
			i++;
		}
		System.out.println("Sum of Even Numbers till " + num + " are:- " + sum);

	}

}
