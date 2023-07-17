package function_variables_And_Their_Scope;

import java.util.Scanner;

public class Fibonacci_Number_Check {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Number:- ");
		int number = sc.nextInt();
		boolean check = fibonacci_check(number);
		if(check == true)
			System.out.println("Number occurs in Fibonacci Series!!!");
		else
			System.out.println("Number does not occurs in Fibonacci Series!!!");
	}
	
	public static boolean fibonacci_check(int number)
	{
		int temp,a = 0,b = 1;
		if(number ==0 || number ==1)
			return true;
		for(int i=1;i<=number;i++)
		{
			temp = a+b;
			if(number == temp)
				return true;
			a=b;
			b=temp;
		}
		return false;
		
	}
}
