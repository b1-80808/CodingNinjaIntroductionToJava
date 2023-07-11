package Lecture4;

import java.util.Scanner;

public class Total_Salary {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Basic Salary:- ");
		int basic = sc.nextInt();
		System.out.println("Grade:- ");
		sc.nextLine();
		char ch = sc.next().charAt(0);
		float hra = 0.2f * basic;
		float da = 0.5f * basic;
		float pf = 0.11f * basic;
		int allow = 0;
		if(ch =='A')
		{
			allow = 1700;
		}
		else if(ch == 'B')
		{
			allow = 1500;
		}
		else if(ch == 'C')
		{
			allow =  1300;
		}
	
		float totalSalary = (basic + hra+ da  + allow) - pf;
		System.out.println("Total Salary:- "+Math.round(totalSalary));
	}
}
