package Lecture4;
import java.util.Scanner;
public class Fahrenheit_to_Celsius_Table {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Start Farenheit Value:- ");
		int s = scan.nextInt();
		System.out.println("End Farenheit Value:- ");
		int e = scan.nextInt();
		System.out.println("Step Size:- ");
		int w = scan.nextInt();
		int c;
		while(s<=e)
		{
			c =((s-32)*5)/9;
			System.out.println(s + "\t " + c);
			s = s+w;
		}
		}

}
