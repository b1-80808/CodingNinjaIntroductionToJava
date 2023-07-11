package Lecture4;

import java.util.Scanner;

public class FindPowerOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:-");
		int x = sc.nextInt();
		System.out.print("Enter the Power:- ");
		int n = sc.nextInt();
		int power = 1;
		for(int i = 1;i<=n;i++)
		{
			power*=x;
		}
		System.out.println("Anwer:- "+ power);
	}

}
