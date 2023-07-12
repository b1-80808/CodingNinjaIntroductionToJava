package Operators_and_for_loop;

import java.util.Scanner;

public class Terms_of_Ap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number:- ");
		int number = sc.nextInt();
		int count = 1;
		for(int i=1;count<=number;i++)
		{
			int term = (3 * i)+2;
			if(term % 4==0)
			{
				continue;
			}else {
				System.out.print(term + " ");
				count++;
			}
		}
	}

}
