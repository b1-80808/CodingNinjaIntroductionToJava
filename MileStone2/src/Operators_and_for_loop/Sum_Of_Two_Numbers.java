package Operators_and_for_loop;
import java.util.*;

public class Sum_Of_Two_Numbers {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int number1 =0,number2 =0;
			while(true)
			{
				try {
					System.out.println("Enter first number : ");
					 number1 = sc.nextInt();
					System.out.println("Enter Second Number:- ");
					number2 = sc.nextInt();
					
				}catch(Exception e)
				{
					System.out.println("Enter Number in Integer Format Only!!!!!!!!");
			jlkjaskljdfljl
				}
			}
		int result = number1 + number2;
		System.out.println("Result " + result);
	}
}
