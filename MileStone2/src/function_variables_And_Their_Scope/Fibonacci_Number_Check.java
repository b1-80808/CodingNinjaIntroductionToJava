package function_variables_And_Their_Scope;

import java.util.Scanner;

public class Fibonacci_Number_Check {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Number:- ");
		int number = sc.nextInt();
		int a = 0;
		int b = 1;
		boolean result = false;
		int temp;
		if(number==a || number == b)
		{
			System.out.println("Number is Found in Fibonacci Series!!");
			result = true;
		}
		
		for(int i=1;i<=number;i++)
		{
			temp = a+b;
			if(number == temp)
			{
				System.out.println("Number is Found in Fibonacci Series!!");
				result = true;
				break;
			}
			a=b;
			b=temp;
		}
		if(result == false)
		System.out.println("Number is Not Found In Fibonacci Series!!!!");
	}
}
