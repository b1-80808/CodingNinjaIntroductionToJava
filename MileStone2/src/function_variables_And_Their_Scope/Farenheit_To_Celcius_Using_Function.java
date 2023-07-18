package function_variables_And_Their_Scope;

import java.util.Scanner;

public class Farenheit_To_Celcius_Using_Function {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Start Farenheit Value:- ");
		int se = sc.nextInt();
		System.out.println("End Farenheit Value:-  ");
		int e = sc.nextInt();
		System.out.println("Steps Between Values:- ");
		int w = sc.nextInt();
		printFarenheitTable(se,e,w);
	}
	
	public static void printFarenheitTable(int startTemp,int EndTemp,int Gap)
	{
		for(;startTemp<=EndTemp;startTemp+=Gap)
		{
			int result =(int) ((5/9.0)*(startTemp - 32));
			System.out.println("Fahrenheit: " + startTemp + "\tCelcius: " + result);
		}
	}
}
